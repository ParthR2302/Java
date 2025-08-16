package Basics.Programs.Constructors.Chaining;

public class Calculations {
    String name; int id;

    Calculations() {
        this(10); // Chaining using this keyword
    }

    Calculations(int empId) {
        this("Name", empId); // Chaining
    }

    Calculations(String name, int id) {
        this.name = name;
        this.id = id;
    }
}