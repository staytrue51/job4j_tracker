package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int i) {
        this.load = i;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(95);
        Battery secondBattery = new Battery(10);
        System.out.println("first battery : " + firstBattery.load + ". second battery : " + secondBattery.load);
        secondBattery.exchange(firstBattery);
        System.out.println("first battery : " + firstBattery.load + ". second battery : " + secondBattery.load);
    }
}
