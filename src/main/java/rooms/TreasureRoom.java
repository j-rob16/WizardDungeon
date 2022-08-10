package rooms;

import interfaces.IExperience;
import interfaces.ITreasure;

import java.util.ArrayList;

public class TreasureRoom extends Room implements IExperience {
    private ArrayList<ITreasure> treasure;
    public TreasureRoom(String name, int availableExperience) {
        super(name, availableExperience);
    }

    @Override
    public int getExperience() {
        return this.getAvailableExperience();
    }
}
