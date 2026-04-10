/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Service;

import Business.Model.InventoryItem;
import Business.Organization.Organization;
import Business.WorkQueue.ComponentSupplyRequest;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class SupplierService {
    
    private final ArrayList<InventoryItem> inventoryItems;
    private final ArrayList<ComponentSupplyRequest> supplyRequests;

    public SupplierService() {
        this.inventoryItems = new ArrayList<>();
        this.supplyRequests = new ArrayList<>();
    }

    public void addInventoryItem(InventoryItem inventoryItem) {
        if (inventoryItem != null) {
            inventoryItems.add(inventoryItem);
        }
    }

    public ArrayList<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public ArrayList<ComponentSupplyRequest> getSupplyRequests() {
        return supplyRequests;
    }

    public ComponentSupplyRequest createSupplyRequest(String title, Organization senderOrganization, Organization receiverOrganization, String message) {
        ComponentSupplyRequest request = new ComponentSupplyRequest(title, senderOrganization, receiverOrganization, message);
        supplyRequests.add(request);
        return request;
    }
}
