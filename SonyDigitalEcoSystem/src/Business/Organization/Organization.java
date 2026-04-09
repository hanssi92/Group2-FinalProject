/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Model.User;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public abstract class Organization {
    
    private String name;
    private String enterpriseName;
    private String supportedRoleName;
    
    private ArrayList<User> users;
    
    //protected organization is the constructor used by child classes when they inherit from Organization
    protected Organization(String name, String enterpriseName, String supportedRoleName) {
        this.name = name;
        this.enterpriseName = enterpriseName;
        this.supportedRoleName = supportedRoleName;
        this.users = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public String getSupportedRoleName() {
        return supportedRoleName;
    }

    public boolean supportsRole(String roleName) {
        return supportedRoleName != null && supportedRoleName.equalsIgnoreCase(roleName);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public boolean addUser(User user) {
        if (user != null && supportsRole(user.getRoleName()) && !users.contains(user)) {
            users.add(user);
            return true;
        }
        return false;
    }
}

