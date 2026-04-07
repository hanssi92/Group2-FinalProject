/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Network;

import Model.Enterprise.Enterprise;
import Model.InventoryItem;
import Model.Order;
import Model.Organization.Organization;
import Model.User;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class SonyEcoSystem {
    
    private ArrayList<Enterprise> enterpriseList;
    private ArrayList<Organization> organizationList;
    private ArrayList<User> userList;
    private ArrayList<InventoryItem> supplierInventory;
    private ArrayList<InventoryItem> retailInventory;
    private ArrayList<Order> supplyRequestList;
    private ArrayList<Order> productionOrderList;
    private ArrayList<Order> restockRequestList;

    public SonyEcoSystem() {
        enterpriseList = new ArrayList<>();
        organizationList = new ArrayList<>();
        userList = new ArrayList<>();
        supplierInventory = new ArrayList<>();
        retailInventory = new ArrayList<>();
        supplyRequestList = new ArrayList<>();
        productionOrderList = new ArrayList<>();
        restockRequestList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public ArrayList<InventoryItem> getSupplierInventory() {
        return supplierInventory;
    }

    public ArrayList<InventoryItem> getRetailInventory() {
        return retailInventory;
    }

    public ArrayList<Order> getSupplyRequestList() {
        return supplyRequestList;
    }

    public ArrayList<Order> getProductionOrderList() {
        return productionOrderList;
    }

    public ArrayList<Order> getRestockRequestList() {
        return restockRequestList;
    }

    public void addEnterprise(Enterprise enterprise) {
        if (enterprise != null && !enterpriseList.contains(enterprise)) {
            enterpriseList.add(enterprise);
        }
    }

    public void addOrganization(Organization organization) {
        if (organization != null && !organizationList.contains(organization)) {
            organizationList.add(organization);
        }
    }

    public void addUser(User user) {
        if (user != null && !userList.contains(user)) {
            userList.add(user);
        }
    }

    public User authenticate(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equalsIgnoreCase(username)
                    && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}