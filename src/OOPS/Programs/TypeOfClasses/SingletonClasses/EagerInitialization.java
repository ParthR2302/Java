package OOPS.Programs.TypeOfClasses.SingletonClasses;

class DBConnection1 {
    private static DBConnection1 conObject = new DBConnection1(); // Eager creation
    // private static: So that object belongs to the class (one copy only) and no one apart from this class can access it.
    // Even if we create multiple objects, this conObject would be same for each created objects.

    private DBConnection1() {
        // Private constructor: No one can create a new instance using new keyword
    }

    public static DBConnection1 getInstance() {
        return conObject;
    }

    public void method() {}
}

public class EagerInitialization {
    public static void main(String[] args) {
        DBConnection1 connObject = DBConnection1.getInstance();
        connObject.method();
    }
}
