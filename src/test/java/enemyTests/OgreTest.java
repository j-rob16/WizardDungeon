package enemyTests;

import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {
    Ogre ogre;

    @Before
    public void before() {
        ogre = new Ogre("Ogg", 10, 100);
    }

    @Test
    public void canGetOgreName() {
        assertEquals("Ogg", ogre.getName());
    }

    @Test
    public void canGetDamage() {
        assertEquals(10, ogre.getDamage());
    }

    @Test
    public void canGetOgreHealth() {
        assertEquals(100, ogre.getHealthBar());
    }

    @Test
    public void canGetOgreToAttack() {
        assertEquals(10, ogre.attack());
    }
}
