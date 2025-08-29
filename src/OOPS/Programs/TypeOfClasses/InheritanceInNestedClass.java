package OOPS.Programs.TypeOfClasses;

/*
 * 2 Cases:
 *      1. Inherit in the same class
 *      2. Inherit outside of the class with some other Independent class
 *          1. If Inner Class is a static nested class
 *          2. If Inner Class is not a static nested class
 */

class OuterClass2 {
    int instanceVariable = 10;
    static int classVariable = 20;

    class InnerClass1 {
        int innerClass1Var = 10;
    }

    class InnerClass2 extends InnerClass1 {
        int innerClass2Var = 30;

        public void print() {
            System.out.println(innerClass1Var + " " + innerClass2Var);
        }
    }

    // Below 2 classes will be inherited outside of this class.
    static class StaticNestedClass1 {
        int var1 = 100;

        public void show() {
            System.out.println("Inside StaticNestedClass1");
        }
    }

    class NonStaticNestedClass1 {
        public void show() {
            System.out.println("Inside NonStaticNestedClass1");
        }
    }
}

// Extend Static Nested Class of some other class outside of that class
class OuterClass3 extends OuterClass2.StaticNestedClass1 {
    int var2 = 200;

    public void print() {
        show();
        System.out.println(var1 + " " + var2);
    }
}

// Extend Non Static Inner Class of some other class outside of that class
class OuterClass4 extends OuterClass2.NonStaticNestedClass1 {
    public OuterClass4() {
        new OuterClass2().super();
        // As we know, when child class constructor is invoked, it first invokes parent class constructor.
        // But here, the parent is an Inner Class so it can only be accessed by the Object of OuterClass only.
    }

    public void display1() {
        System.out.println("Inside display1() of OuterClass4");
    }
}

public class InheritanceInNestedClass {
    public static void main(String[] args) {
        OuterClass2 obj = new OuterClass2();

        OuterClass2.InnerClass2 inner2Obj = obj.new InnerClass2();

        inner2Obj.print();

        OuterClass3 obj2 = new OuterClass3();
        obj2.print();

        OuterClass4 obj4 = new OuterClass4();
        obj4.display1();
    }
}
