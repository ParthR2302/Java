package OOPS.Programs.TypeOfClasses;

import java.util.ArrayList;
import java.util.List;

class PrintWildCards {
    // List of Vehicles or its child classes is allowed
    public void setPrintValues(List<? extends Vehicle> vehicleList) {
    }

    // List of Vehicles or its super classes is allowed
    public void setPrintValuesSuper(List<? super Vehicle> vehicleList) {
    }
}

public class WildCards {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Bus());
        vehicleList.add(new Car());
        List<Bus> busList = new ArrayList<>();
        List<SuperVehicle> superVehicleList = new ArrayList<>();

        /*
            // Vehicle vehicleObj = new Vehicle();
            // Bus busObj = new Bus();
            // vehicleObj = busObj; // Allowed, as Vehicle can store reference of Bus objects.
            // // busObj = vehicleObj; // Not allowed.

            // vehicleList = busList; // Error. Cannot convert List<Bus> to List<Vehicle>
        */

        PrintWildCards printObj = new PrintWildCards();
        printObj.setPrintValues(vehicleList);

        // printObj.setPrintValues(busList); // Error if setPrintValues() method has List<Vehicle> argument
        printObj.setPrintValues(busList); // No errors if setPrintValues() method has List<? extends Vehicle> argument
        // printObj.setPrintValues(superVehicleList); // Error, we need LowerBound wild card in order to solve this error

        printObj.setPrintValuesSuper(vehicleList);
        // printObj.setPrintValuesSuper(busList); // Error
        printObj.setPrintValuesSuper(superVehicleList);
    }
}

class SuperVehicle {}

class Vehicle extends SuperVehicle {}

class Bus extends Vehicle {}

class Car extends Vehicle {}


