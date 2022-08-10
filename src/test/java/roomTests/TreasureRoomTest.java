package roomTests;

import org.junit.Before;
import org.junit.Test;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {
    TreasureRoom room;

    @Before
    public void before() {
        room = new TreasureRoom("Vault", 100);
    }

    @Test
    public void canGetRoomName() {
        assertEquals("Vault", room.getName());
    }

    @Test
    public void roomHasAvailableExperienceToEarn() {
        assertEquals(100, room.getAvailableExperience());
    }
}
