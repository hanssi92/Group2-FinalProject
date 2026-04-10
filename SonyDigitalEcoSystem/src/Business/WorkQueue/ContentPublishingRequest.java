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
public class ContentPublishingRequest extends WorkRequest {
    
    public ContentPublishingRequest() {
        super();
    }

    public ContentPublishingRequest(String title, Organization senderOrganization, Organization receiverOrganization, String message) {
        initialize(title, senderOrganization, receiverOrganization, message);
    }
}
