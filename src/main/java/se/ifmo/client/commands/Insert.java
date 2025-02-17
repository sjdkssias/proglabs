package se.ifmo.client.commands;


import se.ifmo.client.console.interfaces.ConsoleWorker;
import se.ifmo.server.CollectionManager;

public class Insert extends Command{
    private final ConsoleWorker console;
    private final CollectionManager collectionManager;

    public Insert(ConsoleWorker console, CollectionManager collectionManager) {
        super("add {element}", "добавить новый элемент в коллекцию");
        this.console = console;
        this.collectionManager = collectionManager;
    }

    @Override
    protected void execute() {

    }
}
