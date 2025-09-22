package Basics.Programs.Exceptions.Test;

/*
* There are two main methods in this code:
* 1. exceptionCaughtMethod(): We are capturing the exception in the try catch block
* 2. noExceptionCaughtMethod(): We are NOT capturing the exception in the try catch block
*/

public class ExceptionTest {

    public void exceptionCaughtMethod() {
        try {
            int arr[] = {1,2,3,4};
            System.out.println(arr[-1]);
        } catch(Exception e) {
            System.out.println("Exception of the exceptionCaughtMethod() of ExceptionTest class: " + e.getMessage());
        } finally {
            System.out.println("Finally of the exceptionCaughtMethod() of ExceptionTest class");
        }

        System.out.println("After try-catch block of the exceptionCaughtMethod() of ExceptionTest class");
    }

    public void noExceptionCaughtMethod() {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(arr[-1]);
    }

    public static void main(String[] args) {

        ExceptionTest objExceptionTest = new ExceptionTest();

        // objExceptionTest.method1();

        objExceptionTest.exceptionCaughtMethod();

        // object.noExceptionCaughtMethod(); // Disurpt the program as there are no try catch block in the method

        System.out.println("\n1. ------------------------------------------------------------------------------------------\n");

        ExceptionTest2 objExceptionTest2 = new ExceptionTest2();
        objExceptionTest2.exceptionCaughtMethod();
        System.out.println();
        objExceptionTest2.noExceptionCaughtMethod();

        System.out.println("\n2. ------------------------------------------------------------------------------------------\n");
        System.out.println("End of the main method of ExceptionTest class");
    }

    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }

    public void method3() {
        int b = 5/0;
        System.out.println(b);
    }
}
