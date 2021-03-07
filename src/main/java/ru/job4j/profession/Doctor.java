package ru.job4j.profession;

public class Doctor extends Profession {
    private String diagnos;
    private String tool;

    public Doctor(String diagnos, String tool) {
        this.diagnos = diagnos;
        this.tool = tool;
    }
    public Doctor(){

    }

    public Diagnosis heal(Pacient pacient) {
        Doctor doctor = new Doctor();
        doctor.getName();
        return null;
    }
}
