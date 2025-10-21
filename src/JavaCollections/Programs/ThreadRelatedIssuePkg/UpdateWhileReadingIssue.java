package JavaCollections.Programs.ThreadRelatedIssuePkg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UpdateWhileReadingIssue {
    public static void main(String[] args) {
        updateWhileReading();
    }

    public static void updateWhileReading() {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(12);
        set.add(33);
        set.add(4);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("Value: " + value);

            if(value == 12) {
                set.add(99);
                set.add(100);
                set.add(101);
                set.add(102);
                // Theoratically this will throw ConcurrentModificationException
                // but in HashSet it may or may not throw exception

                /*
                 * HashSet’s fail-fast behavior is best-effort, not guaranteed.
                 * HashSet internally uses a HashMap.
                 * Each modification (add, remove, clear, etc.) increments a field called modCount in HashMap.
                 * When you create an iterator (set.iterator()), the iterator captures this value as expectedModCount.
                 * During iteration, before returning each element, the iterator checks: 
                 * 
                 * if (modCount != expectedModCount) {
                 *     throw new ConcurrentModificationException();
                 * }
                 * 
                 * That check happens only when iterator methods (next(), remove()) are called — not when you modify the collection.
                 * 
                 * sometimes, depending on internal bucket structure, rehashing, and timing,
                 * the iterator might not immediately notice* that modCount changed until the next call to iterator.next() if that next element happens to be in the same bucket or already cached.
                 *
                 * In other words — the exception is not guaranteed to be thrown immediately.
                 * It’s “best effort”, not “fail-safe”.
                 * 
                 * Notes from Official Java Docs:
                 * “The iterators returned by this class are fail-fast: if the set is structurally modified at any time after the iterator is created, in any way except through the iterator’s own remove method, the iterator will throw a ConcurrentModificationException.
                 * However, fail-fast behavior cannot be guaranteed, as it is impossible to make any hard guarantees in the presence of unsynchronized concurrent modification.”
                */
            }
        }
        set.forEach(a -> System.out.print(a + " "));
        System.out.println();
    }
}
