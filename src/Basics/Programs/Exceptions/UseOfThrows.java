package Basics.Programs.Exceptions;

public class UseOfThrows {
    public static void main(String[] args) {
        
        // method1(); // method1() throws an exception hence it needs to be called inside try-catch block to handle the exception
        // either call for method1() should be inside try-catch block, 
        // Or the parent method for this method (main() in this case) should throw the same exception

        try {
            method1();
        } catch (Exception ex) {
            System.out.println("Exception message: " + ex);
        }

        try {
            // Even if we are not catching exception here, we don't need to use throws in main() method for delegating the task,
            // As the thrown exception from method2() is of type Runtime exception
            // Its a good practice to handle it as well
            method2();
        } finally {

        }
    }

    public static void method1() throws ClassNotFoundException {
        System.out.println("Method1");
        throw new ClassNotFoundException();
    }

    public static void method2() throws ArithmeticException {
        System.out.println("Method2");
        throw new ArithmeticException();
    }
}
