package rooms;

import enemies.Enemy;
import interfaces.IExperience;

import java.util.ArrayList;

public class EnemyRoom extends Room implements IExperience {
    private ArrayList<Enemy> enemies;
    public EnemyRoom(String name, int availableExperience) {
        super(name, availableExperience);
        this.enemies = new ArrayList<>();
    }

    public int getEnemyNumbers() {
        return enemies.size();
    }
    public Enemy getEnemy() {
        Enemy enemy = null;
        if (getEnemyNumbers() > 0) {
            enemy = enemies.get(0);
        }
        return enemy;
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }

    @Override
    public int getExperience() {
        return this.getAvailableExperience();
    }
}
