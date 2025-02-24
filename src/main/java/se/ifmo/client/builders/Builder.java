package se.ifmo.client.builders;

import se.ifmo.client.console.Console;

import java.io.IOException;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Builder {
    protected final Console console;
    public Builder(Console console){
        this.console = console;
    }
    private <T> T parseInput(String name, Function<String, T> parser, Predicate<T> validator, String errorMessage) throws IOException {
        while (true) {
            console.write("Введите: " + name);
            String input = console.read();
            try {
                T value = parser.apply(input);
                if (!validator.test(value)) {
                    console.write(errorMessage);
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                console.write("Неверный формат ввода для " + name);
            }
        }
    }
    protected Integer buildInt(String name) throws IOException {
        return parseInput(name, Integer::parseInt, val -> val >= 0, "Число должно быть больше или равно 0");
    }

    protected Float buildFloat(String name) throws IOException {
        return parseInput(name, Float::parseFloat, val -> val != 0, "Число не может быть 0");
    }
    protected Long buildLong(String name) throws IOException {
        return parseInput(name, Long::parseLong, val -> val > (-684), "Число должно быть больше -684");
    }

}
