package se.ifmo.client.commands.util;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
class CommandsBuff {
    private final Deque<String> deque;
    private final int size;
    public CommandsBuff(int size){
        this.deque = new ArrayDeque<>(size);
        this.size = size;
    }
    public void add(String element) {
        if (deque.size() == size) deque.removeFirst();

        deque.addLast(element);
    }

    public List<String> toList() {
        return deque.stream().toList();
    }
}
public class HistoryManager {
    private static HistoryManager instance;
    private final CommandsBuff commandsBuff = new CommandsBuff(6);

    private HistoryManager() {
    }
    public static HistoryManager getInstance() {
        return instance == null ? instance = new HistoryManager() : instance;
    }
    public void addCommand(String command) {
        commandsBuff.add(command);
    }
    public List<String> getHistory() {
        return commandsBuff.toList();
    }
}
