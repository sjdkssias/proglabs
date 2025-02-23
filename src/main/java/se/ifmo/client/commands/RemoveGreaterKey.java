package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class RemoveGreaterKey extends Command{
    public RemoveGreaterKey() {
        super("remove greater key", "remove all elements whose key greater than your");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
