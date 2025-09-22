package Basics.Programs.Exceptions.Test;

public class ExceptionTest2 {

    public void exceptionCaughtMethod() {
        ExceptionTest obj = new ExceptionTest();
        try {
            // Try running them one-by-one and together. 3 cases
            obj.exceptionCaughtMethod();
            obj.noExceptionCaughtMethod();

            /*
                - If we only keep obj.exceptionCaughtMethod();, then
                    - It will go in the catch and finally block of exceptionCaughtMethod() of ExceptionTest class,
                    - Then it will directly go to finally block of this method, as the exception was caught in the called method, hence no need to go to catch block of this method

                - If we only keep obj.noExceptionCaughtMethod();, then
                    - It will go to the catch and finally block of this method, as there are no protocols to catch exception written in the parent method

                - If we keep both methods, then
                    - WRT exceptionCaughtMethod(), it will go to catch and finally block of exceptionCaughtMethod() of ExceptionTest class,
                    - It will then go to catch and finally both blocks of this method for noExceptionCaughtMethod() call.
            */
        } catch(Exception e) {
            System.out.println("Exception of the exceptionCaughtMethod() of ExceptionTest2 class: " + e.getMessage());
        } finally {
            System.out.println("Finally of the exceptionCaughtMethod() of ExceptionTest2 class");
        }

        System.out.println("After try-catch block of the exceptionCaughtMethod() of ExceptionTest2 class");
    }

    public void noExceptionCaughtMethod() {
        ExceptionTest obj = new ExceptionTest();
        obj.exceptionCaughtMethod();
        obj.noExceptionCaughtMethod();

        /*
            - Three cases here as well,

            - If we only keep obj.exceptionCaughtMethod();, then
                - It will go to catch and finally block of method of ExceptionTest class, and then continue in this method without code breaking

            - If we only keep obj.noExceptionCaughtMethod();, then
                - The exception will not be caught by any catch block and program will stop running (break)
            
            - If we keep both methods, then
                - It will go to catch and finally block of exceptionCaughtMethod() of ExceptionTest class
                - It will then break while trying to excute noExceptionCaughtMethod()
        */

        System.out.println("End of the exceptionCaughtMethod() of ExceptionTest2 class");
    }

    public static void main(String[] args) {

    }
}
