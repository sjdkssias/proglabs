package se.ifmo.client.chat;

import se.ifmo.server.models.classes.Dragon;

import java.util.Collections;
import java.util.List;

public record Response(String message, List<Dragon> dragons) {
    public Response(String message, Dragon... dragons) {
        this(message, List.of(dragons));
    }

    public Response(String message){
        this(message, Collections.emptyList());
    }
    public static Response empty(){
        return new Response(null);
    }
    public String getMessage(){
        return message;
    }

}
