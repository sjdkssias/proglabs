package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

import java.io.IOException;

public class InfoCommand extends Command{
    public InfoCommand(String name, String description, int elementNumber) {
        super("info", "information about collection", 1);
    }

    @Override
    public Response execute(Request request) throws IOException {
        return null;
    }
}
