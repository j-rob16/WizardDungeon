package characters;

import interfaces.IHealer;

public class Cleric extends Character implements IHealer {
    public Cleric(String name) {
        super(name);
    }

    @Override
    public void heal() {
        
    }
}
