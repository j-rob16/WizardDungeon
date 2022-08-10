package weapons;

import interfaces.IAttacks;

public class Club extends Weapon implements IAttacks {
    public Club(String name, int damage) {
        super(name, damage);
    }

    @Override
    public int slice() {
        return this.getDamage() / 2;
    }

    @Override
    public int crunch() {
        return this.getDamage() * 2;
    }

    @Override
    public int hack() {
        return this.getDamage() / 2;
    }
}
