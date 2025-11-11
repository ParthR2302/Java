package Basics.Programs.ThreadPkg.SharedResourcePkg;

public class SharedResource {
    boolean itemAvailable = false;
    
    // synchronized puts the monitor lock on the object (here SharedResource object)
    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Item added by " + Thread.currentThread().getName() + " and invoking all threads which are waiting");
        notifyAll(); // Notify a waiting thread that an item is available
    }

    public synchronized void consumeItem() {
        System.out.println(Thread.currentThread().getName() + " is trying to consume an item.");

        // Using while loop to avoid spurious wakeups, sometimes because of system noise
        // We can use if here as well, but while is preferred
        while(!itemAvailable) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting now.");
                wait(); // It releases the monitor lock and waits until notified
            } catch (Exception e) {
                // Handle exception
            }
        }

        System.out.println("Item consumed by: " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}
