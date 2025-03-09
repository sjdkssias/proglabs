package se.ifmo.client.commands;
import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.server.CollectionManager;

public class MaxByIdCommand extends Command{

    public MaxByIdCommand() {
        super("max_by_id", "show any object from the collection whose id field value is the maximum");
    }

    @Override
    public Response execute(Request request) {

        CollectionManager.getInstance().getMaxByKey();
        return new Response("Dragons with max id" + CollectionManager.getInstance().getMaxByKey());
    }
}
