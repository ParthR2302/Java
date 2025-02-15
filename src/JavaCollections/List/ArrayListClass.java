package JavaCollections.List;

import java.util.ArrayList;
import java.util.List;

/*
 * Common methods of ArrayList class: 
 * - add(). [Using Object only -> add(<Object>), Using Object and Index -> add(<Index>, <Object>)]
 * - addAll(index, collection) [After Break 5 in the code]
 * - size()
 * - get(<Index>)
 * - set(<Index>, <Object>)
 * - clear() [Remove all the elements from the list, however the reference of the list created is still stored.]
 * - remove(). [Using Object -> remove(<Object>), Using Index -> remove(<Index>)]
 * - getFirst(), getLast(), getClass()
 * - indexOf(<Object>) [Returns the first index of the Object]
 * - lastIndexOf(<Object>)
 * - contains(<Object>)
 * - equals(collection) [Compare all the elements of the primary list with the passed list]
 *      - Three things are checked: same size, same elements in same order, elements are compared with their own equals method
 * 
 * - sort() ?
 * 
 * - Other methods: hashCode(), isEmpty(), containsAll(Collection)
 */

public class ArrayListClass {

    public static void printList(List<?> ls)
    {
        System.out.print("Entire list: ");
        for(Object obj : ls)
        {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("Java");
        ls.add("C++");
        ls.add("Python");
        ls.add(1, "SQL");

        System.out.println("Class of the list: " + ls.getClass());

        /*
         * Printing entire list:
         */
        ArrayListClass.printList(ls);
        
        /*
         * Printing size, element at given index, First Element and Last Element:
         */
        System.out.println("Sixe of the list is: " + ls.size());
        System.out.println("Element at index 1: " + ls.get(1));
        System.out.println("First Element: " + ls.getFirst() + ", Last Element: " + ls.getLast());

        System.out.println("\nBreak 1 ------------------------------------------------------------------------------------------\n");

        /*
         * Updating an element at given idnex and printing the updated list:
         */
        ls.set(1, "JavaScript");
        ArrayListClass.printList(ls);

        System.out.println("\nBreak 2 ------------------------------------------------------------------------------------------\n");

        /*
         * Removing and element from list using index and object.
         */
        ls.add("Dummy1");
        ls.add("Dummy2");
        ls.add("Dummy1");
        System.out.print("List before removing element: ");
        ArrayListClass.printList(ls);
        ls.remove("Dummy1"); // Using Object
        ls.remove(ls.size() - 1); // Using Index
        System.out.print("List after removing Dummy1 element: ");
        ArrayListClass.printList(ls);

        System.out.println("\nBreak 3 ------------------------------------------------------------------------------------------\n");

        /*
         * Getting index of elements:
         */
        ls.add(1, "Parth");
        ls.add(ls.size() - 2, "Parth");
        ArrayListClass.printList(ls);
        System.out.println("First index of Parth is: " + ls.indexOf("Parth"));
        System.out.println("Last index of Parth is: " + ls.lastIndexOf("Parth"));

        /*
         * Checking if object is present in the list or not
         */
        if(ls.contains("Parth123")) System.out.println("Yes, the list contains Parth123");
        else System.out.println("No, the list doesn not contain Parth123");

        System.out.println("\nBreak 4 ------------------------------------------------------------------------------------------\n");

        /*
         * Sorting the list
         */
        System.out.print("List before sorting: ");
        ArrayListClass.printList(ls);

        System.out.print("List after sorting: ");
        ArrayListClass.printList(ls);

        System.out.println("\nBreak 5 ------------------------------------------------------------------------------------------\n");
        /*
         * AddAll. Add all the elements from one collection into another collection
         */
        List<String> ls2 = new ArrayList<>();
        ls2.add("Ele1");
        ls2.add("Ele2");
        ls2.add("Ele3");

        System.out.print("Print ls2 list: ");
        ArrayListClass.printList(ls2);
        ls.addAll(2, ls2);
        System.out.print("Print ls list: ");
        ArrayListClass.printList(ls);

        if(ls.equals(ls2)) System.out.println("Both ls and ls2 are equal");
        else System.out.println("Both ls and ls2 are different");

    }
}
