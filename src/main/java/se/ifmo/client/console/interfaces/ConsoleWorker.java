package se.ifmo.client.console.interfaces;

public interface ConsoleWorker extends IOWorker<String>{
    @Override
    String read();

    @Override
    void write(String value);
}
