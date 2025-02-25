package se.ifmo.client.commands;
import lombok.*;
import se.ifmo.client.chat.Request;
import se.ifmo.client.chat.Response;

import java.io.IOException;

@Getter
@RequiredArgsConstructor
public abstract class Command {
    private final String name;
    private final String description;
    private final int elementNumber;
    public Command(String name, String description) {
        this(name, description, 0);
    }
    public abstract Response execute(Request request) throws IOException;
}
