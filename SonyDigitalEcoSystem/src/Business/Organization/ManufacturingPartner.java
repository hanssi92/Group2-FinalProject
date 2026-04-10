/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.ProductionManager;

/**
 *
 * @author Hyungs
 */
public class ManufacturingPartner extends Organization {
    
    //This constructor defines the organization name, its enterprise, and its supported role by passing the values to the parent Organization class.
    public ManufacturingPartner() {
        this("Manufacturing Partner Organization");
    }

    public ManufacturingPartner(String name) {
        super(name, OrganizationType.MANUFACTURING_PARTNER);
        addRole(new ProductionManager());
    }
}


