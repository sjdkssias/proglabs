package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.server.CollectionManager;

public class Clear extends Command{
    public Clear() {
        super("clear", "clear your collection");
    }

    @Override
    public Response execute(Request request) {
        CollectionManager.getInstance().clear();
        return new Response("your collection was cleared");
    }
}
