package Basics.Programs;

import java.util.Scanner;

public class UserInputs {
    public static void intScan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        System.out.println("Your entered number is " + num);
        sc.close();
    }

    public static void func() {
        Scanner scn = new Scanner(System.in);

        String str1, str2;

        str1 = scn.next();
        str2 = scn.next();

        System.out.println("str1 is: " + str1);
        System.out.println("str2 is: " + str2);
        System.out.println("Concatinated string is: " + (str1 + str2));

        scn.close();
    }

    public static void hybridScan() {
        System.out.print("Please enter a string: ");
        Scanner scn = new Scanner(System.in);

        // We use next() or nextLine() methods to scan String
        // Enter "This is the scanned line" as input.
        String str = scn.next();
        System.out.println("Your entered string is: " + str);
        scn.nextLine();
        // The above nextLine() would scan the remaining " is the scanned line". next()
        // method only scanned the "This" string.

        System.out.print("Please enter a line: ");
        str = scn.nextLine();

        System.out.println("Your enterd line is: " + str);

        scn.close();
    }

    public static void main(String[] args) {
        // UserInputs.intScan();

        UserInputs.func();

        // UserInputs.hybridScan();
    }
}
