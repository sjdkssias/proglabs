package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.client.commands.util.HistoryManager;

public class History extends Command{
    public History() {
        super("history", "show history of commands");
    }

    @Override
    public Response execute(Request request) {
        System.out.println("Commands history: " + String.join(", ", HistoryManager.getInstance().getHistory()));
        return new Response(String.join("\n", HistoryManager.getInstance().getHistory()));
    }
}
