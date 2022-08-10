package characterTests;

import characters.Barbarian;
import characters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian conan;

    @Before
    public void before() {
        conan = new Barbarian("Conan");
    }

    @Test
    public void canGetName() {
        assertEquals("Conan", conan.getName());
    }

    @Test
    public void canGetLevel() {
        assertEquals(1, conan.getLevel());
    }

    @Test
    public void canGetHealthBar() {
        assertEquals(75, conan.getHealth());
    }

    @Test
    public void startsWith0Experience() {
        assertEquals(0, conan.getExperience());
    }
}
