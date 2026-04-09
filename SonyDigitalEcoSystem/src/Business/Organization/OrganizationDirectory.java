/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class OrganizationDirectory {
    
    private final ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createAndAddOrganization(String name, OrganizationType type) {
        Organization organization;
        switch (type) {
            case INTERACTIVE_ENTERTAINMENT:
                organization = new InteractiveEntertainment(name);
                break;
            case GAME_DEV_STUDIO:
                organization = new GameDevStudio(name);
                break;
            case COMPONENT_SUPPLIER:
                organization = new ComponentSupplier(name);
                break;
            case MANUFACTURING_PARTNER:
                organization = new ManufacturingPartner(name);
                break;
            case RETAILER:
                organization = new Retailer(name);
                break;
            case ONLINE_SERVICE_PROVIDER:
                organization = new OnlineServiceProvider(name);
                break;
            default:
                throw new IllegalStateException("Unsupported organization type: " + type);
        }

        addOrganization(organization);
        return organization;
    }

    public void addOrganization(Organization organization) {
        if (organization != null && !organizationList.contains(organization)) {
            organizationList.add(organization);
        }
    }

    public boolean removeOrganization(Organization organization) {
        return organizationList.remove(organization);
    }

    public Organization findOrganizationByName(String organizationName) {
        for (Organization organization : organizationList) {
            if (organization.getName().equalsIgnoreCase(organizationName)) {
                return organization;
            }
        }
        return null;
    }

    public Organization findOrganizationByType(OrganizationType organizationType) {
        for (Organization organization : organizationList) {
            if (organization.getType() == organizationType) {
                return organization;
            }
        }
        return null;
    }
}
