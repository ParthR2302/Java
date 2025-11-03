package Basics.Programs.ThreadPkg;

class SubClass extends Thread{

    public SubClass() {
        super();
    }

    public SubClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Code executed by thread: " + Thread.currentThread().getName());
    }
}

public class ThreadSubClass extends Thread{
    public static void main(String[] args) {
        System.out.println("Main thread started: " + Thread.currentThread().getName());
        SubClass t1 = new SubClass();
        SubClass t2 = new SubClass("Custom-Thread-2");
        t1.start();
        t2.start();
        System.out.println("Main thread ended: " + Thread.currentThread().getName());
    }
}
