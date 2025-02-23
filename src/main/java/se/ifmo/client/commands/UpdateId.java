package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class UpdateId extends Command{
    public UpdateId() {
        super("update", "update the value of a collection element whose id is equal to a given one");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
