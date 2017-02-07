package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("chosen axe");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 10;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //TODO: Add the remaining weapons here

    }
}
