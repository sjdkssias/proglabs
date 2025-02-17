package se.ifmo.client.commands;

import se.ifmo.client.console.interfaces.ConsoleWorker;
import se.ifmo.server.CollectionManager;

public class MaxById extends Command{
    private final ConsoleWorker console;
    private final CollectionManager collectionManager;

    public MaxById(ConsoleWorker console, CollectionManager collectionManager) {
        super("max {element} by id", "вывести любой объект из коллекции, значение поля id которого является максимальным");
        this.console = console;
        this.collectionManager = collectionManager;
    }

    @Override
    protected void execute() {

    }
}
