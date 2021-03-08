package ru.job4j.profession;

public class Engineer extends Profession {
    private String time;
    private String tool;

    public Engineer(String name, String surname, String education, String birthday, String time, String tool) {
        super(name, surname, education, birthday);
        this.time = time;
        this.tool = tool;
    }

    public Engineer() {

    }

    public Bridge build(Task task) {
        Engineer engineer = new Engineer();
        engineer.getName();
        return null;

    }
}
