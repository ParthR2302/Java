package JavaCollections.Programs.Comparators;

import java.util.Arrays;

class Car {
    String carName;
    String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    public String toString() {
        return "Car: " + carName + ", Type: " + carType;
    }
    
}

public class ObjectsCollectionSorting {
    public static void main(String[] args) {

        Integer[] arr = {8,2,52,6,1,78,10};
        Arrays.sort(arr);
        
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println("\n-------------------------------------------------------");

        Arrays.sort(arr, (Integer v1, Integer v2) -> v2 - v1);
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println("\n-------------------------------------------------------");

        Car[] carArr = new Car[4];
        carArr[0] = new Car("Sedan", "Diesel");
        carArr[1] = new Car("SUV", "Petrol");
        carArr[2] = new Car("Sports", "Hybrid");
        carArr[3] = new Car("HatchBack", "CNG");

        // Arrays.sort(carArr); // Error: class JavaCollections.Programs.Comparators.Car cannot be cast to class java.lang.Comparable
        for(Car ele : carArr) System.out.println(ele);
        System.out.println("-------------------------------------------------------");
        
        Arrays.sort(carArr, (c1, c2)->c1.carName.compareTo(c2.carName)); // Sorting in Ascending order of carName
        System.out.println("Cars Array sorted in ascending order for carName:");
        for(Car ele : carArr) System.out.println(ele);
        System.out.println("-------------------------------------------------------");
        
        Arrays.sort(carArr, (c1, c2)->c2.carName.compareTo(c1.carName)); // Sorting in Descending order of carName
        System.out.println("Cars Array sorted in descending order for carName:");
        for(Car ele : carArr) System.out.println(ele);
    }
}
