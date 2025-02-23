package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class PrintUniqueHead extends Command {
    public PrintUniqueHead() {
        super("print unique head", "print unique dragon's head");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
