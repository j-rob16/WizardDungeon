package spellTests;

import org.junit.Before;
import org.junit.Test;
import spells.Fireball;

import static org.junit.Assert.assertEquals;

public class FireballTest {
    Fireball fireball;

    @Before
    public void before() {
        fireball = new Fireball(10, 1);
    }

    @Test
    public void canGetSpellDamage() {
        assertEquals(10, fireball.getDamage());
    }

    @Test
    public void canGetSpellLevel() {
        assertEquals(1, fireball.getLevel());
    }

    @Test
    public void canLevelUpSpell() {
        fireball.levelUp();
        assertEquals(2, fireball.getLevel());
    }

    @Test
    public void canDoubleDamageAtLevel2() {
        fireball.levelUp();
        assertEquals(20, fireball.cast());
    }
}
