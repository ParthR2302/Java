package Basics.Programs.ThreadPkg;

public class MonitorLockExplain {
    public synchronized void task1() {
        // Aquires monitor lock on this object
        try {
            System.out.println("Inside task-1");
            Thread.sleep(5000);
            System.out.println("Task-1 completed");
        } catch (Exception e) {
        }
    }

    public void task2() {
        System.out.println("Task-2, but before synchronised block");
        synchronized (this) {
            // Aquires monitor lock on this object - if already held by another thread, waits
            System.out.println("Inside task-2's synchronized block");
        }
    }

    public void task3() {
        // No synchronization here
        System.out.println("Inside task-3, non-synchronized method");
    }

    public static void main(String[] args) {
        MonitorLockExplain obj = new MonitorLockExplain();

        Thread t1 = new Thread(() -> obj.task1(), "Thread-1");
        Thread t2 = new Thread(() -> obj.task2(), "Thread-2");
        Thread t3 = new Thread(() -> obj.task3(), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
