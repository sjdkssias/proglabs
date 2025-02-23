package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class RemoveKey extends Command{
    public RemoveKey() {
        super("remove key", "remove all elements who have the given key");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
