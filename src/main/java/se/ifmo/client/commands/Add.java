package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.server.CollectionManager;
import se.ifmo.server.models.id.IdGenerator;

public class Add extends Command{
    public Add() {
        super("add", "add dragon to collection", 1);
    }

    @Override
    public Response execute(Request request) {
        System.out.println(request);

        if (request.dragons()==null || request.dragons().isEmpty()){
            return new Response("No dragons to add");
        }
        CollectionManager.getInstance().add(request.dragons().get(0));
        return new Response("Dragon was saved to collection");
    }
}
