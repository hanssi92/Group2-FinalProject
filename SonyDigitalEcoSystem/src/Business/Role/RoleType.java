/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author Hyungs
 */
public enum RoleType {
    
    CONTENT_MANAGER("Content Manager", "CM"),
    PLAYER_OR_USER("Player / User", "PL"),
    GAME_DEVELOPER("Game Developer", "GD"),
    SUPPLIER_MANAGER("Supplier Manager", "SU"),
    PRODUCTION_MANAGER("Production Manager", "PM"),
    RETAIL_MANAGER("Retail Manager", "RM"),
    SUPPORT_AGENT("Support Agent", "SA"),
    PARTNER_MANAGER("Partner Manager", "PA"),
    SYSTEM_ADMIN("System Admin", "AD");

    private final String displayName;
    private final String employeeCodePrefix;

    RoleType(String displayName, String employeeCodePrefix) {
        this.displayName = displayName;
        this.employeeCodePrefix = employeeCodePrefix;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmployeeCodePrefix() {
        return employeeCodePrefix;
    }

    @Override
    public String toString() {
        return displayName;
    }
}

