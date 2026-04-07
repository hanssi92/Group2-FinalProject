/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Network;

import Model.InventoryItem;
import Model.Order;
import Model.User;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class SonyEcoSystem {
    
    private ArrayList<User> users;
    private ArrayList<InventoryItem> supplierInventory;
    private ArrayList<InventoryItem> retailInventory;
    private ArrayList<Order> supplyRequests;
    private ArrayList<Order> productionOrders;
    private ArrayList<Order> restockRequests;
    
    public SonyEcoSystem() {
        this.users = new ArrayList<>();
        this.supplierInventory = new ArrayList<>();
        this.retailInventory = new ArrayList<>();
        this.supplyRequests = new ArrayList<>();
        this.productionOrders = new ArrayList<>();
        this.restockRequests = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<InventoryItem> getSupplierInventory() {
        return supplierInventory;
    }

    public ArrayList<InventoryItem> getRetailInventory() {
        return retailInventory;
    }

    public ArrayList<Order> getSupplyRequests() {
        return supplyRequests;
    }

    public ArrayList<Order> getProductionOrders() {
        return productionOrders;
    }

    public ArrayList<Order> getRestockRequests() {
        return restockRequests;
    }

    public User authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)
                    && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

