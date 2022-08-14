package characters;

import enemies.Enemy;
import interfaces.IFighter;
import weapons.Fists;
import weapons.Weapon;

public class Barbarian extends Character implements IFighter {
    private Weapon weapon = new Fists("Fists", 5);
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
