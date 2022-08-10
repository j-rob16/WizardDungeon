package enemies;

public abstract class Enemy {
    private String name;
    private int damage;
    private int healthBar;

    public Enemy(String name, int damage, int healthBar) {
        this.name = name;
        this.damage = damage;
        this.healthBar = healthBar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(int healthBar) {
        this.healthBar = healthBar;
    }
}
