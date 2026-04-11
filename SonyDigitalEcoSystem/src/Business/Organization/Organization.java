/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.Role.RoleType;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;


/**
 *
 * @author Hyungs
 */
public abstract class Organization {
    
    private String name;
    private final OrganizationType type;
    private final ArrayList<Role> supportedRoles;
    private final ArrayList<WorkRequest> workQueue;
    private final EmployeeDirectory employeeDirectory;
    private final UserAccountDirectory userAccountDirectory;
    private boolean active;

    
    //protected organization is the constructor used by child classes when they inherit from Organization
    protected Organization(String name, OrganizationType type) {
        
        this.name = name;
        this.type = type;
        this.supportedRoles = new ArrayList<>();
        this.workQueue = new ArrayList<>();
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public OrganizationType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Role> getSupportedRoles() {
        return supportedRoles;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void addRole(Role role) {
        if (role != null && !supportsRoleType(role.getType())) {
            supportedRoles.add(role);
        }
    }

    public boolean removeRole(RoleType roleType) {
        for (int i = 0; i < supportedRoles.size(); i++) {
            if (supportedRoles.get(i).getType() == roleType) {
                supportedRoles.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean supportsRoleType(RoleType roleType) {
        for (Role role : supportedRoles) {
            if (role.getType() == roleType) {
                return true;
            }
        }
        return false;
    }

    public Role findRole(RoleType roleType) {
        for (Role role : supportedRoles) {
            if (role.getType() == roleType) {
                return role;
            }
        }
        return null;
    }

    public ArrayList<WorkRequest> getWorkQueue() {
        return workQueue;
    }

    public void addWorkRequest(WorkRequest workRequest) {
        if (workRequest != null) {
            workQueue.add(workRequest);
        }
    }

    public boolean removeWorkRequest(WorkRequest workRequest) {
        return workQueue.remove(workRequest);
    }

    public int getWorkQueueSize() {
        return workQueue.size();
    }

    public String getSummary() {
        return name + " (" + type + ") - roles: " + supportedRoles.size()
                + ", employees: " + employeeDirectory.getEmployeeList().size()
                + ", userAccounts: " + userAccountDirectory.getUserAccountList().size()
                + ", workRequests: " + workQueue.size();
    }

    @Override
    public String toString() {
        return name;
    }
}
