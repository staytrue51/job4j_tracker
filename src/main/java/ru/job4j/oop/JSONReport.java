package ru.job4j.oop;

public class JSONReport extends TextReport {
    @Override
    public String genreate(String name, String body) {
        return "{" + System.lineSeparator() + "   name: " + name + "," + System.lineSeparator() + "   body: " + body + System.lineSeparator()
        +"}";
    }
}
