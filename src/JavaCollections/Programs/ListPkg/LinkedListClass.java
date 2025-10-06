package JavaCollections.Programs.ListPkg;

import java.util.LinkedList;

/*
 * Methods:
 * All the methods of List interface.
 * - getFirst(), getLast()
 * - peek()
 * - poll() -> retrieves and removes the head element
 * - toArray()
 */

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Ele1");
        ll.add("Ele2");
        ll.add(1, "Ele3");

        System.out.println(ll);
        System.out.println("Element at index 2: " + ll.get(2));

        System.out.println("\nBreak 1 --------------------------------------------------------------------------------\n");

        System.out.println("First element without removal: " + ll.peek());
        System.out.println("First element with removal: " + ll.poll());

        System.out.println(ll);

        ll.set(0, "NewEle1");

        ll.add("NewEle1");
        ll.add("NewEle1");
        ll.add(0, "NewEle0");
        ll.add(1, "NewEle11");

        System.out.println("\nBreak 2 --------------------------------------------------------------------------------\n");

        System.out.println("Before removal: " + ll);
        ll.remove("NewEle1");
        ll.remove(1);
        System.out.println("Before removal: " + ll);

        System.out.println("\nBreak 3 --------------------------------------------------------------------------------\n");

        ll.add("NewEle11");
        ll.add(1, "NewEle11");
        System.out.println(ll);
        ll.removeIf(ele -> ele.equals("NewEle11"));
        System.out.println(ll);

        System.out.println("\nBreak 4 --------------------------------------------------------------------------------\n");

        Object[] strArr = ll.toArray();
        for(Object str : strArr) System.out.print(str + " ");

    }
}
