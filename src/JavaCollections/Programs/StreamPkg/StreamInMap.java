package JavaCollections.Programs.StreamPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamInMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Blueberry");

        System.out.println(
                "\n--------------------------------------- Stream over keys ---------------------------------------\n");
        map.keySet()
                .stream()
                .filter(k -> k % 2 == 0)
                .forEach((Integer key) -> System.out.println(key));

        System.out.println(
                "\n--------------------------------------- Stream over values ---------------------------------------\n");
        map.values()
                .stream()
                .filter(v -> v.startsWith("B"))
                .forEach(System.out::println);

        System.out.println(
                "\n--------------------------------------- Stream over entries ---------------------------------------\n");
        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue().startsWith("B"))
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));

        System.out.println(
                "\n--------------------------------------- Transform to other Map ---------------------------------------\n");
        Map<Integer, String> filtered = map.entrySet()
                .stream()
                .filter(e -> e.getValue().startsWith("B"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        filtered.forEach((key, value) -> System.out.println(key + " => " + value));

    }
}
