package se.ifmo.client.chat;

import se.ifmo.client.console.Console;
import se.ifmo.server.models.classes.Dragon;

import java.util.List;

public record Request(String command, List<String> args, List<Dragon> dragons, Console console) {

    
}
