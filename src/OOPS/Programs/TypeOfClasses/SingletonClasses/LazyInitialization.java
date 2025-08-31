package OOPS.Programs.TypeOfClasses.SingletonClasses;

class DBConnection2 {
    private static DBConnection2 connObject;

    private DBConnection2() {}

    public static DBConnection2 getInstance() {
        if(connObject == null) {
            // System.out.println("Object is not created | Creating a new Object");
            connObject = new DBConnection2();
        } 
        // else {
        //     System.out.println("Returning the already created Object");
        // }

        return connObject;
    }

    public void method() {}
}

public class LazyInitialization {
    public static void main(String[] args) {
        DBConnection2 connObject = DBConnection2.getInstance();
        DBConnection2 connObject2 = DBConnection2.getInstance();

        connObject.method();
        connObject2.method();
    }
}
