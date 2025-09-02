package OOPS.Programs.FunctionalInterfaces;

/**
 * 
*/

interface Bird1_0 {
    void canFly();
}

@FunctionalInterface // Optional. But it restricts interface to have only one abstract method
interface Bird1_1{
    void canFly();

    // void canRun(); // Error. Functional Interface can only have one abstract method
}

@FunctionalInterface
interface Bird1_3{
    void canFly();

    default void canRun() {
        System.out.println("Can run method");
    }

    static int staticMethod() {
        return 123;
    }

    String toString(); // Object class method
}

public class FunctionalInterfaceOverview {
    
}
