package Basics.Programs.Miscellaneous;

interface Vehicle {
    public String colour = "White";
    public int capacity = 2;

    public void run();
}

class Car implements Vehicle {
    public void run() {
        System.out.println("Run method of Car");
    }

    public void carMethod() {
        System.out.println("Car specific method");
    }
}

class Parent {
    public void parentMethod() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("Child Method");
    }
}

public class ParentChildAccess {
    public static void main(String[] args) {
        Vehicle car = new Car();

        car.run();
        // car.carMethod(); // Error, as the type of the object is of Vehicle.
        // Vehicle is either an interface or parent class which does not have carMethod() defined in it

        Parent child = new Child();
        child.parentMethod();
        // child.childMethod(); // Error. Same reason as Interface case
    }
}


