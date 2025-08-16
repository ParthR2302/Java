package Basics.Programs.Constructors.Chaining;

class Person1 {
    int id;

    Person1(int id) {
        this.id = id;
    }
}

class Manager1 extends Person1 {
    int age;

    Manager1(int id, int age) {
        super(id);
        // Since, there is no no-arg constructors present in the parent class, we need to explicitly call super constructor with required parameters
        this.age = age;
    }

    public void print() {
        System.out.println("Age: " + this.age + " id: " + this.id);
    }
}

public class SuperExample2 {
    public static void main(String[] args) {
        Manager1 m1 = new Manager1(1, 35);

        m1.print();
    }
}
