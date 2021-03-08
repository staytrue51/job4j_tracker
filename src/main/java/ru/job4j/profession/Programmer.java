package ru.job4j.profession;

public class Programmer extends Engineer {
    public Programmer(String name, String surname, String education, String birthday, String time, String tool) {
        super(name, surname, education, birthday, time, tool);
    }

    public Code coder(Task task) {
        return null;
    }
}
