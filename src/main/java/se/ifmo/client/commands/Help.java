package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.client.commands.util.HistoryManager;

public class Help extends Command {
    public Help() {
        super("help", "show description of all commands");
    }

    @Override
    public Response execute(Request request) {
        StringBuilder responseText = new StringBuilder("Доступные команды:\n");

        for (Command command : AllCommands.ALLCOMANDS) {
            responseText.append(command.getName()).append(" - ").append(command.getDescription()).append("\n");
        }

        return new Response(responseText.toString());
    }
}
