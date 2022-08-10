package spells;

public abstract class Spell {
    private int damage;
    private int level;

    public Spell(int damage, int level) {
        this.damage = damage;
        this.level = level;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        this.setLevel(this.level + 1);
    }
}
