package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.server.CollectionManager;
import se.ifmo.server.models.classes.Dragon;

import java.util.List;
import java.util.TreeMap;

public class RemoveGreaterKeyCommand extends Command{

    public RemoveGreaterKeyCommand() {
        super("remove_greater_key", "remove all elements whose key greater than your");
    }

    @Override
    public Response execute(Request request) {
        if (request.args().isEmpty()){
            return new Response("Error");
        }
        try {
            int key = Integer.parseInt(request.args().get(0));
            TreeMap<Integer, Dragon> treeMap = CollectionManager.getInstance().treeMap();
            List<Integer> keysToRemove = treeMap.tailMap(key, false)
                    .keySet()
                    .stream()
                    .toList();
        if (keysToRemove.isEmpty()) {
            return new Response("No elements with key greater than " + key);
        }
        keysToRemove.forEach(treeMap::remove);

        return new Response("Removed " + keysToRemove.size() + " elements with key greater than " + key);
        } catch (NumberFormatException e) {
            return new Response("Error: Invalid key format. Please enter a number.");
        }

    }
}
