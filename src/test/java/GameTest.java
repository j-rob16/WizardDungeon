import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void gameStartsWithNoRooms() {
        assertEquals(0, game.getNumberOfGameZones());
    }

    @Test
    public void canGetGamePlayer() {
        assertNull(game.getPlayer());
    }


}
