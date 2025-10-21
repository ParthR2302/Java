package JavaCollections.Programs.SetPkg;

import java.util.HashSet;
import java.util.Iterator;
// import java.util.Set;
// import java.util.concurrent.ConcurrentHashMap;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();

        hashSet1.add(12);
        hashSet1.add(11);
        hashSet1.add(32);
        hashSet1.add(3);
        hashSet1.add(36);

        // traverse in set using iterator
        System.out.println("Traversing HashSet using Iterator:");
        Iterator<Integer> iterator = hashSet1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        System.out.println("--------------------------------- Additional Methods --------------------------------");

        HashSet<Integer> hashSet12 = new HashSet<>();
        hashSet12.add(11);
        hashSet12.add(9);
        hashSet12.add(88);
        hashSet12.add(10);
        hashSet12.add(5);
        hashSet12.add(12);

        System.out.println("First HashSet: " + hashSet1);
        System.out.println("Second HashSet: " + hashSet12);

        // Union
        HashSet<Integer> unionSet = new HashSet<>(hashSet1);
        unionSet.addAll(hashSet12);
        System.out.println("Union of two HashSets: " + unionSet);

        // Difference
        HashSet<Integer> differenceSet = new HashSet<>(hashSet1);
        differenceSet.removeAll(hashSet12);
        System.out.println("Difference of two HashSets: " + differenceSet);

        // Intersection
        HashSet<Integer> intersectionSet = new HashSet<>(hashSet1);
        intersectionSet.retainAll(hashSet12);
        System.out.println("Intersection of two HashSets: " + intersectionSet);

        /*
            System.out.println("--------------------------------- Thread Safe Version --------------------------------");

            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Set<Integer> threadSafeSet = concurrentHashMap.newKeySet();
            threadSafeSet.add(1);
            threadSafeSet.add(2);
        */
    }
}
