package weaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Fists;

import static org.junit.Assert.assertEquals;

public class FistsTest {

    Fists fists;

    @Before
    public void before() {
        fists = new Fists("Fists", 5);
    }

    @Test
    public void canGetFists() {
        assertEquals("Fists", fists.getName());
    }

    @Test
    public void canGetFistDamage() {
        assertEquals(5, fists.getDamage());
    }
}
