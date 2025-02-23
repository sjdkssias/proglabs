package se.ifmo.client.chat;

import se.ifmo.client.commands.AllCommands;
import se.ifmo.client.commands.Command;
import se.ifmo.client.console.Console;

import java.util.List;

public class Router {
    public static Response routeCommand(String commandName, List<String> arguments, Console console) {
        for (Command command : AllCommands.ALLCOMANDS) {
            if (command.getName().equalsIgnoreCase(commandName)) {
                Request request = new Request(commandName, arguments, List.of(), console);
                return Handler.handleCommand(command, request);
            }
        }
        return new Response("Ошибка: Команда '" + commandName + "' не найдена.");
    }
}
