package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.client.commands.util.HistoryManager;
import se.ifmo.server.CollectionManager;

public class Info extends Command{

    public Info() {
        super("info", "show info about collection");
    }

    @Override
    public Response execute(Request request) {
        CollectionManager collectionManager = CollectionManager.getInstance();
        if (collectionManager.treeMap().isEmpty()){
            return new Response("Ваша коллекция пуста");
        }
        StringBuilder result = new StringBuilder("Элементы коллекции:\n");
        collectionManager.treeMap().forEach((id, dragon) ->
                result.append("ID: ").append(id)
                        .append(", Дракон: ").append(dragon)
                        .append("\n")
        );

        return new Response(result.toString());
    }
}
