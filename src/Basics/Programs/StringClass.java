package Basics.Programs;

public class StringClass {
    public static void main(String[] args) {
        
        // comparision();

        modify();
    }

    public static void modify() {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");

        System.out.println(s1 + " " + s2 + " " + s3); // hello hello hello
        change(s1); change(s2); change(s3);
        System.out.println(s1 + " " + s2 + " " + s3); // hello hello hello


    }

    public static void change(String s) {
        s = "dummy";
        s = new String("dummy1");
    }

    public static void comparision() {

        /*
         * .equals() check for the content where == checks for the memory location
        */

        String s1 = "Parth";
        String s2 = "Parth";

        if(s1 == s2) System.out.println("s1 == s2 returned true");
        else System.out.println("s1 == s2 returned false");

        if(s1.equals(s2)) System.out.println("s1.equals(s2) returned true");
        else System.out.println("s1.equals(s2) returned false");

        String s3 = new String("Rathod");
        String s4 = new String("Rathod");

        if(s3 == s4) System.out.println("s3 == s4 returned true");
        else System.out.println("s3 == s4 returned false");

        if(s3.equals(s4)) System.out.println("s3.equals(s4) returned true");
        else System.out.println("s3.equals(s4) returned false");
    }
}

