package Basics.Programs;
class Person {
    String name;
    int age;
    static String type = "Human";

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Non-static Method
    public void nonStaticFunc() {
        System.out.println("This is the Non Static funciton");
        System.out.println("Name: " + name + " and Age: " + age);
        System.out.println("Person type: " + type);
    }

    // Static Method
    public static void staticFunc() {
        System.out.println("This is the Static funciton");
        // System.out.println("Name: " + name + " and Age: " + age); // Error. Static methods cannot access non-static members of the class.
        System.out.println("Person type: " + type);
    }
}

public class StaticMethodVsNonStatic {
    public static void main(String[] args) {
        Person p = new Person("Parth", 22);

        p.nonStaticFunc();
        System.out.println("Break 1 ----------------");
        Person.staticFunc();
    }
}
