package Basics.Programs;
public class Loops {
    public static void main(String[] args) {
        // For Loops
        int num = 10;
        for(int i = 1;i<=num;i++)
        {
            if(i % 5 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop
        while(num >= 1)
        {
            System.out.print(num-- + " ");
        }
        System.out.println();

        // do-while loop. One block would execute every time. 
        // do while loop starts with the execution of the statement(s). There is no checking of any condition for the first time.
        do {
            System.out.print(num++ + " ");
        } while(num < 10);
    }
}
