package se.ifmo.client.commands;

import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;
import se.ifmo.server.CollectionManager;

public class SaveCommand extends Command{
    public SaveCommand() {
        super("save", "save collection to file");
    }

    @Override
    public Response execute(Request request) {
        CollectionManager.getInstance().save();
        return new Response("Коллекция сохранена в файл");
    }
}
