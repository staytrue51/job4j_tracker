package ru.job4j.profession;

public class Builder extends Engineer {
    public Builder(String name, String surname, String education, String birthday, String time, String tool) {
        super(name, surname, education, birthday, time, tool);
    }

    public House build(Brick brick) {
        return null;
    }
}
