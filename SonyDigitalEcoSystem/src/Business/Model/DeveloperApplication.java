/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

/**
 *
 * @author sumayyahhusain
 */
public class DeveloperApplication {
    
    private String applicantName;
    private String studioName;
    private String status;

    public DeveloperApplication() {
    }

    public DeveloperApplication(String applicantName, String studioName, String status) {
        this.applicantName = applicantName;
        this.studioName = studioName;
        this.status = status;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
