package Basics.Programs.Exceptions;

/*
 * Exception Handeling using
 * 1. throws
 * 2. try-catch
 */

public class ExceptionHandeling {

    public static void main(String[] args) {

        // If we remove throws ClassNotFoundException from main method, below call will show compilation error.
        // method();

        // Using try-catch
        try {
            method();
        } catch(ClassNotFoundException ce) {
            System.out.println("Class Not Found Exception: " + ce.getMessage());
        }
        catch(Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        } 
        System.out.println();

        method1();
        System.out.println();

        method2();
        System.out.println();
    }

    public static void method() throws ClassNotFoundException {
        throw new ClassNotFoundException();
        // throw new ArithmeticException();
    }

    public static void method1() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch(Exception e) {
            System.out.println("method1() - Generic Exception: " + e.getMessage());            
        }
    }

    public static void method2() {
        String val = null;

        try {
            // val = "Dummy";
            int a = 5/0;
            val = "Dummy"; // Try commenting any one of the val = "Dummy" line and check the output
            val += a;
        } catch (Exception e) {
            System.out.println("method2() - Generic Exception: " + e.getMessage());            
        }

        System.out.println(val);
    }
}
