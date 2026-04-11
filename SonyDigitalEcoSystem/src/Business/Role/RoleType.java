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
    
    CONTENT_MANAGER("Content Manager"),
    PLAYER_OR_USER("Player / User"),
    GAME_DEVELOPER("Game Developer"),
    SUPPLIER_MANAGER("Supplier Manager"),
    PRODUCTION_MANAGER("Production Manager"),
    RETAIL_MANAGER("Retail Manager"),
    SUPPORT_AGENT("Support Agent"),
    PARTNER_MANAGER("Partner Manager");
    SYSTEM_ADMIN("System Admin");

    private final String displayName;

    RoleType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}

