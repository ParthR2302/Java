package JavaCollections.Programs.QueuePkg;

import java.util.PriorityQueue;

public class MinimumPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // When no comparator is provided, default ordering is applied.
        // Ascending in terms of numbers
        // Lexicographically in terms of characters and Strings

        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);

        // Print all
        minHeap.forEach((Integer ele) -> System.out.print(ele + " "));
        System.out.println();

        while(!minHeap.isEmpty()) {
            int topEle = minHeap.poll();
            System.out.println("Removed top element: " + topEle);
        }
    }
}
