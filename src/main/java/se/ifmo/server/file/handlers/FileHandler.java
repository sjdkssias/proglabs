package se.ifmo.server.file.handlers;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.*;
import lombok.*;

public class FileHandler implements IOHandler<String>, AutoCloseable {
    @Getter
    protected final FileWriter writer;
    @Getter
    protected final InputStreamReader reader;

    public FileHandler() throws IOException {
        this.writer = new FileWriter("ldldl.txt", true);
        this.reader = new InputStreamReader(System.in);
    }

    @Override
    public String read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("Введите текст: ");
        return bufferedReader.readLine();
    }

    @Override
    public void write(String value) throws IOException {
        writer.append(value + "\n").flush();// Сброс буфера, чтобы сразу записать в файл
    }

    @Override
    public void close() throws IOException {
        writer.close();
        reader.close();
    }
}

