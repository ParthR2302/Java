package JavaCollections.Programs.IterablePkg;

/*
 * Use of iterator() and forEach() methods of Iterable Interface 
*/

import java.util.*;

public class IterableInterface {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        // Use of iterator() method
        Iterator<Integer> it = values.iterator();

        System.out.println("Printing elements using iterator():");
        while(it.hasNext()) {
            int value = it.next();
            System.out.print(value + " ");

            if(value == 3) {
                it.remove();
            }
        }
        System.out.println();

        for(int val : values) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Print using forEach() method
        System.out.println("Printing elements using forEach():");
        values.forEach((Integer val) -> System.out.print(val + " "));
        System.out.println();

    }
}
