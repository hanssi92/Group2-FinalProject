/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author Hyungs
 */
public enum EnterpriseType {
    DIGITAL_ENTERTAINMENT("Digital Entertainment"),
    HARDWARE_AND_SUPPLY_CHAIN("Hardware and Supply Chain"),
    PARTNER_AND_SERVICE("Partner and Service");

    private final String displayName;

    EnterpriseType(String displayName) {
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
