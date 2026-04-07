/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

/**
 *
 * @author Hyungs
 */
public class ManufacturingPartner extends Organization {
    
    //This constructor defines the organization name, its enterprise, and its supported role by passing the values to the parent Organization class.
    public ManufacturingPartner () {
        super("Manufacturing Partner", "Hardware and SupplyChain", "Production Manager");
    }
}
