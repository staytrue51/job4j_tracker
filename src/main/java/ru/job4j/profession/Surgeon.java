package ru.job4j.profession;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, String birthday, String diagnos, String tool) {
        super(name, surname, education, birthday, diagnos, tool);
    }

    public Body operate(Pacient pacient) {
        return null;
    }
}
