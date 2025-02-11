package Basics.Programs;

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println(args[1]);
        // To run this, go to the location of src in terminal.
        // Compile this file from that location: javac Basics/Programs/CommandLineArguments.java
        // Run this file from that location with arguments: java Basics/Programs/CommandLineArguments Parth Rathod
            // We need to pass the arguments as space-separated values
            // args[0] = Parth, args[1] = Rathod

        // Why go to src? That is the root of the current Java Project
    }
}
