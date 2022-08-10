package pets;

import interfaces.IDefend;

public class Dragon extends Pet implements IDefend {
    public Dragon(String name, int healthBar) {
        super(name, healthBar);
    }

    @Override
    public void defend() {

    }
}
