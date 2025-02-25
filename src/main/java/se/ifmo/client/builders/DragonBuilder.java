package se.ifmo.client.builders;

import se.ifmo.server.models.classes.Coordinates;
import se.ifmo.server.models.classes.DragonHead;
import se.ifmo.server.models.enums.Color;
import se.ifmo.server.models.enums.DragonCharacter;

public interface DragonBuilder {
    public DragonBuilder setName(String name);
    public DragonBuilder setCoordinates(Coordinates coordinates);
    public DragonBuilder setSpeaking(boolean speaking);
    public DragonBuilder setColor(Color color);
    public DragonBuilder setDragonHead(DragonHead dragonHead);
    public DragonBuilder setDragonCharacter(DragonCharacter dragonCharacter);

}
