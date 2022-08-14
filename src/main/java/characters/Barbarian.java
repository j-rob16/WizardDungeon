package characters;

import enemies.Enemy;
import interfaces.IFighter;
import weapons.Weapon;

public class Barbarian extends Character implements IFighter {
    public Barbarian(String name) {
        super(name);
    }

    @Override
    public Weapon getWeapon() {
        return null;
    }

    @Override
    public double attackDamage() {
        return 0;
    }

    @Override
    public void attack(Enemy enemy) {

    }
}
