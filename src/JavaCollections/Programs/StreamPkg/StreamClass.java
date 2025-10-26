package JavaCollections.Programs.StreamPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Methods:
 * 
 * method-1: streamMethod()
 *  - Demonstrates filtering and sorting using streams.
 * 
 * method-2: waysToCreateStream()
 *  - Demonstrates different ways to create streams in Java. 
 * 
 * method-3: intermediateMethods()
 *  - Demonstrates some common intermediate methods.
 * 
 * method-4: lazyNatureOfIntermediateMethods()
 *  - Demonstrates the lazy nature of intermediate methods in streams.
 * 
 * method-5: sequenceOfStreamOperations()
 *  - Demonstrates the sequence of stream operations and their effects.
 * 
 * method-6: terminalOperations()
 *  - Demonstrates the use of terminal operations in streams.
 * 
 * method-7: parallelStreamExample()
 *  - Demonstrates the use of parallel streams in Java.
 * 
 * method-8: customFilterExample()
 *  - Demonstrates a custom filter example using streams.
*/

public class StreamClass {
    public static void main(String[] args) {
        // streamMethod();
        // waysToCreateStream();
        // intermediateMethods();
        // lazyNatureOfIntermediateMethods();
        // sequenceOfStreamOperations();
        // terminalOperations();
        parallelStreamExample();
        // customFilterExample();
    }

    public static void streamMethod() {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(1000);
        salaryList.add(2000);
        salaryList.add(3000);
        salaryList.add(1500);   
        salaryList.add(4500);
        salaryList.add(6000);
        salaryList.add(2000);

        long count = salaryList.stream().filter((Integer a) -> a > 3000).count();
        System.out.println("Count of salaries greater than 3000: " + count);

        List<Integer> sortedSalaryList = salaryList.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("Sorted Salary List: " + sortedSalaryList);
    }

    public static void waysToCreateStream() {
        // 1. From collection
        List<Integer> salaryList = Arrays.asList(100,200,300,450);
        Stream<Integer> streamFromIntegerList = salaryList.stream();

        // 2. From Array
        Integer[] salaryArray = {1,2,3,4,5};
        Stream<Integer> streamFromIntegerArray = Arrays.stream(salaryArray);

        // 3. From static method
        Stream<Integer> streamFromStaticMethod = Stream.of(1,2,3,45,123,63,0);

        // 4. From stream builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(100).add(300).add(200).add(-123);
        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();

        // 5. From stream iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1000, (Integer n) -> n + 5000).limit(5);
        // start point, how we want to change the next element (increament by 5000), limit to 5 elements

        System.out.println("Stream from Collection: " + streamFromIntegerList.collect(Collectors.toList()));
        System.out.println("Stream from Array: " + streamFromIntegerArray.collect(Collectors.toList()));
        System.out.println("Stream from Static Method: " + streamFromStaticMethod.collect(Collectors.toList()));
        System.out.println("Stream from Stream Builder: " + streamFromStreamBuilder.collect(Collectors.toList()));
        System.out.println("Stream from Iterate: " + streamFromIterate.collect(Collectors.toList()));
    }

    public static void intermediateMethods() {
        // Intermediate methods are used to perform operations on the stream and return a new stream.
        // Some common intermediate methods are: 
        // filter(), map(), sorted(), distinct(), flatMap(), peek(), limit(), skip()

        // filter(): Used to filter elements based on a condition.
        System.out.println("\n--------------------------------------- Use of filter() ---------------------------------------\n");

        Stream<String> nameStream = Stream.of("Alice", "Bob", "Charlie", "David", "Eve");
        Stream<String> filteredStream = nameStream.filter(name -> name.length() >= 3);
        System.out.println("Filtered Names: " + filteredStream.collect(Collectors.toList()));

        // map(): Used to transform elements in the stream.
        System.out.println("\n--------------------------------------- Use of map() ---------------------------------------\n");

        Stream<String> nameStream1 = Stream.of("Alice", "Bob", "Charlie", "David", "Eve");
        Stream<String> filteredStream1 = nameStream1.map((String name) -> name.toLowerCase());
        System.out.println("Mapped Names to Lowercase: " + filteredStream1.collect(Collectors.toList()));

        // flatMap(): Used to flatten nested structures.
        System.out.println("\n--------------------------------------- Use of flatMap() ---------------------------------------\n");

        List<List<String>> sentenceList = Arrays.asList(Arrays.asList("Hello", "World"), 
                                                        Arrays.asList("Java", "Streams"), 
                                                        Arrays.asList("FlatMap", "Example"));
        Stream<String> wordsStream1 = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream());
        System.out.println("Flattened Words: " + wordsStream1.collect(Collectors.toList()));

