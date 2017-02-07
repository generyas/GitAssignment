package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void PrintWeapon(String weaponName, int armor){
        Weapon aWeapon = WeaponFactory.getWeapon(weaponName);
        System.out.println(weaponName + " has " + aWeapon.hit() + " of damage.");
        System.out.println(weaponName + " was able to do " + aWeapon.hit(armor) + " of damage due to an armor with " + armor + " points.\n");
    }

    public static void main(String[] args) {
        PrintWeapon("Sword", 10);
        PrintWeapon("Simple Arrow", 10);
        PrintWeapon("Simple Axe", 10);
        PrintWeapon("Simple Axe", 20);
        PrintWeapon("Simple Magic Staff", 10);
        PrintWeapon("The Chosen One Axe", 10);
        PrintWeapon("The Chosen One Axe", 20);
        PrintWeapon("Ancient Magic Staff", 10);

    }
}
