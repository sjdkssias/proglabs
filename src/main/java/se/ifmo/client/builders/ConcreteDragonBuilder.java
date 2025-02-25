package se.ifmo.client.builders;

import se.ifmo.server.models.classes.Coordinates;
import se.ifmo.server.models.classes.Dragon;
import se.ifmo.server.models.classes.DragonHead;
import se.ifmo.server.models.enums.Color;
import se.ifmo.server.models.enums.DragonCharacter;

public class ConcreteDragonBuilder implements DragonBuilder{
    private Dragon dragon;

    public ConcreteDragonBuilder(){
        dragon = new Dragon();
    }
    @Override
    public DragonBuilder setCoordinates(Coordinates coordinates) {
        dragon.setCoordinates(coordinates);
        return this;
    }

    @Override
    public DragonBuilder setName(String name) {
        dragon.setName(name);
        return this;
    }

    @Override
    public DragonBuilder setSpeaking(boolean speaking) {
        dragon.setSpeaking(speaking);
        return this;
    }

    @Override
    public DragonBuilder setColor(Color color) {
        dragon.setColor(color);
        return this;
    }

    @Override
    public DragonBuilder setDragonHead(DragonHead dragonHead) {
        dragon.setHead(dragonHead);
        return this;
    }

    @Override
    public DragonBuilder setDragonCharacter(DragonCharacter dragonCharacter) {
        setDragonCharacter(dragonCharacter);
        return this;
    }

    public Dragon getResult(){
        return dragon;
    }
}
