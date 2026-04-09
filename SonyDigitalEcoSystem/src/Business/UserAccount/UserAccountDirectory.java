/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.RoleType;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class UserAccountDirectory {
    
    private final ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void addUserAccount(UserAccount userAccount) {
        if (userAccount != null && !userAccountList.contains(userAccount)) {
            userAccountList.add(userAccount);
        }
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount userAccount : userAccountList) {
            if (userAccount.getUsername().equalsIgnoreCase(username)) {
                return false;
            }
        }
        return true;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, RoleType roleType) {
        UserAccount userAccount = new UserAccount(username, password, employee, roleType);
        addUserAccount(userAccount);
        return userAccount;
    }
}
