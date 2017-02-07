package edu.fsu.cs.cen4021.armory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author generyas
 */
class TheChosenOneAx extends BasicWeapon implements Weapon {

    TheChosenOneAx() {
        super(0);
    }

    @Override
    public int hit() {
        return determineDamage(DAMAGE);
    }

    @Override
    public int hit(int armor) {
        if (armor > 0 && armor < 20) {
            armor = 0;
        }
        int damage = determineDamage(DAMAGE) - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

    private int determineDamage(int baseDamage){
        String strA = "";
        String strB = "";
        String line;
        int lineNo = 0;

        FileReader chosenFileReader;
        try {
            chosenFileReader = new FileReader("conf/thechosenone.txt");
        }
        catch (FileNotFoundException e) {
            return baseDamage;
        }
        Scanner chosenScanner = new Scanner(chosenFileReader);

        while (chosenScanner.hasNextLine()){
            line = chosenScanner.nextLine();
            lineNo++;

            if (Objects.equals(strA,"")){
                strA = line;
            }
            else if (Objects.equals(strB,"") && !Objects.equals(line, strA)){
                strB = line;
            }
            else if(!Objects.equals(strA,"") && !Objects.equals(strB,"")){
                if (Objects.equals(line, strA)){
                    return lineNo - 1;
                }
                if (Objects.equals(line, strB)){
                    return lineNo - 2;
                }
            }
        }
        if(!Objects.equals(strA,"") && !Objects.equals(strB,"")) {
            return lineNo;
        }

        return baseDamage;
    }
}