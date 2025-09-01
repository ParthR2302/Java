package OOPS.Programs.Interface;

/*
 * If we have an interface and there are numerous implementations of it. 
 * After some times, if we add a new method in interface, we will need to go to each class and implement that method.
 * 
 * We can have a default method in interface that would give same behaviour to all the classes that implement this interface.
 * 
 * Implementing class can either Override the default method or can leave it as it as.
 * 
 * Point-2
 * If we implement more than one interface and all the parent interface have same name for one of its Default methods, 
 * we need to Override that default method in child class in order to avoid the Diamon problem
 * 
 * Point-3:
 * Eventhough the grand parent has a method as default, if the parent interface has made that method abstract,
 * We must provide body for that method in a class that implements the parent interface
 * 
 * Point-3:
 * Eventhough the grand parent has a method as default, if the parent interface has overridden that method with its own default method,
 * the child object of parent interface would refer to parent interface for that method
 */

interface Bird {
    void canFly();

    default int getMinimumHeight() {
        return 100;
    }
}

class Eagle implements Bird {
    @Override
    public void canFly() {
        System.out.println("Can Fly method of Eagle class");
    }
}

class Croww implements Bird {
    @Override
    public void canFly() {
        System.out.println("Can Fly method of Croww class");
    }
}

class Hen implements Bird {
    @Override
    public void canFly() {
        System.out.println("Can Fly method of Hen class");
    }

    @Override
    public int getMinimumHeight() {
        return 50;
    }
}

// ---------------------------------------------------------------------------------------- Point-2

interface Vehicle {
    default boolean canRun() {
        return true;
    }
}

interface WaterVehicle {
    default boolean canRun() {
        return false;
    }
}

class NewVehicle implements Vehicle, WaterVehicle {
    // We must provide implementation as canRun is a default method in more than one parent interface
    // If anyone of the parent interface didn't have this default method (In simple terms, only one parent interface have a default method with that specific name),
    // then we wouldn't have needed to Override the method here.
    @Override
    public boolean canRun() {
        return true;
    }
}

// ---------------------------------------------------------------------------------------- Point-3

interface SomeVehicleInterface extends Vehicle {
    boolean canRun();
}

class SomeVehicleClass implements SomeVehicleInterface {
    // We must Override this method as eventhough the grand parent has this method as default, the parent interface has made this method abstract
    @Override
    public boolean canRun() {
        return true;
    }
}

public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird croww = new Croww();
        Bird hen = new Hen();

        System.out.println(eagle.getMinimumHeight() + " " + croww.getMinimumHeight() + " " + hen.getMinimumHeight());

        Vehicle newVehicle = new NewVehicle();
        System.out.println(newVehicle.canRun());
    }
}
