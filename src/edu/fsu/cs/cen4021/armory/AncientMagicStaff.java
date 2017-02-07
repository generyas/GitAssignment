package edu.fsu.cs.cen4021.armory;

import java.io.*;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.pow;

/**
 * @author generyas
 */
class AncientMagicStaff extends BasicWeapon implements Weapon {

    AncientMagicStaff() {
        super(0);
    }

    @Override
    public int hit() {
        return determineDamage(DAMAGE);
    }

    @Override
    public int hit(int armor) {
        armor = (armor * 3) / 4;
        int damage = determineDamage(DAMAGE) - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

    private int determineDamage(int baseDamage){
        File ancientFile;
        List<Integer> ancientIntList;
        try {
            ancientFile = new File("conf/ancientstaff.obj");
            FileInputStream ancientFileStream = new FileInputStream(ancientFile);
            ObjectInputStream ancientObjectStream = new ObjectInputStream(ancientFileStream);
            ancientIntList = (List<Integer>) ancientObjectStream.readObject();
        }
        catch (Exception e) {
            System.out.println("Here");
            return baseDamage;
        }

        ancientIntList.remove(4);
        ancientIntList.remove(1);
        for (int i=0; i < ancientIntList.size(); i++) {
            ancientIntList.set(i, (int)pow(ancientIntList.get(i), 2));
        }
        Collections.reverse(ancientIntList);

        return ancientIntList.get(0) + ancientIntList.get(2) + ancientIntList.get(6);
    }
}
