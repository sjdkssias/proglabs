package se.ifmo.client.utility;

import se.ifmo.client.console.Console;
import se.ifmo.server.models.classes.Coordinates;
import se.ifmo.server.models.classes.Dragon;
import se.ifmo.server.models.classes.DragonHead;
import se.ifmo.server.models.enums.Color;

import java.util.function.Consumer;
import java.util.function.Function;

public class InputHandler {
    public static Dragon get(Console console) throws InterruptedException {
        Dragon dragon = new Dragon();

        while(!input("name", dragon::setName, Function.identity(), console)) {};

        Coordinates coordinates = new Coordinates();
        while(!input("coordinate x", coordinates::setX, Float::parseFloat, console)) {};
        while(!input("coordinate y", coordinates::setY, Long::valueOf, console)) {};
        dragon.setCoordinates(coordinates);

        while(!input("speaking", dragon::setSpeaking, Boolean::valueOf, console)) {};
        while(!input("color", dragon::setColor, Color::valueOf, console)) {};
        DragonHead head = new DragonHead();
        while(!input("dragon head", head::setToothcount, Float::parseFloat, console));
        dragon.setHead(head);
        return dragon;
    }

    private static <K> boolean input(
            final String fieldName,
            final Consumer<K> setter,
            final Function<String, K> parser,
            final Console console
    ) throws InterruptedException {
        try {
            console.write(" - " + fieldName);
            String line = console.read();
            if (line == null || line.equals("return")) throw new InterruptedException("called return");

            if (line.isBlank()) setter.accept(null);
            else setter.accept(parser.apply(line));

            return true;
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception ex) {
            console.write(ex.getMessage() + System.lineSeparator());
            return false;
        }
    }
}
