/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */

//Note: used abstract because Enterprise and Organization are meant to be base templates, not direct objects.
public abstract class Enterprise {
    
    private String name; 
    private EnterpriseType type;
    private final OrganizationDirectory organizationDirectory;
    private boolean active;
    
    protected Enterprise(String name, EnterpriseType type) {
        this.name = name;
        this.type = type;
        this.organizationDirectory = new OrganizationDirectory();
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public EnterpriseType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(EnterpriseType type) {
        this.type = type;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    public ArrayList<Organization> getOrganization() {
        return organizationDirectory.getOrganizationList();
    }
    
    public void addOrganization(Organization organization) {
        organizationDirectory.addOrganization(organization);
    }

    public boolean removeOrganization(Organization organization) {
        return organizationDirectory.removeOrganization(organization);
    }

    public Organization findOrganizationByName(String organizationName) {
        return organizationDirectory.findOrganizationByName(organizationName);
    }

    public Organization findOrganizationByType(OrganizationType organizationType) {
        return organizationDirectory.findOrganizationByType(organizationType);
    }

    public boolean containsOrganizationType(OrganizationType organizationType) {
        return findOrganizationByType(organizationType) != null;
    }

    public int getOrganizationCount() {
        return organizationDirectory.getOrganizationList().size();
    }

    public String getSummary() {
        return name + " (" + type + ") - organizations: " + organizationDirectory.getOrganizationList().size();
    }

    @Override
    public String toString() {
        return name;
    }
}
