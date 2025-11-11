package Basics.Programs.ThreadPkg;

public class CallRunMethod implements Runnable{

    @Override
    public void run() {
        System.out.println("Going inside run method by thread: " + Thread.currentThread().getName());
    }

    public static void method1() {
        System.out.println("Going inside method1 by thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CallRunMethod obj = new CallRunMethod();
        Thread thread1 = new Thread(obj, "Thread-1");
        Thread thread2 = new Thread(() -> {method1();}, "Thread-2");

        thread1.start(); // This will create a new thread and call run() method
        thread2.start(); // This will create a new thread and call method1() via lambda
    }
}
