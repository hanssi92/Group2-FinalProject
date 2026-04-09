/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.GameDeveloper;


/**
 *
 * @author Hyungs
 */

public class GameDevStudio extends Organization {

    public GameDevStudio(String name) {
        super(name, OrganizationType.GAME_DEV_STUDIO);
        addRole(new GameDeveloper());
    }
}
