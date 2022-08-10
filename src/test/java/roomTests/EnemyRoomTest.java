package roomTests;

import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import rooms.EnemyRoom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EnemyRoomTest {
    EnemyRoom room;
    Ogre ogre;

    @Before
    public void before() {
        room = new EnemyRoom("Dungeon", 100);
        ogre = new Ogre("Ogg", 20, 200);
    }

    @Test
    public void canGetRoomName() {
        assertEquals("Dungeon", room.getName());
    }

    @Test
    public void canGetAvailableExperience() {
        assertEquals(100, room.getAvailableExperience());
    }

    @Test
    public void roomEnemiesStartAt0() {
        assertNull(room.getEnemy());
    }

    @Test
    public void canFaceEnemy() {
        room.addEnemy(ogre);
        assertEquals(ogre, room.getEnemy());
    }
}
