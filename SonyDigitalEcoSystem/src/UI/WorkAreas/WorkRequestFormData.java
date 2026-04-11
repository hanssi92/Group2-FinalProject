/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.WorkAreas;

/**
 *
 * @author Hyungs
 */
public class WorkRequestFormData {

    private final String requestId;
    private final String shortDescription;
    private final String description;
    private final String priority;
    private final String sourceEnterprise;
    private final String sourceOrganization;
    private final String targetEnterprise;
    private final String targetOrganization;
    private final String requestType;
    private final String assignedTo;
    private final String dueDate;

    public WorkRequestFormData(
            String requestId,
            String shortDescription,
            String description,
            String priority,
            String sourceEnterprise,
            String sourceOrganization,
            String targetEnterprise,
            String targetOrganization,
            String requestType,
            String assignedTo,
            String dueDate) {
        this.requestId = requestId;
        this.shortDescription = shortDescription;
        this.description = description;
        this.priority = priority;
        this.sourceEnterprise = sourceEnterprise;
        this.sourceOrganization = sourceOrganization;
        this.targetEnterprise = targetEnterprise;
        this.targetOrganization = targetOrganization;
        this.requestType = requestType;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getSourceEnterprise() {
        return sourceEnterprise;
    }

    public String getSourceOrganization() {
        return sourceOrganization;
    }

    public String getTargetEnterprise() {
        return targetEnterprise;
    }

    public String getTargetOrganization() {
        return targetOrganization;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getDueDate() {
        return dueDate;
    }
}
