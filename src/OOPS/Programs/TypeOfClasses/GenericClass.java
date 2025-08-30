package OOPS.Programs.TypeOfClasses;

/*
 * - Without Generic Class
 * - With Generic Class
 *      - Inheritance: Non-Generic subclass, Generic Sub Class
 * 
 * - More than One Generic Types
 * 
 * - Generic Method in Class
 * 
 * - Raw Type
 * 
 * - Bounded Generic Classes
 *      - Upper Bound and Multi Bound
 */

// ---------------------------------- Without using Generic Class
class Print1 {
    Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

// ---------------------------------- Using Generic Class
class Print2<T> {
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

// ---------------------------------- Inheritance

// Non-Generic Sub class - We need to define the Object for the parent class (Parent class is Generic)
class ColourPrint extends Print2<String> {

}

// Generic
class ChildPrint<ABC> extends Print2<ABC> {

}

// ---------------------------------- More than One Generic Types
class Pair<A, B>{
    public A first;
    B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public void print() {
        System.out.println(first + " - " + second);
    }

}

// ---------------------------------- Generic Method - Class is non-generic, method inside it is generic
// We can have the class as a Generic class as well
class GenericMethod {

    // Before the return type we need to define the type parameters.
    public <K, V> void printValue(Pair<K, V> pair1, Pair<K, V> pair2) {
        if(pair1.first.equals(pair2.first)) {
            System.out.println("Value of first of both pairs is same");
        }
        else {
            System.out.println("Value of first of both pairs is different");
        }
    }

    public <T> T getVal(T obj) {
        System.out.println(obj.getClass());
        return obj;

    }

}

// ---------------------------------- Number is Upper Bound. Integer, Double, Float, Long... are child of Number.
class UpperBound<T extends Number> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

// ---------------------------------- Multi Bound
class ParentClass {}

interface Interface1 {}

interface Interface2 {}

class AB extends ParentClass implements Interface1, Interface2 {}

class CD extends ParentClass implements Interface1 {}

// First should always be a concrete class. No more than one concrete class and after concrete class we can have multiple interfaces
// We are bounding with similat kind of structure that we want.
class MultiBound<T extends ParentClass & Interface1 & Interface2> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericClass {
    public static void main(String[] args) {

        // ---------------------------------------------------------------------- Non-Generic
        Print1 printObj1 = new Print1();
        printObj1.setObj(1);
        Object printValue = printObj1.getObj();
        if((int)printValue == 1) {
            System.out.println("Value is 1");
        }
        // Problem with this case is that we need to do typecasting everytime we want to use the Object. 
        // We can never always know before hand what type of object will be returned from the getter method.
        // We solve this issue with Generic Classes.


        // ---------------------------------------------------------------------- Using Generic Class
        Print2<Integer> obj2 = new Print2<Integer>();
        // Print2<Integer> obj2 = new Print2<>(); // This also works
        obj2.setObj(2);
        // obj2.setObj("hello"); // Compilation Error
        Integer printValueInteger = obj2.getObj();
        if(printValueInteger == 2) {
            System.out.println(printValueInteger + " -- " + obj2.getObj().getClass());
        }


        // ---------------------------------------------------------------------- Inheritance
        ColourPrint colourPrint = new ColourPrint();
        colourPrint.setObj("Black");
        System.out.println(colourPrint.getObj() + " -- " + colourPrint.getObj().getClass());

        ChildPrint<Double> childPrint = new ChildPrint<Double>();
        childPrint.setObj(234.1492);
        System.out.println(childPrint.getObj() + " -- " + childPrint.getObj().getClass());

        // ---------------------------------------------------------------------- More than One generic
        Pair<String, Integer> pair = new Pair<>("Hello", 23);
        pair.print();

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printValue(pair, new Pair<>("Hello", 2342));
        genericMethod.getVal(new StaticNestedClass());
        genericMethod.getVal(new InheritanceInNestedClass());

        // ---------------------------------------------------------------------- Raw Type
        // Print2 rawObj = new Print2();
        // // Internally Compiler does Print2<Object> rawObj = new Print2<>();
        // rawObj.setObj(1);
        // rawObj.setObj("String Obj");
        // // Ther is no error in this but comipler is showing warnings
        // System.out.println(rawObj.getObj());

        // ---------------------------------------------------------------------- Bounded Generics

        // ---------------------------------- Upper Bound:
        UpperBound<Integer> ub1 = new UpperBound<>();
        ub1.setValue(23);
        UpperBound<Double> ub2 = new UpperBound<>();
        ub2.setValue(23.145);
        // UpperBound<String> ub3 = new UpperBound<>(); // Error

        // ---------------------------------- Multi Bound:
        MultiBound<AB> multiBoundObj = new MultiBound<>();
        AB newObj = new AB();
        multiBoundObj.setValue(newObj);
        multiBoundObj.getValue();

        // MultiBound<CD> dummyObj = new MultiBound<>(); // Error. Bound mismatch
    }
}
