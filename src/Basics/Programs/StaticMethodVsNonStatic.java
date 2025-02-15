package Basics.Programs;
class Person1 {
    String name;
    int age;
    static String type = "Human";

    Person1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Non-static Method
    public void nonStaticFunc2() {
        System.out.println("This is the Non Static funciton");
        System.out.println("Name: " + name + " and Age: " + age);
        System.out.println("Person1 type: " + type);
    }

    // Static Method
    public static void staticFunc2() {
        System.out.println("This is the Static funciton");
        // System.out.println("Name: " + name + " and Age: " + age); // Error. Static methods cannot access non-static members of the class.
        System.out.println("Person1 type: " + type);
    }
}

public class StaticMethodVsNonStatic {
    public static void main(String[] args) {
        Person1 p = new Person1("Parth", 22);

        p.nonStaticFunc2();
        System.out.println("Break 1 ----------------");
        Person1.staticFunc2();
    }
}
