package OOPS.Programs.AccessModifiersPackage.Package2;
import OOPS.Programs.AccessModifiersPackage.Package1.*;

public class Pack2Class {
    public static void main(String[] args) {
        Pack1Class obj = new Pack1Class();

        // obj.display(); // Error. display() method of Pack1Class class is not visible
        obj.publicDisplay(); // AM of publicDisplay is public.
    }
}
