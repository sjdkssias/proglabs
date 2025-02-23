package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.client.commands.util.HistoryManager;

public class Exit extends Command{
    public Exit() {
        super("exit", "exit program");
    }

    @Override
    public Response execute(Request request) {
        System.exit(0);
        return new Response("Program's exiting..........");
    }
}
