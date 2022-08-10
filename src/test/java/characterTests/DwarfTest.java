package characterTests;

import characters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf gimli;

    @Before
    public void before() {
        gimli = new Dwarf("Gimli");
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", gimli.getName());
    }

    @Test
    public void canGetLevel() {
        assertEquals(1, gimli.getLevel());
    }

    @Test
    public void canGetHealthBar() {
        assertEquals(75, gimli.getHealth());
    }

    @Test
    public void startsWith0Experience() {
        assertEquals(0, gimli.getExperience());
    }
}
