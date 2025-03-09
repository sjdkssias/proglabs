package se.ifmo.client.commands;

import com.sun.source.tree.Tree;
import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.server.CollectionManager;
import se.ifmo.server.models.classes.Dragon;

import java.io.IOException;
import java.util.TreeMap;

public class InfoCommand extends Command{
    public InfoCommand(String name, String description, int elementNumber) {
        super("info", "information about collection", 1);
    }

    @Override
    public Response execute(Request request) throws IOException {
        TreeMap<Integer, Dragon> collection = CollectionManager.getInstance().getDragons();
        return new Response("collection type: " + collection.getClass() + "\n" + "collection size: " + collection.size());
    }
}
