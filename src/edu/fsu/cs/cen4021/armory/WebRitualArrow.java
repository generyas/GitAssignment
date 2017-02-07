package edu.fsu.cs.cen4021.armory;

import java.net.URL;
import java.util.Scanner;

/**
 * @author generyas
 */
class WebRitualArrow extends BasicWeapon implements Weapon {

    WebRitualArrow() {
        super(0);
    }

    @Override
    public int hit() {
        return determineDamage(DAMAGE);
    }

    @Override
    public int hit(int armor) {
        armor = armor - 10;
        if (armor < 0) {
            armor = 0;
        }
        int damage = determineDamage(DAMAGE) - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

    private int determineDamage(int baseDamage) {
        String line;

        Scanner webScanner;
        try {
            URL webUrl = new URL("http://ww2.cs.fsu.edu/~escobara/courses/cen4021.html");
            webScanner = new Scanner(webUrl.openStream());
        }
        catch (Exception e) {
            return baseDamage;
        }

        while (webScanner.hasNextLine()) {
            line = webScanner.nextLine();
            if (line.contains("<h1>")) {
                line = line.substring(4, line.length() - 5);
                return Integer.parseInt(line);
            }
        }

        return baseDamage;
    }
}
