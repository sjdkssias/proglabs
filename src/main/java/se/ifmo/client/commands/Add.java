package se.ifmo.client.commands;

import se.ifmo.client.console.interfaces.Console;
import se.ifmo.server.CollectionManager;

public class Add extends Command{
    private final Console console;
    private final CollectionManager collectionManager;

    public Add(Console console, CollectionManager collectionManager) {
        super("add {element}", "добавить новый элемент в коллекцию");
        this.console = console;
        this.collectionManager = collectionManager;
    }
}
