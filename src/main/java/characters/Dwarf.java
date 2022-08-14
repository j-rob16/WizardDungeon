package characters;

import enemies.Enemy;
import interfaces.IFighter;
import weapons.Weapon;

public class Dwarf extends Character implements IFighter {
    private Weapon weapon;
    public Dwarf(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public double attackDamage() {
        double damageMultiplier = this.getLevel().getDamageMultiplier();
        return damageMultiplier;
    }

    @Override
    public void attack(Enemy enemy) {

    }
}
