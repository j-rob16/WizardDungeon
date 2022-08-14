package interfaces;

import enemies.Enemy;
import weapons.Weapon;

public interface IFighter {
    void attack(Enemy enemy);
    double attackDamage();
    Weapon getWeapon();
}
