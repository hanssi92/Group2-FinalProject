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
    private String supplierName;
    private String startDate;
    private String endDate;
    private ProductionOrderStatus status;

    public ProductionOrder(String orderId, String productName, int quantity, ProductionOrderStatus status) {
        this(orderId, productName, quantity, "", "", "", status);
    }

    public ProductionOrder(String orderId, String productName, int quantity, String supplierName, String startDate, String endDate, ProductionOrderStatus status) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.supplierName = supplierName;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ProductionOrderStatus getStatus() {
        return status;
    }

    public void setStatus(ProductionOrderStatus status) {
        this.status = status;
    }
}
