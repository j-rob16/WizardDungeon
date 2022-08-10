package pets;

public abstract class Pet {
    private String name;
    private int healthBar;

    public Pet(String name, int healthBar) {
        this.name = name;
        this.healthBar = healthBar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(int healthBar) {
        this.healthBar = healthBar;
    }
}
