/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sumayyahhusain
 */
public class User {
    
    String username; 
    String password;
    String roleName;
    String displayName;
    
    public User(String username, String password, String roleName, String displayName) {
        this.username = username; 
        this.password = password;
        this.roleName = roleName;
        this.displayName = displayName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDisplayName() {
        return displayName;
    }
    
}
