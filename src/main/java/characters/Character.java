package characters;

public abstract class Character {
    private String name;
    private CharacterLevel level = CharacterLevel.ONE;
    private int health = 75;
    private int experience = 0;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterLevel getLevel() {
        return this.level;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
