package JavaCollections.Programs.MapInterface.TreeMapPkg;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");

        // Displaying the TreeMap (it will be sorted by keys)
        System.out.println("TreeMap in ascending order of keys: " + treeMap);

        TreeMap<Integer, String> treeMap1 = new TreeMap<>((a, b) -> b - a);

        // Adding key-value pairs to the TreeMap
        treeMap1.put(3, "Three");
        treeMap1.put(1, "One");
        treeMap1.put(4, "Four");
        treeMap1.put(2, "Two");

        // Displaying the TreeMap (it will be sorted by keys)
        System.out.println("TreeMap in descending order of keys: " + treeMap1);

        // Additional Methods
        System.out.println("--------------------------------- Additional Methods --------------------------------");


        System.out.println("HeadMap (keys < 3): " + treeMap.headMap(3)); // from left to right excluding 3
        System.out.println("TailMap (keys >= 2): " + treeMap.tailMap(2)); // from right to left including 2
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        System.out.println();

        System.out.println("HeadMap (keys < 3): " + treeMap1.headMap(3)); // from left to right excluding 3
        System.out.println("TailMap (keys >= 2): " + treeMap1.tailMap(2)); // from right to left including 2
        System.out.println("First Key: " + treeMap1.firstKey());
        System.out.println("Last Key: " + treeMap1.lastKey());
    }
}
