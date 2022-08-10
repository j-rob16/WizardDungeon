package petTests;

import org.junit.Before;
import org.junit.Test;
import pets.Dragon;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Smaug", 250);
    }

    @Test
    public void canGetDragonsName() {
        assertEquals("Smaug", dragon.getName());
    }

    @Test
    public void canGetDragonsHealthBar() {
        assertEquals(250, dragon.getHealthBar());
    }
}
