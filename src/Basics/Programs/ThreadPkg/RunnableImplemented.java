package Basics.Programs.ThreadPkg;

public class RunnableImplemented implements Runnable {
    @Override
    public void run() {
        System.out.println("Code executed by thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("Going inside main method: " + Thread.currentThread().getName());

        RunnableImplemented obj = new RunnableImplemented();
        Thread thread1 = new Thread(obj); // Thread is created for Runnable object
        Thread thread2 = new Thread(obj, "Custom-Thread-2");
        thread1.start(); // We are starting the thread which calls run() method
        thread2.start();

        // thread1.run(); // This will not create a new thread, just a normal method call
        // For this reason, we always use start() method to start a thread

        System.out.println("Finished main method: " + Thread.currentThread().getName());
    }
    
}
