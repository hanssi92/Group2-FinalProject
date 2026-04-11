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
    
    private String requestId;
    private String submittedBy;
    private String contentType;
    private String priority;
    
    public ContentPublishingRequest() {
        super();
    }

    public ContentPublishingRequest(String title, Organization senderOrganization, Organization receiverOrganization, String message) {
        super(title, senderOrganization, receiverOrganization, message);
    }

    public ContentPublishingRequest(
            String title,
            Organization senderOrganization,
            Organization receiverOrganization,
            String message,
            String requestId,
            String submittedBy,
            String contentType,
            String priority) {
        super(title, senderOrganization, receiverOrganization, message);
        this.requestId = requestId;
        this.submittedBy = submittedBy;
        this.contentType = contentType;
        this.priority = priority;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}

