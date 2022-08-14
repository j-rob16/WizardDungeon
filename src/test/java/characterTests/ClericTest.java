package characterTests;

import characters.CharacterLevel;
import characters.Cleric;
import characters.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric apollo;

    @Before
    public void before() {
        apollo = new Cleric("Apollo");
    }

    @Test
    public void canGetName() {
        assertEquals("Apollo", apollo.getName());
    }

    @Test
    public void canGetLevel() {
        assertEquals(CharacterLevel.ONE, apollo.getLevel());
    }

    @Test
    public void canGetHealthBar() {
        assertEquals(75, apollo.getHealth());
    }

    @Test
    public void startsWith0Experience() {
        assertEquals(0, apollo.getExperience());
    }
}
