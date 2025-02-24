package se.ifmo.client.builders;

import se.ifmo.client.console.Console;
import se.ifmo.server.models.classes.DragonHead;

import java.io.IOException;

public class DragonHeadBuilder extends Builder{
    public DragonHeadBuilder(Console console) {
        super(console);
    }

    public DragonHead create() throws IOException {
        return new DragonHead(buildFloat("toothcount"))  ;
    }
}
