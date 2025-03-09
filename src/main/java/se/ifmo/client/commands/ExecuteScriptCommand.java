package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class ExecuteScriptCommand extends Command{
    public ExecuteScriptCommand() {
        super("execute", "execute your script");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
