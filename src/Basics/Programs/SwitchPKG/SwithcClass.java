package Basics.Programs.SwitchPKG;

/*
 * How to return value from switch statements 
*/

public class SwithcClass {
    public static void main(String[] args) {
        
        // Use of Case N->
        String day = "";
        int val = 1;

        day = switch (val) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> "None";
        };

        System.out.println(day);

        // Use of yeild
        val = 2;
        String outputVal = switch(val) {
            case 1 -> {
                // (val % 2 == 0) ? System.out.println("Even") : System.out.println("Odd");
                val += 10;
                yield "One";
            }
            case 2 -> {
                val += 20;
                yield "Two";
            }
            default -> {
                val = 0;
                yield "None";
            }
        };

        System.out.println(outputVal + " " + val);


    }
}
