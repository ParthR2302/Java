package Basics.Programs;

public class VariableArgs {
    public static void Names(String... n) {
        for (String str : n) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public void cnt(int... numbers) {
        // To get the number of arguments.
        int len = numbers.length;
        System.out.println("Number of arguments: " + len);
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void method(String str, int... args) {
        System.out.println("Value of string: " + str);
        System.out.print("Values in args: ");
        for (int ele : args) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    /*
     * 
     * Error Examples: 
     * 
     * public void method1(String... args1, int... args2)
     * {
     * // Error: The variable argument type String of the method method must be the
     * last parameter
     * }
     * 
     * public void method2(String... args, String str) {
     * // Error: The variable argument type int of the method method must be the
     * last parameter
     * }
     * 
     */

    public static void main(String[] args) {
        System.out.println("Calling the Names() method");
        VariableArgs.Names("Parth", "Rathod");
        VariableArgs.Names("Name1", "Name2", "Name3");

        System.out.println();
        System.out.println("Break 1 -----------------------------------");
        System.out.println();

        System.out.println("Calling the cnt() method");
        VariableArgs obj = new VariableArgs();
        obj.cnt(1, 2, 6, 93, 67);

        System.out.println();
        System.out.println("Break 1 -----------------------------------");
        System.out.println();

        System.out.println("Calling the method() method");
        obj.method("Parth", 3, 6, 1, 19);

    }
}
