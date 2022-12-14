package characterTests;

import characters.CharacterLevel;
import characters.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock saruman;

    @Before
    public void before() {
        saruman = new Warlock("Saruman");
    }

    @Test
    public void canGetName() {
        assertEquals("Saruman", saruman.getName());
    }

    @Test
    public void canGetLevel() {
        assertEquals(CharacterLevel.ONE, saruman.getLevel());
    }

    @Test
    public void canGetHealthBar() {
        assertEquals(75, saruman.getHealth());
    }

    @Test
    public void startsWith0Experience() {
        assertEquals(0, saruman.getExperience());
    }
}
