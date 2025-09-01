package OOPS.Programs.Interface;

/*
 * private methods of Interface can be used inside the interface only, that too by a default or a static method
 * 
 * Private methods helps in code reusability and readability.
 *  - If there are multiple default/static methods and 80% of the code in them is similar, to avoid code duplication,
 *  - We can put that code in a private method and call that private method in each default method where it can be used.
 */

interface Bird1 {

    void canFly(); // This is equivalent to public abstract void canFly();
    
    public default void minimumFlyingHeight() {
        myStaticPublicMethod(); // Calling static method
        myPrivateMethod(); // Calling Private method
        myPrivateStaticMethod(); // Calling Private Staic method
    }

    static void myStaticPublicMethod() {
        myPrivateStaticMethod(); // From static, we can call other static methods only.
    }
    
    private void myPrivateMethod() {
        // Private method implementation 
    }

    private static void myPrivateStaticMethod() {
        // Private static method implementation
    }
}

public class PrivateAndPrivateStaticMethodsInInterface {

}
