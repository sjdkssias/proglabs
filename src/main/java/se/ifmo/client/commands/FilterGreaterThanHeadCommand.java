package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

public class FilterGreaterThanHeadCommand extends Command{
    public FilterGreaterThanHeadCommand() {
        super("filter_greater", "display elements whose head field value is greater than the specified one");
    }

    @Override
    public Response execute(Request request) {
        return null;
    }
}
