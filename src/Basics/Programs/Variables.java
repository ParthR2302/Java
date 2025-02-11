package Basics.Programs;
public class Variables {

    public String name;
    public int age;

    static int cnt;

    Variables()
    {
        name = "Parth";
        age = 23;
    }

    public static void main(String[] args) {
        // Local Variables
        System.out.println("Local Variables");
        int x = 10; // x is local variable for the main method
        System.out.println("Local variable: " + x);

        // Instance Variables.
        System.out.println("Instance Variables");
        // To access the Instance variables, we need to create an instance of the class.
        Variables o1 = new Variables();
        System.out.println("Name: " + o1.name);

        // Static variables
        System.out.println("Static Variables");
        System.out.println(cnt);
        System.out.println(Variables.cnt);
        System.out.println(o1.cnt); // If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.

        o1.cnt = 17;

        Variables o2 = new Variables();
        System.out.println(o2.cnt);

        // Static methods and non static methods can access static variables and call static methods.
        // Non static methods and non static variables can only be accessed by the object of the class.

        cnt = 30; // No errors becuase cnt is a static variable
        // age = 30; // Error. age is a non static variable. To access it we need to create an object of the class.
        System.out.println(cnt);

        func();
    }

    public static void func()
    {
        int x = 5, y = 8;

        // concatenates x and y as
        // first x is added to "concatenation (x+y) = "
        // producing "concatenation (x+y) = 5"
        // and then 8 is further concatenated.
        System.out.println("Concatenation (x+y) = " + x + y);

        // addition of x and y
        System.out.println("Addition (x+y) = " + (x + y));
    }
}
