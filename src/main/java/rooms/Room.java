package rooms;

import java.util.ArrayList;

public abstract class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}