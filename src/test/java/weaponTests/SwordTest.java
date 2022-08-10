package weaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    Sword sword;

    @Before
    public void before() {
        sword = new Sword("Longsword", 10);
    }

    @Test
    public void canGetSwordName() {
        assertEquals("Longsword", sword.getName());
    }

    @Test
    public void canGetNormalDamage() {
        assertEquals(10, sword.getDamage());
    }

    @Test
    public void canGetDoubleSliceDamage() {
        assertEquals(20, sword.slice());
    }

    @Test
    public void canGetHalfCrunchDamage() {
        assertEquals(5, sword.crunch());
    }

    @Test
    public void canGetHalfHackDamage() {
        assertEquals(5, sword.hack());
    }

    @Test
    public void canGetWeaponValue() {
        assertEquals(10, sword.getValue());
    }
}
