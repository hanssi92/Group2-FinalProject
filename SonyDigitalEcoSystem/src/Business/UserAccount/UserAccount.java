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

    public UserAccount() {
    }

    public UserAccount(String username, String password, Employee employee, RoleType roleType) {
        this.username = username;
        this.password = password;
        this.employee = employee;
        this.roleType = roleType;
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
}