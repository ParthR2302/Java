package OOPS.Programs.Inheritance;

interface One {
    void print();
    void oneMethod();
}

interface Two {
    void print();
}

interface Three {
    void print();
}

interface Four extends One, Two {
    void print();
}

class Child implements Four, Three {
    public void print() {
        System.out.println("Print() method");
    }

    public void oneMethod() {
        System.out.println("oneMethod() method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child child = new Child();

        child.print();
        child.oneMethod();
    }
}
