/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

/**
 *
 * @author Hyungs
 */
    
public enum OrganizationType {
    INTERACTIVE_ENTERTAINMENT("Interactive Entertainment"),
    GAME_DEV_STUDIO("Game Dev Studio"),
    COMPONENT_SUPPLIER("Component Supplier"),
    MANUFACTURING_PARTNER("Manufacturing Partner"),
    RETAILER("Retailer"),
    ONLINE_SERVICE_PROVIDER("Online Service Provider");

    private final String displayName;

    OrganizationType(String displayName) {
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
