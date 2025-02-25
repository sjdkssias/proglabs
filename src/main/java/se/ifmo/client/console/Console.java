package se.ifmo.client.console;


import se.ifmo.client.console.interfaces.ConsoleWorker;

import java.io.*;


public final class Console implements ConsoleWorker<String> {
    private final BufferedReader reader;
    private final FileWriter writer;

    public Console() throws IOException {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.writer = new FileWriter(new File("result.xml"));
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
        try {
            writer.write(value);
            writer.flush();
        } catch (IOException e){

        }
    }

    @Override
    public void close() throws IOException {
        reader.close();
        writer.close();
    }
}
