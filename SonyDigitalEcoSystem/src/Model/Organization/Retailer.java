/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

/**
 *
 * @author Hyungs
 */
public class Retailer extends Organization {
    
    //This constructor defines the organization name, its enterprise, and its supported role by passing the values to the parent Organization class.
    public Retailer() {
        super("Retailer", "Partner and Service", "Retail Manger");
    }
}
