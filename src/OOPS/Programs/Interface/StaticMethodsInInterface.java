package OOPS.Programs.Interface;

/*
 * We can provide the implementation of a method in interface.
 * But it cannot be overriden by classes which implement the interface.
 * We can access them using Interface name.
 * By default they are public
*/

interface Interface1 {

    static boolean method() {
        return true;
    }
}

class ImplementingClass1 implements Interface1 {
    // // Error - We cannot override this method, however we can use it by accessing using interface name.
    // @Override
    // public boolean method() {
    //     return false;
    // }

    public void classMethod() {
        if(Interface1.method()) {
            System.out.println("Inside classMethod");
        }
    }
}

public class StaticMethodsInInterface {
    public static void main(String[] args) {
        Interface1.method();

        ImplementingClass1 obj = new ImplementingClass1();
        obj.classMethod();
    }
}
