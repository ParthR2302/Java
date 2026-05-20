package Basics.Programs.ThreadPkg.SharedResourcePkg;

public class SharedResourceMain {
    public static void main(String[] args) {

        System.out.println("Main method started");

        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(new ProduceTask(sharedResource), "Producer-Thread");
        Thread consumerThread = new Thread(new ConsumeTask(sharedResource), "Consumer-Thread");

        producerThread.start();
        consumerThread.start();

        // Wait for producer and consumer threads to finish before exiting main
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            // Restore interrupted status and print a short message
            Thread.currentThread().interrupt();
            System.out.println("Main thread was interrupted while waiting for child threads");
        }

        System.out.println("Main method ended");
    }
}
