/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;


/**
 *
 * @author Hyungs
 */
public class InteractiveEntertainment extends Organization {

    public InteractiveEntertainment(String name) {
        super(name, OrganizationType.INTERACTIVE_ENTERTAINMENT);
        addRole(ContentManager());
    }
}
