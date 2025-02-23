package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class ExecuteScript extends Command{
    public ExecuteScript() {
        super("execute", "execute your script");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
