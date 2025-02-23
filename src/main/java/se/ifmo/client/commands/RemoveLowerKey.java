package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class RemoveLowerKey extends Command{
    public RemoveLowerKey() {
        super("remove lower key", "remove from the collection all elements whose key is less than the given one");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
