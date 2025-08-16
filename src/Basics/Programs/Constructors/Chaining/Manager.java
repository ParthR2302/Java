package Basics.Programs.Constructors.Chaining;

public class Manager extends Person {
    Manager() {

        // There is a hidden super(); here
        // Since Manager class is extending Person class, it will first call the constructor of parent class.

        System.out.println("Inside Manager Constructor - No Arg");
    }
}
