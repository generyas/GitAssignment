package edu.fsu.cs.cen4021.armory;

/**
 * @author generyas
 */
class SimpleArrow extends BasicWeapon implements Weapon {

    SimpleArrow() {
        super(70);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        armor = armor - 5;
        if (armor < 0) {
            armor = 0;
        }
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
