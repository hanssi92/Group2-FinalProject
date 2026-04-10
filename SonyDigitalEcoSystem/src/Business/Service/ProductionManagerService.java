/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Service;

import Business.Model.ProductionOrder;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class ProductionManagerService {
    
    private final ArrayList<ProductionOrder> productionOrders;

    public ProductionManagerService() {
        this.productionOrders = new ArrayList<>();
    }

    public void addProductionOrder(ProductionOrder productionOrder) {
        if (productionOrder != null) {
            productionOrders.add(productionOrder);
        }
    }

    public ArrayList<ProductionOrder> getProductionOrders() {
        return productionOrders;
    }
}
