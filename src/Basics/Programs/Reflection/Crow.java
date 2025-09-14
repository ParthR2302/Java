package Basics.Programs.Reflection;

public class Crow {
    int speed;
    private Crow() {
        speed = 5;
    }

    private Crow(int speed) {
        this.speed = speed;
    }

    public void fly() {
        System.out.println("Crow is flying");
    }

    public void run() {
        System.out.println("Running at speed " + this.speed);
    }
}
