package characterTests;

import characters.Barbarian;
import characters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight arthur;

    @Before
    public void before() {
        arthur = new Knight("Arthur");
    }

    @Test
    public void canGetName() {
        assertEquals("Arthur", arthur.getName());
    }

    @Test
    public void canGetLevel() {
        assertEquals(1, arthur.getLevel());
    }

    @Test
    public void canGetHealthBar() {
        assertEquals(75, arthur.getHealth());
    }

    @Test
    public void startsWith0Experience() {
        assertEquals(0, arthur.getExperience());
    }
}
