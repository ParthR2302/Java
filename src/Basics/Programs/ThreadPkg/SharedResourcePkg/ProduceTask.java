package Basics.Programs.ThreadPkg.SharedResourcePkg;

public class ProduceTask implements Runnable {
    SharedResource sharedResource;

    public ProduceTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Producer Thread: " + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Handle exception
        }

        sharedResource.addItem();
    }
}
