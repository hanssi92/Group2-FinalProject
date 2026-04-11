/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Organization.Organization;
import java.util.Date;

/**
 *
 * @author Hyungs
 */
public class WorkRequest {

    private String title;
    private Organization senderOrganization;
    private Organization receiverOrganization;
    private String message;
    private WorkRequestStatus status;
    private Date requestDate;
    private String requestId;
    private String priority;
    private String dueDate;
    private String assignedTo;
    private String requestType;

    public WorkRequest() {
        this.status = WorkRequestStatus.NEW;
        this.requestDate = new Date();
    }

    public WorkRequest(String title, Organization senderOrganization, Organization receiverOrganization, String message) {
        this();
        initialize(title, senderOrganization, receiverOrganization, message);
    }

    protected final void initialize(String title, Organization senderOrganization, Organization receiverOrganization, String message) {
        this.title = title;
        this.senderOrganization = senderOrganization;
        this.receiverOrganization = receiverOrganization;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Organization getSenderOrganization() {
        return senderOrganization;
    }

    public Organization getReceiverOrganization() {
        return receiverOrganization;
    }

    public String getMessage() {
        return message;
    }

    public WorkRequestStatus getStatus() {
        return status;
    }

    public void setStatus(WorkRequestStatus status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
}
