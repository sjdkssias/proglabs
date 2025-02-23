package se.ifmo.client.commands;


import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;


public class Insert extends Command{

    public Insert() {
        super("add {element}", "add element with your key");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
