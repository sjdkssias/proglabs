package se.ifmo.client.chat;

import se.ifmo.client.commands.AllCommands;
import se.ifmo.client.commands.Command;
import se.ifmo.client.console.Console;
import se.ifmo.client.utility.InputHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Router {
    public static Response routeCommand(String commandName, List<String> arguments,  Console console) throws IOException {
        for (Command command : AllCommands.ALLCOMANDS) {
            if (command.getName().equalsIgnoreCase(commandName)) {
                Request request;
                if (command.getElementNumber() == 0)
                    request = new Request(commandName, arguments, new ArrayList<>(), console);
                else {
                    try {
                        request = new Request(commandName, arguments, List.of(InputHandler.get(console)), console);
                    } catch (InterruptedException e) {
                        request = new Request(commandName, arguments, new ArrayList<>(), console);
                        System.err.println("Command has been interrupted.");
                    }
                }
                return Handler.handleCommand(command, request);
            }
        }
        return new Response("Ошибка: Команда '" + commandName + "' не найдена.");
    }
}

