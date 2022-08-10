package weaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class AxeTest {
    Axe axe;

    @Before
    public void before() {
        axe = new Axe("Viking Axe", 10);
    }

    @Test
    public void canGetSwordName() {
        assertEquals("Viking Axe", axe.getName());
    }

    @Test
    public void canGetNormalDamage() {
        assertEquals(10, axe.getDamage());
    }

    @Test
    public void canGetHalfSliceDamage() {
        assertEquals(5, axe.slice());
    }

    @Test
    public void canGetHalfCrunchDamage() {
        assertEquals(5, axe.crunch());
    }

    @Test
    public void canGetDoubleHackDamage() {
        assertEquals(20, axe.hack());
    }
}
