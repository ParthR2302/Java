package OOPS.Programs.FunctionalInterfaces;

/*
 * 1. Using "implements"
 * 2. Using Anonymous Class
 * 3. Using Lambda Expressions
*/

@FunctionalInterface
interface Bird2{
    void canFly(int val);
}

// 1. implements
class Eagle2 implements Bird2 {
    public void canFly(int val) {
        System.out.println("Eagle fly method");
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class ImplementFunctioanlInterface {
    public static void main(String[] args) {

        Bird2 eagleBird = new Eagle2();

        // 2. Anonymous class
        Bird2 newBird = new Bird2() {
            @Override
            public void canFly(int val) {
                System.out.println("newBird canFly method");
            }
        };

        // 3. Using Lambda Expression
        // () ->
        // If there are no input parameters in intercase then nothing inside the brackets (). 
        Bird2 newEagleBird = (int value) -> {
            System.out.println("newEagleBird method implementation using Lambda Expression: " + value);
        };

        eagleBird.canFly(10);
        newBird.canFly(20);
        newEagleBird.canFly(30);

        // We don't need to provide datatype to variable in () brackets.
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(5, 3));
        System.out.println("Multiplication: " + multiply.operate(5, 3)); 
    }
}
