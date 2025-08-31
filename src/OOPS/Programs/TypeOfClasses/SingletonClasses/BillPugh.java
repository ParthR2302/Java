package OOPS.Programs.TypeOfClasses.SingletonClasses;

class DBConnection5 {

    private DBConnection5() {
        
    }

    private static class DBConnectionHelper {
        private static final DBConnection5 INSTANCE_OBJECT = new DBConnection5(); 
    }

    public static DBConnection5 getInstance() {
        return DBConnectionHelper.INSTANCE_OBJECT;
    }

    public void method() {}
}

public class BillPugh {
    public static void main(String[] args) {
        DBConnection5 connObject = DBConnection5.getInstance();
        connObject.method();
    }
}
