/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

/**
 *
 * @author Hyungs
 */
public class ProductionOrder {
    
    private final String orderId;
    private final String productName;
    private final int quantity;
    private ProductionOrderStatus status;

    public ProductionOrder(String orderId, String productName, int quantity, ProductionOrderStatus status) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public ProductionOrderStatus getStatus() {
        return status;
    }

    public void setStatus(ProductionOrderStatus status) {
        this.status = status;
    }
}
