package rooms;

import interfaces.IRoom;
import interfaces.ITreasure;

import java.util.ArrayList;

public class TreasureRoom extends Room implements IRoom {
    private ArrayList<ITreasure> treasure;
    public TreasureRoom(String name) {
        super(name);
    }

    @Override
    public void getExperience() {

    }
}
