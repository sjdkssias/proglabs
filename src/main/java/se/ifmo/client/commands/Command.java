package se.ifmo.client.commands;
import lombok.*;
import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

@Getter
@RequiredArgsConstructor
public abstract class Command {
    private final String name;
    private final String description;

    public abstract Response execute(Request request);
}
