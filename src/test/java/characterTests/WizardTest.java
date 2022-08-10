package characterTests;

import characters.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard gandalf;

    @Before
    public void before() {
        gandalf = new Wizard("Gandalf");
    }

    @Test
    public void canGetName() {
        assertEquals("Gandalf", gandalf.getName());
    }

    @Test
    public void canGetLevel() {
        assertEquals(1, gandalf.getLevel());
    }

    @Test
    public void canGetHealthBar() {
        assertEquals(75, gandalf.getHealth());
    }

    @Test
    public void startsWith0Experience() {
        assertEquals(0, gandalf.getExperience());
    }
}
