package JavaCollections.Programs.MapInterface.HashMapPkg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * Methods:
 * - size()
 * - isEmpty()
 * - containsKey(key)
 * - containsValue(key)
 * - get(key)
 * - put(k,v)
 * - remove(k)
 * - putAll(Map<k,v>)
 * - clear()
 * - putIfAbsent(k,v): If key is absent or the value for that key is null, then only adds the entry.
 * - getOrDefault(k, defaultValue) 
 * 
 * - Set<k> keySet()
 * - Collection<v> values()
 * - Set<Map.entry<k,v>> entrySet()
*/

public class HashMapClass {
    public static void main(String[] args) {
        HashMapClass.simpleMethod();
    }

    public static void simpleMethod() {
        HashMap<Integer, String> map = new HashMap<>();

        System.out.println("Is map empty? " + map.isEmpty());

        map.put(null, "NoKey"); // key can be null
        map.put(0, null); // value can be null
        map.put(4, "Parth");
        map.put(2, "Bhagi");
        map.put(3, "Sanjeev-dummy");
        map.put(1, "Nikhil");
        map.put(3, "Sanjeev"); // updates value for key 3

        // Print all key-value pairs using forEach
        System.out.println("-------------------------- Map contents using forEach --------------------------");
        map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        // Iterate over all key-value pairs using entrySet
        System.out.println("-------------------------- Iterate using entrySet --------------------------");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Use of containsKey and remove
        System.out.println("-------------------------- Use of containsKey and remove --------------------------");
        System.out.println("Is key 20 present? " + map.containsKey(20));
        System.out.println("Is key 2 present? " + map.containsKey(2));
        map.remove(2);
        map.remove(20); // no error if key not present
        System.out.println("Is key 2 present? " + map.containsKey(2));

        // Use of putIfAbsent
        System.out.println("-------------------------- Use of putIfAbsent --------------------------");
        System.out.println("Value for key 4: " + map.get(4));
        map.putIfAbsent(4, "New-name-nikhil");
        System.out.println("Value for key 4: " + map.get(4));

        System.out.println("Value for key 0: " + map.get(0));
        map.putIfAbsent(0, "New-entry");
        System.out.println("Value for key 0: " + map.get(0));

        // Use of getOrDefault
        System.out.println("-------------------------- Use of getOrDefault --------------------------");
        System.out.println("Value for key 1: " + map.getOrDefault(1, "Default-Value"));
        System.out.println("Value for key 10: " + map.getOrDefault(10, "Default-Value"));

        // use of get for non-existing key
        System.out.println("-------------------------- Use of get for non-existing key --------------------------");
        System.out.println("Value for key 20: " + map.get(20)); // returns null

        // Set<k> keySet(), Collection<v> values(), Set<Map.entry<k,v>> entrySet()
        System.out.println("-------------------------- Use of keySet, values, entrySet --------------------------");
        
        System.out.print("Keys: ");
        for(Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        Collection<String> values = map.values();
        System.out.print("Values: ");
        for(String s : values) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
