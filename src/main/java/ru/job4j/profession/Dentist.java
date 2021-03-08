package ru.job4j.profession;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, String birthday, String diagnos, String tool) {
        super(name, surname, education, birthday, diagnos, tool);
    }

    public Tooth therapy(Pacient pacient) {
        return null;
    }
}
