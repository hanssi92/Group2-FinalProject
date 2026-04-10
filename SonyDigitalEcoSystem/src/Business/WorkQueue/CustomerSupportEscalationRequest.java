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
public class CustomerSupportEscalationRequest extends WorkRequest {
    
    public CustomerSupportEscalationRequest() {
        super();
    }

    public CustomerSupportEscalationRequest(String title, Organization senderOrganization, Organization receiverOrganization, String message) {
        super(title, senderOrganization, receiverOrganization, message);
    }
}

