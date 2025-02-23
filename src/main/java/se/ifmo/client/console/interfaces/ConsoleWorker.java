package se.ifmo.client.console.interfaces;

public interface ConsoleWorker<T> extends AutoCloseable{
    T read();  // Метод для чтения

    void write(T value);
}
