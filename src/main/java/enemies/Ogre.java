package enemies;

import interfaces.IEnemyAttack;

public class Ogre extends Enemy implements IEnemyAttack {
    public Ogre(String name, int damage, int healthBar) {
        super(name, damage, healthBar);
    }

    @Override
    public int attack() {
        return this.getDamage();
    }
}
