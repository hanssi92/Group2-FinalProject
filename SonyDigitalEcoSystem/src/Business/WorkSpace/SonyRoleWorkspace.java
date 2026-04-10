/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkSpace;

import Business.Organization.ComponentSupplier;
import Business.Organization.ManufacturingPartner;
import Business.Organization.Organization;
import Business.Organization.Retailer;
import Business.Service.ProductionManagerService;
import Business.Service.RetailManagerService;
import Business.Service.SupplierService;
import Business.WorkQueue.ComponentSupplyRequest;
import Business.WorkQueue.RetailRestockRequest;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class SonyRoleWorkspace {
    
    private final SupplierService supplierService;
    private final ProductionManagerService productionManagerService;
    private final RetailManagerService retailManagerService;
    private final ComponentSupplier supplierOrganization;
    private final ManufacturingPartner manufacturingOrganization;
    private final Retailer retailerOrganization;
    private final ArrayList<ComponentSupplyRequest> supplyRequests;
    private final ArrayList<RetailRestockRequest> restockRequests;

    public SonyRoleWorkspace() {
        this.supplierService = new SupplierService();
        this.productionManagerService = new ProductionManagerService();
        this.retailManagerService = new RetailManagerService();
        this.supplierOrganization = new ComponentSupplier("Component Supplier Organization");
        this.manufacturingOrganization = new ManufacturingPartner("Manufacturing Partner Organization");
        this.retailerOrganization = new Retailer("Retailer Organization");
        this.supplyRequests = new ArrayList<>();
        this.restockRequests = new ArrayList<>();
    }

    public SupplierService getSupplierService() {
        return supplierService;
    }

    public ProductionManagerService getProductionManagerService() {
        return productionManagerService;
    }

    public RetailManagerService getRetailManagerService() {
        return retailManagerService;
    }

    public Organization getSupplierOrganization() {
        return supplierOrganization;
    }

    public Organization getManufacturingOrganization() {
        return manufacturingOrganization;
    }

    public Organization getRetailerOrganization() {
        return retailerOrganization;
    }

    public ArrayList<ComponentSupplyRequest> getSupplyRequests() {
        return supplyRequests;
    }

    public ArrayList<RetailRestockRequest> getRestockRequests() {
        return restockRequests;
    }

    public void addSupplyRequest(ComponentSupplyRequest request) {
        if (request != null) {
            supplyRequests.add(request);
        }
    }

    public void addRestockRequest(RetailRestockRequest request) {
        if (request != null) {
            restockRequests.add(request);
        }
    }
}

