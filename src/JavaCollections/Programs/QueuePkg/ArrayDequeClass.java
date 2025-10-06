package JavaCollections.Programs.QueuePkg;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(1);
        adq.addFirst(0);
        adq.addLast(2);
        adq.add(3);
        adq.add(4);
        adq.add(5);

        adq.forEach((Integer ele) -> System.out.print(ele + " "));
        System.out.println();

        /*
         * Other methods that can be used:
         * addFirst(), addLast()
         * offerFirst(), offerLast()
         * removeFirst(), removeLast()
         * pollFirst(), pollLast()
         * peekFirst(), peekLast() 
         * add():
         * offer():
         * poll():
         * remove():
         * peek():
         * element():
        */
    }
}
