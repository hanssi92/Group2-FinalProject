/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

/**
 *
 * @author Hyungs
 */
public class PerformanceRecord {
    
    private final String productName;
    private final int unitsSold;
    private final double revenue;

    public PerformanceRecord(String productName, int unitsSold, double revenue) {
        
        this.productName = productName;
        this.unitsSold = unitsSold;
        this.revenue = revenue;
    }

    public String getProductName() {
        return productName;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public double getRevenue() {
        return revenue;
    }
}

