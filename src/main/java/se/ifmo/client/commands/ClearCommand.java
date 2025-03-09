package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.server.CollectionManager;

public class ClearCommand extends Command{
    public ClearCommand() {
        super("clear", "clear your collection");
    }

    @Override
    public Response execute(Request request) {
        CollectionManager.getInstance().getDragons().clear();
        return new Response("your collection was cleared");
    }
}
