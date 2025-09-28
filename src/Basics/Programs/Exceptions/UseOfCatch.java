package Basics.Programs.Exceptions;

/*
 * Normal catch blocks:
 *  - Seperate for each exceptions
 *  - Parent Exception catch block
 * Catch multiple exceptions together 
*/

public class UseOfCatch {
    public static void main(String[] args) {

        // If method1() is throwing multiple exceptions, we need to capture each one
        // either seperately or in common Exception

        try {
            method1("dummy");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Inside catch block of ClassNotFoundException exception");
        } catch (InterruptedException ie) {
            System.out.println("Inside catch block of InterruptedException exception");
        } catch (ArithmeticException ae) {
            System.out.println("Inside catch block of ArithmeticException exception");
        }

        try {
            method1("dummy");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Inside catch block of ClassNotFoundException exception");
        } catch (Exception e) {
            System.out.println("Generic Exception block");
        }

        // Catch multiple exceptions together
        try {
            method1("interrupted");
        } catch (ClassNotFoundException | InterruptedException exc) {
            System.out.println(exc.toString());
        }
    }

    public static void method1(String name) throws ClassNotFoundException, InterruptedException {
        if (name.equals("dummy")) {
            throw new ClassNotFoundException();
        } else if (name.equalsIgnoreCase("interrupted")) {
            throw new InterruptedException();
        }

        System.out.println("No exceptions in method1()");
    }
}
