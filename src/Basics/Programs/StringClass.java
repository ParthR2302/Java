package Basics.Programs;

public class StringClass {
    public static void main(String[] args) {
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
