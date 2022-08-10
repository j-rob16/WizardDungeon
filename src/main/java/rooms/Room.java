package rooms;

import java.util.ArrayList;

public abstract class Room {
    private String name;
    private int availableExperience;

    public Room(String name, int availableExperience) {
        this.name = name;
        this.availableExperience = availableExperience;
    }

    public String getName() {
        return this.name;
    }

    public int getAvailableExperience() {
        return this.availableExperience;
    }
}