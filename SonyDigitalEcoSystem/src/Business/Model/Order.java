/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

/**
 *
 * @author sumayyahhusain
 */
public class Order {
    
    private String orderId;
    private String itemName;
    private int quantity;
    private String fromEnterprise;
    private String status;
    private String orderDate;
    private String expectedDate;

    public Order() {
    }
    
    public Order(String orderId, String itemName, int quantity, String fromEnterprise, String status, String orderDate, String expectedDate) {
       this.orderId = orderId;
       this.itemName = itemName;
       this.quantity = quantity;
       this.fromEnterprise = fromEnterprise;
       this.status = status;
       this.orderDate = orderDate;
       this.expectedDate = expectedDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFromEnterprise() {
        return fromEnterprise;
    }

    public void setFromEnterprise(String fromEnterprise) {
        this.fromEnterprise = fromEnterprise;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }
}
