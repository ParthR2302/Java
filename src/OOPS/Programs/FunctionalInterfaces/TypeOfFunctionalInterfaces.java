package OOPS.Programs.FunctionalInterfaces;

/*
 * 1. Consumer
 * 2. Supplier
 * 3. Function
*/

import java.util.function.*;

/*

// All of the below interfaces are present in the java.util.function package.

// 1. Consumer
@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}

// 2. Supplier
@FunctionalInterface
interface Supplier<T> {

    T get();
}

// 3. Function
@FunctionalInterface
interface Function<T, R> {
    R apply(T t);
}

// 4. Predicate
@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}

*/

public class TypeOfFunctionalInterfaces {
    public static void main(String[] args) {

        // 1. Consumer
        Consumer<Integer> loggingObject = (Integer val) -> {
            if (val > 10) {
                System.out.println("Logging");
            }
        };

        loggingObject.accept(10);
        loggingObject.accept(12);

        // 2. Supplier
        Supplier<String> getValueObj1 = () -> {
            return "Value returned from Supplier Functional Interface";
        };
        Supplier<String> getValueObj2 = () -> "Value returned from Supplier Functional Interface";

        System.out.println(getValueObj1.get());
        System.out.println(getValueObj2.get());

        // 3. Functional: <Input Data Type Object, Return Type Object>
        Function<Integer, String> functionalObject = (Integer value) -> {
            return "Value is: " + value;
        };
        functionalObject.apply(10);

        Predicate<Integer> isEven = (Integer value) -> {
            if(value % 2 == 0) return true;
            return false;
        };

        System.out.println(isEven.test(9));
        System.out.println(isEven.test(10));
    }
}
