package se.ifmo.client.commands;
import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.client.console.Console;
import se.ifmo.server.CollectionManager;


public class Insert extends Command{

    public Insert() {
        super("add {element}", "add element with your key");
    }

    @Override
    public Response execute(Request request) {
        if (request.dragons() == null || request.dragons().isEmpty()) {
            return new Response("No dragons to add");
        }

        Console console = new Console();

        console.write("Enter the ID for the new dragon (Integer value):");
        String idString = console.read();
        Integer id;
        try {
            id = Integer.parseInt(idString);
        } catch (NumberFormatException e) {
            return new Response("Invalid ID format. Please enter a valid integer.");
        }
        if (CollectionManager.getInstance().treeMap().containsKey(id)) {
            return new Response("Dragon with this ID already exists!");
        }
        CollectionManager.getInstance().treeMap().put(id, request.dragons().get(0));

        return new Response("Dragon was saved to collection with ID: " + id);
    }
}
