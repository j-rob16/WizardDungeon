package characters;

public abstract class Character {
    private String name;
    private int level;
    private int health;
    private int experience;

    public Character(String name, int level, int health, int experience) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
