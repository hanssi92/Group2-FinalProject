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
    
    private final String itemName;
    private final int unitsSold;
    private final double revenue;

    public PerformanceRecord(String itemName, int unitsSold, double revenue) {
        this.itemName = itemName;
        this.unitsSold = unitsSold;
        this.revenue = revenue;
    }

    public String getItemName() {
        return itemName;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public double getRevenue() {
        return revenue;
    }
}