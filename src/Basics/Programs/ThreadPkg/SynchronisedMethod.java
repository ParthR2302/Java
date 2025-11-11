package Basics.Programs.ThreadPkg;

public class SynchronisedMethod implements Runnable {

    public synchronized void synchronizedMethod() {
        System.out.println("\nSynchronized Method started by Thread: " + Thread.currentThread().getName() + "\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Synchronized Method - Count: " + i + " | Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100); // Simulating some work with sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nSynchronized Method ended by Thread: " + Thread.currentThread().getName() + "\n");
    }

    public void nonSynchronizedMethod() {
        System.out.println("\nNon-Synchronized Method started by Thread: " + Thread.currentThread().getName() + "\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Synchronized Method - Count: " + i + " | Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100); // Simulating some work with sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nNon-Synchronized Method ended by Thread: " + Thread.currentThread().getName() + "\n");
    }

    public void synchronizedBlockMethod() {
        System.out.println("\nSynchronized Block Method started line-1 by Thread: " + Thread.currentThread().getName() + "\n");
        System.out.println("\nSynchronized Block Method started line-2 by Thread: " + Thread.currentThread().getName() + "\n");
        
        for(int i=1;i<=3;i++) {
            System.out.println("Non-Synchronized Part - Count: " + i + " | Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100); // Simulating some work with sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (this) {
            for(int i=4;i<=6;i++) {
                System.out.println("Synchronized Part - Count: " + i + " | Thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100); // Simulating some work with sleep
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        for(int i=7;i<=9;i++) {
            System.out.println("Non-Synchronized Part - Count: " + i + " | Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100); // Simulating some work with sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nSynchronized Block Method ended line-1 by Thread: " + Thread.currentThread().getName() + "\n");
        System.out.println("\nSynchronized Block Method ended line-2 by Thread: " + Thread.currentThread().getName() + "\n");
    }
    
    @Override
    public void run() {
        // synchronizedMethod();
        // nonSynchronizedMethod();
        synchronizedBlockMethod();
    }
    public static void main(String[] args) {

        /*
         * Cases:
         * 1. Single instance of SynchronisedMethod shared between multiple threads (synchronizedMethod behavior)
         * 2. Single instance of SynchronisedMethod shared between multiple threads (nonSynchronizedMethod behavior)
         * 3. Separate instances of SynchronisedMethod for each thread (synchronizedMethod behavior)
         * 
         * 4. Single instance of SynchronisedBlockMethod shared between multiple threads (synchronizedBlockMethod behavior)
         * 5. Separate instances of SynchronisedBlockMethod for each thread (synchronizedBlockMethod behavior)
        */

        // // Creating a single instance of SynchronisedMethod
        // SynchronisedMethod obj = new SynchronisedMethod();
        // Thread t1 = new Thread(obj, "Thread-1");
        // Thread t2 = new Thread(obj, "Thread-2");
        // t1.start();
        // t2.start();

        // Creating separate instances to demonstrate non-synchronized behavior
        SynchronisedMethod obj1 = new SynchronisedMethod();
        SynchronisedMethod obj2 = new SynchronisedMethod();
        Thread t3 = new Thread(obj1, "Thread-3");
        Thread t4 = new Thread(obj2, "Thread-4");
        t3.start();
        t4.start();
    }
}
