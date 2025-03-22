package OOPS.Programs.Inheritance;

class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute

    public void honk() { // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    String modelName = "Mustang"; // Car attribute
}

public class Inheritance {

    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the
        // value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

final class C1 {
    public int x;
    protected double y;
};

// class C2 extends C1 {}; // Error. The type C2 cannot subclass the final class C1
