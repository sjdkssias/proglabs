package se.ifmo.client.chat;

import se.ifmo.client.commands.Command;
import se.ifmo.client.commands.util.HistoryManager;
import se.ifmo.client.console.Console;

import java.io.IOException;

public class Handler {

    public static Response handleCommand(Command command, Request request) throws IOException {
        HistoryManager.getInstance().addCommand(command.getName());
        Response response = command.execute(request);// Выводим результат сразу
        return response;
    }
}
