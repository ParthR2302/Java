package JavaCollections.Programs.QueuePkg;

import java.util.Deque;
import java.util.LinkedList;

/*
 * Methods present in deque.
 * All the methods that are present in queue + additional method
 * Additional Methods: 
 * addFirst(), addLast()
 * offerFirst(), offerLast()
 * removeFirst(), removeLast()
 * pollFirst(), pollLast()
 * peekFirst(), peekLast()
 * 
 * 
 * Using Deque, we can implement Stack.
 * Deque has 2 methods, push() and pop().
 *  - push() and pop() internally work same as addFirst() and removeFirst() respectively.
*/

public class DequeClass {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.add(1); dq.add(2); dq.add(3); dq.add(1); dq.add(4); dq.add(1); dq.add(5); dq.add(1); dq.add(6); dq.add(1); dq.add(7); dq.add(8);

        dq.forEach((Integer ele) -> System.out.print(ele + " "));
        System.out.println();

        dq.pollFirst();
        dq.pollLast();

        dq.offerFirst(101);
        dq.offerLast(102);

        System.out.println("First ele: " + dq.peekFirst() + " " + dq.peek() + " " + dq.getFirst() + " " + dq.element());
        System.out.println("Last ele: " + dq.peekLast() + " " + dq.getLast());

        dq.forEach((Integer ele) -> System.out.print(ele + " "));
        System.out.println();

        dq.removeFirstOccurrence(1);
        dq.removeLastOccurrence(1);

        dq.forEach((Integer ele) -> System.out.print(ele + " "));
        System.out.println();

        System.out.println("------------------------------ Stack Using Deque ------------------------------");

        StackUsingDeque st = new StackUsingDeque();
        st.method();
    }
}

class StackUsingDeque {
    Deque<Integer> dq;

    public StackUsingDeque() {
        dq = new LinkedList<>();
    }

    public void method() {
        dq.push(1);
        dq.push(2);
        dq.push(3);
        dq.push(4);
        dq.push(5);

        dq.forEach((Integer ele) -> System.out.print(ele + " "));
        System.out.println();

        dq.pop();
        dq.pop();

        dq.forEach((Integer ele) -> System.out.print(ele + " "));
        System.out.println();
    }
}