package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.client.commands.util.HistoryManager;

public class HistoryCommand extends Command{
    public HistoryCommand() {
        super("history", "show history of commands");
    }

    @Override
    public Response execute(Request request) {
        return new Response(String.join("\n", HistoryManager.getInstance().getHistory()));
    }
}
