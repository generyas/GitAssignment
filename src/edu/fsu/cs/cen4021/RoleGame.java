package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    private static void PrintWeapon(String weaponName, int armor){
        Weapon aWeapon = WeaponFactory.getWeapon(weaponName);
        System.out.println(weaponName + " has " + aWeapon.hit() + " of damage.");
        System.out.println(weaponName + " was able to do " + aWeapon.hit(armor) + " of damage due to an armor with " + armor + " points.\n");
    }

    public static void main(String[] args) {
        PrintWeapon("Sword", 20);
        PrintWeapon("Simple Arrow", 20);
        PrintWeapon("Simple Axe", 20);
        PrintWeapon("Simple Magic Staff", 20);
        PrintWeapon("The Chosen One Axe", 20);
        PrintWeapon("Ancient Magic Staff", 20);
        PrintWeapon("Ritual Web Arrow", 20);
    }
}
