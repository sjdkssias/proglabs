package se.ifmo.client.commands;

import java.util.List;

public class AllCommands {
    public static final List<Command> ALLCOMANDS = List.of(
            new Add(),
            new Help(),
            new Exit(),
            new FilterGreaterThanSpeaking(),
            new History(),
            new Insert(),
            new Save(),
            new Clear(),
            new MaxById(),
            new RemoveKey(),
            new RemoveGreaterKey(),
            new PrintUniqueHead(),
            new RemoveLowerKey(),
            new Show(),
            new ExecuteScript()
    );

    public AllCommands() {
    }
}
