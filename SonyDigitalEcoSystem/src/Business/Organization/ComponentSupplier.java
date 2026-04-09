/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.SupplierManager;

/**
 *
 * @author Hyungs
 */
public class ComponentSupplier extends Organization {
    
    //This constructor defines the organization name, its enterprise, and its supported role by passing the values to the parent Organization class.
    public ComponentSupplier() {
        this("Component Supplier Organization");
    }

    public ComponentSupplier(String name) {
        super(name, OrganizationType.COMPONENT_SUPPLIER);
        addRole(new SupplierManager());
    }
}

