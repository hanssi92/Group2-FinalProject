/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Organization.Organization;

/**
 *
 * @author Hyungs
 */
public class ComponentSupplyRequest extends WorkRequest {
    
    public ComponentSupplyRequest() {
        super();
    }

    public ComponentSupplyRequest(String title, Organization senderOrganization, Organization receiverOrganization, String message) {
        super();
        initialize(title, senderOrganization, receiverOrganization, message);
    }
}

