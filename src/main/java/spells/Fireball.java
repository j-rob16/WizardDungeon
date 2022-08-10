package spells;

import interfaces.ISpell;

public class Fireball extends Spell implements ISpell {
    public Fireball(int damage, int level) {
        super(damage, level);
    }

    @Override
    public int cast() {
        return this.getDamage() * this.getLevel();
    }
}
