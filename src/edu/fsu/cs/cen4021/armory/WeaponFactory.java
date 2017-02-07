/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen4021.armory;

/**
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "Sword":
                return new Sword();
            case "Simple Arrow":
                return new SimpleArrow();
            case "Simple Axe":
                return new SimpleAxe();
            case "Simple Magic Staff":
                return new SimpleMagicStaff();
            case "The Chosen One Axe":
                return new TheChosenOneAx();
            case "Ancient Magic Staff":
                return new AncientMagicStaff();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
