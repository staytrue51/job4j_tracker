package ru.job4j.profession;

public class Doctor extends Profession {
    private String diagnos;
    private String tool;

    public Doctor(String name, String surname, String education, String birthday, String diagnos, String tool) {
        super(name,surname,education,birthday);
        this.diagnos = diagnos;
        this.tool = tool;
    }

    public Doctor() {

    }

    public Diagnosis heal(Pacient pacient) {
        Doctor doctor = new Doctor();
        doctor.getName();
        return null;
    }
}
