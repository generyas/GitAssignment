package edu.fsu.cs.cen4021.armory;

/**
 * @author generyas
 */
class SimpleAxe extends BasicWeapon implements Weapon {

    SimpleAxe() {
        super(70);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if (armor > 0 && armor < 20) {
            armor = 0;
        }
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
