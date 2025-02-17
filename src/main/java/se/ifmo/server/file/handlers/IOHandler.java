package se.ifmo.server.file.handlers;

public interface IOHandler<T> extends AutoCloseable{
    T read();  // Метод для чтения

    void write(T value);
}
