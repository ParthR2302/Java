package Basics.Programs.Reflection;

public class Eagle {
    public String breed;
    private boolean canSwim;

    public Eagle() {
        canSwim = false;
    }

    public void fly() {
        System.out.println("Eagle Flying");
    }

    public void eat() {
        System.out.println("Eagle Eating");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private Method");
        System.out.println(canSwim);
    }

    public void run(int a, boolean b, String c) {
        System.out.println(a + " " + b + " " + c);
    }

    public boolean getCanSwim() {
        return canSwim;
    }
}
