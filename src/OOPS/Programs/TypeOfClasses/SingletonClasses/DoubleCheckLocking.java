package OOPS.Programs.TypeOfClasses.SingletonClasses;

// To overcome the slowness issue of synchronization method

class DBConnection4 {

    // volatile here is important
    private static volatile DBConnection4 connObject;

    private DBConnection4() {}

    synchronized public static DBConnection4 getInstance() {
        if(connObject == null) {
            synchronized (DBConnection4.class) {
                if(connObject == null) {
                    connObject = new DBConnection4();
                }
            }
        }

        return connObject;
    }

    public void method() {}
}

public class DoubleCheckLocking {
    public static void main(String[] args) {
        DBConnection4 connObject = DBConnection4.getInstance();
        DBConnection4 connObject2 = DBConnection4.getInstance();

        connObject.method();
        connObject2.method();
    }
}
