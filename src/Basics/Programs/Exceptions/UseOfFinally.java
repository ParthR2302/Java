package Basics.Programs.Exceptions;

public class UseOfFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Before return");
            return;
            // System.out.println("After return"); // Error, non reachable
        } finally {
            // finally will get executed,
            // Unless any JVM errors like memory, system shutdown or process if forcefully killed
            System.out.println("Finally block");
        }
    }
}
