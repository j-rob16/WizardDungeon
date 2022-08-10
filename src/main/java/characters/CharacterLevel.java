package characters;

public enum CharacterLevel {
    ONE(1,1.2, 1.1),
    TWO(2,1.4, 1.2),
    THREE(3,1.6, 1.3),
    FOUR(4,1.8, 1.4),
    FIVE(5,2, 1.5);

    CharacterLevel(int level, double healthMultiplier, double damageMultiplier) {
        this.level = level;
        this.healthMultiplier = healthMultiplier;
        this.damageMultiplier = damageMultiplier;
    }
    private final int level;
    private final double healthMultiplier;
    private final double damageMultiplier;
}
