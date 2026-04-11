/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.RoleType;

/**
 *
 * @author Hyungs
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private RoleType roleType;
    private boolean active;

    public UserAccount() {
        this.active = true;
    }

    public UserAccount(String username, String password, Employee employee, RoleType roleType) {
        this.username = username;
        this.password = password;
        this.employee = employee;
        this.roleType = roleType;
        this.active = true;
        if (this.employee != null) {
            this.employee.setActive(true);
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public boolean isActive() {
        return active;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
        if (this.employee != null) {
            this.employee.setActive(active);
        }
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public void setActive(boolean active) {
        this.active = active;
        if (employee != null) {
            employee.setActive(active);
        }
    }

    @Override
    public String toString() {
        return username;
    }
}
