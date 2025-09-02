package OOPS.Programs.FunctionalInterfaces;

/*
 * 1. Functional Interface extends Interface
 * 2. Interface extends Functional Interface 
 * 3. FI extends other FI
 * 
 * Same name method (As of parent) in child FI is allowed
*/

// ----------------------------------------------------------------------------- 1. Functional Interface extends Interface

interface LivingThings1_0 {
    void canBreath();

    // void canBreath1(); // If there are more than one abstract methods, then no FI can extend this Interface

    default public void defaultMethod() {
        System.out.println("Default method of LivingThings Interface");
    }
}

@FunctionalInterface
interface Bird3_1 extends LivingThings1_0 {

    // This FI already has one abstract method that is inherited from parent

    // void canFly(int val); // Error.
}

// ----------------------------------------------------------------------------- 2. Interface extends Functional Interface 
@FunctionalInterface
interface LivingThings1_1{
    public boolean canBreath();
}

interface Bird3_2 extends LivingThings1_1 {
    void canFly(String val);
}

// ----------------------------------------------------------------------------- 3. FI extends other FI
@FunctionalInterface
interface LivingThings1_2{
    public boolean canBreath();
}

@FunctionalInterface
interface Bird3_3 extends LivingThings1_2 {
    // public void fly(); // Error

    public boolean canBreath(); // Allowed, as the name is same as of Parent Interface.
}

public class FuncInterfaceExtends {
    public static void main(String[] args) {
        
    }
}
