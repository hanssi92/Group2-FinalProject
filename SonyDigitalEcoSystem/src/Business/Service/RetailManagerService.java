/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Service;

import Business.Model.InventoryItem;
import Business.Model.PerformanceRecord;
import Business.Organization.Organization;
import Business.WorkQueue.RetailRestockRequest;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class RetailManagerService {

    private final ArrayList<InventoryItem> storeInventoryItems;
    private final ArrayList<PerformanceRecord> performanceRecords;
    private final ArrayList<RetailRestockRequest> restockRequests;

    public RetailManagerService() {
        this.storeInventoryItems = new ArrayList<>();
        this.performanceRecords = new ArrayList<>();
        this.restockRequests = new ArrayList<>();
    }

    public void addStoreInventoryItem(InventoryItem inventoryItem) {
        if (inventoryItem != null) {
            storeInventoryItems.add(inventoryItem);
        }
    }

    public void addPerformanceRecord(PerformanceRecord performanceRecord) {
        if (performanceRecord != null) {
            performanceRecords.add(performanceRecord);
        }
    }

    
    public RetailRestockRequest requestRestock(String title, Organization senderOrganization, Organization receiverOrganization, String message) {
        RetailRestockRequest request = new RetailRestockRequest();
        restockRequests.add(request);
        return request;
    }

    public ArrayList<InventoryItem> getStoreInventoryItems() {
        return storeInventoryItems;
    }

    public ArrayList<PerformanceRecord> getPerformanceRecords() {
        return performanceRecords;
    }

    public ArrayList<RetailRestockRequest> getRestockRequests() {
        return restockRequests;
    }
}

