package OOPS.Programs.Miscellaneous;

class Parent1 {
    public Parent1() {
        System.out.println("Inside Parent1 Constructor");
    }

    public Parent1(int x) {
        System.out.println("Inside Parent1 Constructor with value: " + x);
    }

    public Parent1(int x, int y) {
        System.out.println("Inside Child1 Constructor with value: " + x + " and: " + y);
    }
}

class Child1 extends Parent1 {
    public Child1() {
        System.out.println("Inside Child1 Constructor");
    }

    public Child1(int x) {
        System.out.println("Inside Child1 Constructor with value: " + x);
    }

    public Child1(int x, int y) {
        super(x, y);
        System.out.println("Inside Child1 Constructor with value: " + x + " and: " + y);
    }

    public void dummy() {

    }
}

public class ParentChildConstructor {
    public static void main(String[] args) {
        
        Child1 child1 = new Child1();
        System.out.println("");

        Child1 child2 = new Child1(10);
        System.out.println("");

        Child1 child3 = new Child1(10, 7);

        child1.dummy();
        child2.dummy();
        child3.dummy();
    }
}
