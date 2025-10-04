package JavaCollections.Programs.QueuePkg;

import java.util.PriorityQueue;

public class MaximumPriorityQueue {
    public static void main(String[] args) {
        // // Both of the below creation methods are same
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Integer a, Integer b) -> b - a);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Integer a, Integer b) -> b.compareTo(a));

        maxHeap.add(5);
        maxHeap.add(2);
        maxHeap.add(8);
        maxHeap.add(1);

        // Print all
        maxHeap.forEach((Integer ele) -> System.out.print(ele + " "));
        System.out.println();

        while(!maxHeap.isEmpty()) {
            int topEle = maxHeap.poll();
            System.out.println("Removed top element: " + topEle);
        }
    }
}
