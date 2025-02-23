package se.ifmo.client.chat;

import se.ifmo.client.commands.Command;
import se.ifmo.client.commands.util.HistoryManager;

public class Handler {
    public static Response handleCommand(Command command, Request request) {
            HistoryManager.getInstance().addCommand(command.getName());
            Response response = command.execute(request);// Выводим результат сразу
            return response;
    }
}
