package rooms;

import enemies.Enemy;
import interfaces.IRoom;

import java.util.ArrayList;

public class EnemyRoom extends Room implements IRoom {
    private ArrayList<Enemy> enemies;
    public EnemyRoom(String name) {
        super(name);
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
    public void getExperience() {

    }
}
