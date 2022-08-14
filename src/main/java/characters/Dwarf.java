package characters;

import enemies.Enemy;
import interfaces.IFighter;
import weapons.Fists;
import weapons.Weapon;

public class Dwarf extends Character implements IFighter {
    private Weapon weapon = new Fists("Fists", 5);
    public Dwarf(String name) {
        super(name);
    }

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public double attackDamage() {
        int weaponDamage = this.getWeapon().getDamage();
        int weaponLevel = this.getWeapon().getLevel();
        double damageMultiplier = this.getLevel().getDamageMultiplier();
        return weaponDamage * weaponLevel * damageMultiplier;
    }

    @Override
    public void attack(Enemy enemy) {

    }
}
