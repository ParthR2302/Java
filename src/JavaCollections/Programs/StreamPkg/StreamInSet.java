package JavaCollections.Programs.StreamPkg;

import java.util.HashSet;
import java.util.Set;

public class StreamInSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Berry");
        set.add("Mango");
        set.add("Blueberry");

        set.stream()
                .filter(fruit -> fruit.startsWith("B"))
                .forEach(System.out::println);

    }
}
