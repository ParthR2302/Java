package OOPS.Programs.TypeOfClasses.SingletonClasses;

class DBConnection3 {
    private static DBConnection3 connObject;

    private DBConnection3() {}

    // Making the method synchronized - synchronized puts lock and unlock mechanism
    synchronized public static DBConnection3 getInstance() {
        if(connObject == null) {
            connObject = new DBConnection3();
        }

        return connObject;
    }

    public void method() {}
}

public class SynchronizationBlock {
    public static void main(String[] args) {
        DBConnection3 connObject = DBConnection3.getInstance();
        DBConnection3 connObject2 = DBConnection3.getInstance();

        connObject.method();
        connObject2.method();
    }
}
