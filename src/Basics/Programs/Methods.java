package Basics.Programs;
public class Methods {

    // This are non-static methods. We need to create an object in order to call them.
    // Static methods are included in the later section.
    public int add(int x, int y)
    {
        return x + y;
    }

    public void update(int var)
    {
        var = 10;
        System.out.println("Value of var in update function: " + var);
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        System.out.println(obj.add(4, 8));

        int var = 3;
        obj.update(var);
        System.out.println("Value of var in main function: " + var);
        // Java passes all primitive data types by value.
    }   
}
