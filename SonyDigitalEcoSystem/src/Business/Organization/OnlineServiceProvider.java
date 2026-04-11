/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.PartnerManager;
import Business.Role.SupportAgent;
import Business.Role.SystemAdmin;

/**
 *
 * @author Hyungs
 */
public class OnlineServiceProvider extends Organization {

    public OnlineServiceProvider() {
        this("Online Service Provider Organization");
    }

    public OnlineServiceProvider(String name) {
        super(name, OrganizationType.ONLINE_SERVICE_PROVIDER);
        addRole(new SupportAgent());
        addRole(new PartnerManager());
        addRole(new SystemAdmin());
    }
}
