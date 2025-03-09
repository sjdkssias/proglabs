package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class ExitCommand extends Command{
    public ExitCommand() {
        super("exit", "exit program");
    }

    @Override
    public Response execute(Request request) {
        System.exit(0);
        return new Response("Program's exiting..........");
    }
}
