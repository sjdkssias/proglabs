package se.ifmo.client.chat;

import se.ifmo.client.commands.Command;

public class Handler {
    public static Response handleCommand(Command command, Request request) {
            Response response = command.execute(request);// Выводим результат сразу
            return response;

    }

}
