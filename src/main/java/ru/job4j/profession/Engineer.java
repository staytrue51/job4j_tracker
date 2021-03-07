package ru.job4j.profession;

public class Engineer extends Profession {
    private String time;
    private String tool;

    public Engineer(String time, String tool) {
        this.time = time;
        this.tool = tool;
    }
    public Engineer(){

    }

    public Bridge build(Task task) {
        Engineer engineer = new Engineer();
        engineer.getName();
        return null;

    }
}
