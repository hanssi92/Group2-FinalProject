/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

/**
 *
 * @author Hyungs
 */
public enum ProductionOrderStatus {
    
    PLANNED("Planned"),
    IN_PROGRESS("In Progress"),
    QUALITY_CHECK("Quality Check"),
    COMPLETED("Completed");

    private final String displayName;

    ProductionOrderStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isActive() {
        return this == IN_PROGRESS || this == QUALITY_CHECK;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
