import rooms.Room;

import java.util.ArrayList;

public class Game {
    private ArrayList<Room> gameZones;
    private Character player;

    public Game() {
        this.gameZones = new ArrayList<>();
    }

    public int getNumberOfGameZones() {
        return gameZones.size();
    }

    public Character getPlayer() {
        return this.player;
    }
}
