package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class History extends Command{
    public History() {
        super("history", "show history of commands");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
