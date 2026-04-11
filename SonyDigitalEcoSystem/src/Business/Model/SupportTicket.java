/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

/**
 *
 * @author sumayyahhusain
 */
public class SupportTicket {
    
    private String ticketId;
    private String playerName;
    private String issueSummary;
    private String priority;
    private String status;
    private String assignedTo;
    private String createdDate;

    public SupportTicket(String ticketId, String issueSummary, String status) {
        this(ticketId, "", issueSummary, "", status, "", "");
    }

    public SupportTicket(String ticketId, String playerName, String issueSummary, String priority, String status, String assignedTo, String createdDate) {
        this.ticketId = ticketId;
        this.playerName = playerName;
        this.issueSummary = issueSummary;
        this.priority = priority;
        this.status = status;
        this.assignedTo = assignedTo;
        this.createdDate = createdDate;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getIssueSummary() {
        return issueSummary;
    }

    public void setIssueSummary(String issueSummary) {
        this.issueSummary = issueSummary;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}

