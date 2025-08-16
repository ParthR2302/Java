// Online Java Compiler
// Use this editor to write, compile and run your Java code online

package Basics.Programs.Interfaces;

class Parent {
    public void method() {
        System.out.println("Inside method of parent");
    }
}

class Child extends Parent {
    @Override
    public void method() {
        System.out.println("Inside method of child");
    }
    
    public void childMethod() {
        System.out.println("Inside specific method of child");
    }
}

interface Person {
    public String profession();
}

class Teacher implements Person {
    @Override
    public String profession() {
        return "teaching";
    }
    
    public void schoolName() {
        System.out.println("School Name");
    }
}

public class ErrorImplemented {
    public static void main(String[] args) {
        Parent child1 = new Child();
        Child child2 = new Child();
        
        
        child1.method();
        // child1.childMethod(); // Error
        
        child2.method();
        child2.childMethod();
        
        Person teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        
        System.out.println(teacher1.profession());
        // teacher1.schoolName(); // Error
        System.out.println(teacher2.profession());
        teacher2.schoolName();
    }
}