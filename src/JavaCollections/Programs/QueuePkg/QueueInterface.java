package JavaCollections.Programs.QueuePkg;

import java.util.*;

/*
 * New methods which Queue Interface has
 * - add(): If insertion fails, throw an Exception
 * - offer(): If insertion fails, return false
 * - poll(): Retrieves and Removes head of the queue. Returns Null if Queue is empty.
 * - remove(): Retrieves and Removes head of the queue. Returns Exception (NoSuchElementException) if Queue is empty.
 * - peek(): Retrieve the present at the head of Queue. No removal. Null if queue is empty.
 * - element(): Retrieve the present at the head of Queue. No removal. NoSuchElementException exception if queue is empty.
*/

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Why use LinkedList?
        // Because Java's Queue is just an interface — it doesn’t store elements itself.
        // We need a concrete class that implements the queue behavior, and LinkedList is one of the built-in implementations that behaves like a FIFO (First-In-First-Out) queue.

        q.add(4);
        q.offer(10);
        q.add(1);

        q.forEach((Integer ele) -> System.out.print(ele + " "));
        System.out.println();

        Integer front = q.poll();
        System.out.println("Using poll: " + front);
        front = q.remove();
        System.out.println("Using remove: " + front);
        front = q.peek();
        System.out.println("Using peek: " + front);
        front = q.element();
        System.out.println("Using element: " + front);

        q.remove();

        System.out.println("Is empty: " + q.isEmpty());

        try {
            q.remove();
        } catch (Exception e) {
            System.out.println("Exception while doing remove(): " + e);
        }

        front = q.poll();
        System.out.println(front == null ? "Poll returned null" : "Poll returned: " + front);

        try {
            q.element();
        } catch (Exception e) {
            System.out.println("Exception while doing element(): " + e);
        }

        System.out.println(q.peek() == null ? "Peek returned null" : "Peek returned: " + q.peek());
    }
}
