package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.server.CollectionManager;

public class RemoveKey extends Command{
    public RemoveKey() {
        super("remove_key", "remove all elements who have the given key");
    }

    @Override
    public Response execute(Request request) {
        if (request.dragons()==null || request.dragons().isEmpty()){
            return new Response("null request");
        }
        int yourId = (int)request.dragons().get(0).getId();
        CollectionManager.getInstance().removeById((int)request.dragons().get(0).getId());
        return new Response("elements with key " + yourId+ " were removed");
    }
}
