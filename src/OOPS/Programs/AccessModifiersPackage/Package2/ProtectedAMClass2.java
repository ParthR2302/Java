package OOPS.Programs.AccessModifiersPackage.Package2;

public class ProtectedAMClass2 {

    protected void draw()
    {
        System.out.println("Inside protected type draw() method of ProtectedAMClass2 class");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
    }
}

class Parent {
    protected void display() {
        System.out.println("Inside Protected method display() of ProtectedAMClass2 class");
    }
}
