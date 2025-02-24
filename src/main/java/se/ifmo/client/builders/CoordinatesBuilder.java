package se.ifmo.client.builders;

import se.ifmo.client.console.Console;
import se.ifmo.server.models.classes.Coordinates;

import java.io.IOException;

public class CoordinatesBuilder extends Builder{
    public CoordinatesBuilder(Console console) {
        super(console);
    }

    public Coordinates create() throws IOException {
        return new Coordinates(buildFloat("координата x"), buildLong("координата y"));
    }

}
