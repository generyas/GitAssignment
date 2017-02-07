package edu.fsu.cs.cen4021.armory;

/**
 * @author generyas
 */
class TheChosenOneAx extends BasicWeapon implements Weapon {

    TheChosenOneAx() {
        super(60);
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

    public int determineDamage(int baseDamage){
        return baseDamage;
    }

}
