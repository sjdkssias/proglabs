package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class MaxById extends Command{

    public MaxById() {
        super("max {element} by id", "show any object from the collection whose id field value is the maximum");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
