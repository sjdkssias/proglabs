package se.ifmo.client.console;


import se.ifmo.client.console.interfaces.ConsoleWorker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public final class Console implements ConsoleWorker<String> {
    private final BufferedReader reader;
    private final PrintStream writer;

    public Console() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.writer = System.out;
    }

    @Override
    public String read() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении из консоли", e);
        }
    }

    @Override
    public void write(String value) {
        writer.println(value);
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}
