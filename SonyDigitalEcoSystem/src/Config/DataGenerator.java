/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import Model.InventoryItem;
import Model.Order;
import Model.Roles.ProductionManager;
import Model.Roles.RetailManager;
import Model.Roles.Supplier;
import Model.Network.SonyEcoSystem;
import java.lang.reflect.Method;
import java.util.Random;

/**
 *
 * @author sumayyahhusain
 */

// private final is used to show that a field is only used inside the class and should not be reassigned after initialization
public class DataGenerator {
    
    private final Random random;
    
    public DataGenerator() {
        this.random = new Random();
    }
    
    public SonyEcoSystem generateSystem() {
        SonyEcoSystem system = new SonyEcoSystem();
        
        system.getUsers().add(new Supplier("supplier", "supplier123", "Alex Supplier"));
        system.getUsers().add(new ProductionManager("production", "production123", "Morgan Production"));
        system.getUsers().add(new RetailManager("retail", "retail123", "Taylor Retail"));

        for (int i = 0; i < 6; i++) {
            system.getSupplierInventory().add(new InventoryItem(
                    fakeProduct("component"),
                    "Hardware Component",
                    randomBetween(50, 300),
                    "Component Supplier Warehouse"
            ));
        }

        for (int i = 0; i < 6; i++) {
            system.getRetailInventory().add(new InventoryItem(
                    fakeProduct("retail"),
                    "Retail Product",
                    randomBetween(10, 150),
                    "Retail Store"
            ));
        }

        for (int i = 0; i < 5; i++) {
            system.getSupplyRequests().add(new Order(
                    "SR-" + (1000 + i),
                    "Supply " + fakeProduct("component"),
                    "ComponentSupplier",
                    "ManufacturingPartner",
                    i == 0 ? "Approved" : (i == 1 ? "Rejected" : "Pending"),
                    fakePhrase("component")
            ));
        }

        for (int i = 0; i < 5; i++) {
            system.getProductionOrders().add(new Order(
                    "PO-" + (2000 + i),
                    "Build " + fakeProduct("console"),
                    "GameDevStudio",
                    "ManufacturingPartner",
                    i % 2 == 0 ? "In Progress" : "Planned",
                    fakePhrase("production")
            ));
        }

        for (int i = 0; i < 4; i++) {
            system.getRestockRequests().add(new Order(
                    "RR-" + (3000 + i),
                    "Restock " + fakeProduct("retail"),
                    "Retailer",
                    "ManufacturingPartner",
                    i == 0 ? "Pending" : "New",
                    fakePhrase("restock")
            ));
        }

        return system;
    }

    private int randomBetween(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    private String fakeProduct(String type) {
        String fakerValue = invokeJavaFaker(type);
        if (fakerValue != null && !fakerValue.isBlank()) {
            return fakerValue;
        }

        String[] components = {"GPU Chipset", "Audio Module", "Cooling Fan", "Sensor Board", "Display Panel"};
        String[] consoles = {"PS Console", "VR Headset", "Portable Device", "Controller Bundle"};
        String[] retail = {"PS5 Slim", "DualSense", "VR2 Bundle", "Pulse Headset", "Gift Card"};

        if ("component".equals(type)) {
            return components[random.nextInt(components.length)];
        }
        if ("console".equals(type)) {
            return consoles[random.nextInt(consoles.length)];
        }
        return retail[random.nextInt(retail.length)];
    }

    private String fakePhrase(String type) {
        String fakerValue = invokeJavaFaker("phrase");
        if (fakerValue != null && !fakerValue.isBlank()) {
            return fakerValue;
        }

        if ("component".equals(type)) {
            return "Batch request for the next manufacturing cycle";
        }
        if ("production".equals(type)) {
            return "Manufacture units for the seasonal launch plan";
        }
        return "Inventory replenishment request based on store demand";
    }

    private String invokeJavaFaker(String mode) {
        try {
            Class<?> fakerClass = Class.forName("com.github.javafaker.Faker");
            Object faker = fakerClass.getDeclaredConstructor().newInstance();

            if ("phrase".equals(mode)) {
                Method companyMethod = fakerClass.getMethod("company");
                Object company = companyMethod.invoke(faker);
                Method buzzwordMethod = company.getClass().getMethod("buzzword");
                return String.valueOf(buzzwordMethod.invoke(company));
            }

            Method commerceMethod = fakerClass.getMethod("commerce");
            Object commerce = commerceMethod.invoke(faker);
            Method productMethod = commerce.getClass().getMethod("productName");
            return String.valueOf(productMethod.invoke(commerce));
        } catch (Exception ex) {
            return null;
        }
    }
}

