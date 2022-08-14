package characterTests;

import characters.CharacterLevel;
import characters.Dwarf;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf gimli;
    Axe axe;

    @Before
    public void before() {
        axe = new Axe("Cleaver", 50);
        gimli = new Dwarf("Gimli", axe);
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", gimli.getName());
    }

    @Test
    public void canGetLevel() {
        assertEquals(CharacterLevel.ONE, gimli.getLevel());
    }

    @Test
    public void canGetHealthBar() {
        assertEquals(75, gimli.getHealth());
    }

    @Test
    public void startsWith0Experience() {
        assertEquals(0, gimli.getExperience());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(axe, gimli.getWeapon());
    }
}
