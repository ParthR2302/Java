package JavaCollections.Programs.MapInterface.LinkedHashMapPkg;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        linkedHashMapVSHashMap();
        linkedHashMapAccessOrder();
        synchronizedLinkedHashMap();
    }

    public static void linkedHashMapVSHashMap() {
        System.out.println("------------------------ LinkedHashMap Example ------------------------");

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        linkedHashMap.put(1, "A");
        linkedHashMap.put(21, "B");
        linkedHashMap.put(23, "C");
        linkedHashMap.put(141, "D");
        linkedHashMap.put(25, "E");

        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap); // Order of insertion is preserved

        System.out.println("------------------------ HashMap Example ------------------------");

        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding elements to the HashMap
        hashMap.put(1, "A");
        hashMap.put(21, "B");
        hashMap.put(23, "C");
        hashMap.put(141, "D");
        hashMap.put(25, "E");

        // Displaying the HashMap
        System.out.println("HashMap: " + hashMap); // Order of insertion is not preserved
    }

    public static void linkedHashMapAccessOrder() {

        System.out.println("------------------------ LinkedHashMap Access Order Example ------------------------");

        // For using access order, we need to set the third parameter of the constructor to true
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        linkedHashMap.put(1, "A");
        linkedHashMap.put(21, "B");
        linkedHashMap.put(23, "C");
        linkedHashMap.put(141, "D");
        linkedHashMap.put(25, "E");

        System.out.println("Initial LinkedHashMap (Insertion Order): " + linkedHashMap);

        // Access some elements
        linkedHashMap.get(21);
        linkedHashMap.get(21);
        linkedHashMap.get(141);
        linkedHashMap.put(21, "P"); // If this line is commented, key 141 would be last in order.

        System.out.println("LinkedHashMap after accessing some elements (Access Order): " + linkedHashMap);
    }

    public static void synchronizedLinkedHashMap() {
        // Since, there is no thread-safe version of LinkedHashMap available, 
        // we need create a thread-safe version manually using synchronisedMap method of Collections class.
        java.util.Map<Integer, String> syncLinkedHashMap = java.util.Collections.synchronizedMap(new LinkedHashMap<>());
        syncLinkedHashMap.put(1, "A");
        syncLinkedHashMap.put(2, "B");
        System.out.println("Synchronized LinkedHashMap: " + syncLinkedHashMap);
    }
}
