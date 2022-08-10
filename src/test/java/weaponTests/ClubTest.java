package weaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class ClubTest {
    Club club;

    @Before
    public void before() {
        club = new Club("Mjollnir", 10);
    }

    @Test
    public void canGetSwordName() {
        assertEquals("Mjollnir", club.getName());
    }

    @Test
    public void canGetNormalDamage() {
        assertEquals(10, club.getDamage());
    }

    @Test
    public void canGetHalfSliceDamage() {
        assertEquals(5, club.slice());
    }

    @Test
    public void canGetDoubleCrunchDamage() {
        assertEquals(20, club.crunch());
    }

    @Test
    public void canGetHalfHackDamage() {
        assertEquals(5, club.hack());
    }
}
