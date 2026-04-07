/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */

//Note: used abstract because Enterprise and Organization are meant to be base templates, not direct objects.
public abstract class Enterprise {
    
    private String name;
    private ArrayList<Organization> organizationList;
    
    public Enterprise(String name) {
        this.name = name;
        this.organizationList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void addOrganization(Organization organization) {
        if (organization != null && !organizationList.contains(organization)) {
            organizationList.add(organization);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}