        Stream<String> wordsStream2 = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream().map((String value) -> value.toLowerCase()));
        System.out.println("Flattened and Lowercase Words: " + wordsStream2.collect(Collectors.toList()));

        // distinct(): Used to remove duplicate elements from the stream.
        System.out.println("\n--------------------------------------- Use of distinct() ---------------------------------------\n");

        Integer[] numberList = {1,9,2,200,3,8,4,5,3,2,1,6,7,8,5,200,200};
        List<Integer> distinctNumberList = Arrays.stream(numberList).distinct().collect(Collectors.toList());
        System.out.println("Distinct Numbers: " + distinctNumberList);

        // sorted(): Used to sort elements in the stream.
        System.out.println("\n--------------------------------------- Use of sorted() ---------------------------------------\n");
        List<Integer> sortedNumberList = Arrays.stream(numberList).sorted().collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumberList);

        sortedNumberList = Arrays.stream(numberList).sorted((Integer a, Integer b) -> b - a).collect(Collectors.toList());
        System.out.println("Sorted Numbers in Descending Order: " + sortedNumberList);

        // peek(): Used to perform an action on each element as it passes through the stream.
        System.out.println("\n------------------------------------ Use of peek() ---------------------------------------\n");
        List<Integer> numbers = Arrays.asList(2,1,3,4,6);
        List<Integer> processedNumbers = numbers.stream().filter((Integer a) -> a > 2).peek(n -> System.out.println("Processing: " + n)).map(n -> n * 2).collect(Collectors.toList());
        System.out.println("Processed Numbers: " + processedNumbers);

        // limit(): Used to limit the number of elements in the stream.
        System.out.println("\n------------------------------------ Use of limit() ---------------------------------------\n");
        List<Integer> limitedNumbers = Arrays.asList(24,12341,5,121,5,2,6235,1,2345,1,4563,12).stream().distinct().sorted().limit(5).collect(Collectors.toList());
        System.out.println("Sorted Distinct Limited Numbers: " + limitedNumbers);

        // skip(): Used to skip the first n elements in the stream.
        System.out.println("\n--------------------------------------- Use of skip() ---------------------------------------\n");
        List<Integer> skippedNumbers = Arrays.asList(1,2,3,4,5,6,7).stream().skip(3).collect(Collectors.toList());
        System.out.println("Sorted Distinct Skipped Numbers: " + skippedNumbers);

        // mapToInt(): Used to work with primitive int data type.
        System.out.println("\n--------------------------------------- Use of mapToInt() ---------------------------------------\n");
        List<String> stringNumbers = Arrays.asList("10", "20", "30", "40");
        IntStream intStream =  stringNumbers.stream().mapToInt((String num) -> Integer.parseInt(num));
        System.out.println("List of numbers after mapToInt(): " + intStream.boxed().collect(Collectors.toList()));
        // System.out.println("Sum of numbers: " + intStream.sum());

        int[] intArray = {1,2,3,4,5};
        IntStream intStream2 = Arrays.stream(intArray).filter((int num) -> num > 2);
        int[] filteredArray = intStream2.toArray();
        System.out.println("Filtered Array: " + Arrays.toString(filteredArray));
    }

    public static void terminalOperations() {
        // Terminal methods are used to produce a result or a side-effect from the stream.
        // Some common terminal methods are: 
        // collect(), forEach(), reduce(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        // forEach(): Used to perform an action for each element in the stream.
        System.out.println("\n--------------------------------------- Use of forEach() ---------------------------------------\n");
        numbers.stream().filter((Integer num) -> num >= 3).peek((Integer num) -> System.out.println("Processing: " + num)).forEach(n -> System.out.println("Number: " + n));

        // count(): Used to count the number of elements in the stream.
        System.out.println("\n--------------------------------------- Use of count() ---------------------------------------\n");
        long count = numbers.stream().filter((Integer num) -> num >= 3).peek((Integer num) -> System.out.println("Processing: " + num)).count();
        System.out.println("Count of numbers >= 3: " + count);

        // toArray(): Used to convert the stream to an array.
        System.out.println("\n--------------------------------------- Use of toArray() ---------------------------------------\n");
        Object[] numberArray = numbers.stream().filter((Integer num) -> num >= 3).toArray();
        Integer[] numberArrayCast = numbers.stream().filter((Integer num) -> num >= 3).toArray((int size) -> new Integer[size]);
        System.out.println("Array of numbers >= 3: " + Arrays.toString(numberArray));
        System.out.println("Array of numbers >= 3 (casted): " + Arrays.toString(numberArrayCast));

        // reduce(): Used to reduce the elements in the stream to a single value.
        System.out.println("\n--------------------------------------- Use of reduce() ---------------------------------------\n");
        Optional<Integer> reducedValue = numbers.stream().reduce((Integer a, Integer b) -> a + b);
        System.out.println("Reduced Value (Sum): " + reducedValue.orElse(0));

        // min() and max(): Used to find the minimum and maximum element in the stream.
        System.out.println("\n--------------------------------------- Use of min() and max() ---------------------------------------\n");
        Optional<Integer> minValue = numbers.stream().min((Integer a, Integer b) -> a - b);
        Optional<Integer> maxValue = numbers.stream().min((Integer a, Integer b) -> b - a);
        // both statements are using min but still one is giving minimum and other is giving maximum because of the comparator used.
        System.out.println("Minimum Value: " + minValue.orElse(-1));
        System.out.println("Maximum Value: " + maxValue.orElse(-1));

        // anyMatch(), allMatch(), noneMatch(): Used to check if any, all, or none of the elements match a given predicate.
        System.out.println("\n--------------------------------------- Use of anyMatch(), allMatch(), noneMatch() ---------------------------------------\n");
        boolean anyMatch = numbers.stream().anyMatch((Integer num) -> num > 5);
        boolean allMatch = numbers.stream().allMatch((Integer num) -> num > 5);
        boolean noneMatch = numbers.stream().noneMatch((Integer num) -> num < 5);
        System.out.println("Any Match (num > 5): " + anyMatch);
        System.out.println("All Match (num > 5): " + allMatch);
        System.out.println("None Match (num < 5): " + noneMatch);

        // findFirst() and findAny(): Used to find the first or any element in the stream that matches a given predicate.
        System.out.println("\n--------------------------------------- Use of findFirst() and findAny() ---------------------------------------\n");
        Optional<Integer> firstValue = numbers.stream().findFirst();
        Optional<Integer> anyValue = numbers.parallelStream().findAny();
        System.out.println("First Value: " + firstValue.orElse(-1));
        System.out.println("Any Value: " + anyValue.orElse(-1));
    }

    public static void lazyNatureOfIntermediateMethods() {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream = ls.stream().filter((Integer num) -> num > 2).peek((Integer num) -> System.out.println("Ele: " + num));

        // If we don't use a terminal operation, the intermediate operations won't be executed.
        System.out.println("Stream created, but no terminal operation invoked.");

        stream.count(); // Now the intermediate operations will be executed.
    }

    public static void sequenceOfStreamOperations() {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numbersStream = numbers.stream()
            .filter((Integer num) -> num >= 3)
            .peek((Integer num) -> System.out.println("After filter: " + num))
            .map((Integer num) -> (num * -1))
            .peek((Integer num) -> System.out.println("After negating: " + num))
            .sorted()
            .peek((Integer num) -> System.out.println("After sorting: " + num));

        List<Integer> filteredNumbers = numbersStream.collect(Collectors.toList());
        System.out.println("Final Result: " + filteredNumbers);
    }

    public static void parallelStreamExample() {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10,3,6,8,5,9);
        long sequentialProcessingStartTime = System.currentTimeMillis();
        numbers.stream().map((Integer num) -> num * num).forEach((Integer num) -> System.out.println(num));
        System.out.println("Time taken for sequential stream: " + (System.currentTimeMillis() - sequentialProcessingStartTime) + " ms");

        long parallelProcessingStartTime = System.currentTimeMillis();
        numbers.parallelStream().map((Integer num) -> num * num).forEach((Integer num) -> System.out.println(num));
        System.out.println("Time taken for parallel stream: " + (System.currentTimeMillis() - parallelProcessingStartTime) + " ms");
    }




    public static void customFilterExample() {
        // Custom filter example: Filtering even numbers from a stream.
        Stream<String> numberStream = Stream.of("Hello", "World", "Hehe", "High", "House", "Higher");
        Stream<String> filteredStream = numberStream.filter(StreamClass::hasMoreThanOneH);
        System.out.println("Strings with more than one 'H': " + filteredStream.collect(Collectors.toList()));
    }

    public static boolean hasMoreThanOneH(String s) {
    long count = s.chars()                      // get IntStream of characters
                  .filter(ch -> ch == 'H' || ch == 'h')
                  .count();
    return count > 1;
}
}
