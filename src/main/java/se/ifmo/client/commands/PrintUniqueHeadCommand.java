package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class PrintUniqueHeadCommand extends Command {
    public PrintUniqueHeadCommand() {
        super("print_unique_head", "print unique dragon's head");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
