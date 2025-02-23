package se.ifmo.server.file.handlers;
import java.io.IOException;

public interface IOHandler<T> extends AutoCloseable{
    T read();  // Метод для чтения

    void write(T value) throws IOException;
}
