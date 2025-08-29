package OOPS.Programs.TypeOfClasses;

/*
 * Inner Class
 * 
 * 1. Member Inner Class
 * 2. Local Inner Class
 * 3. Anonymous Inner Class
 */

class OuterClass1 {
    int instanceVariable = 10;
    static int classVariable = 20;

    // Member Inner Class
    class MemberInnerClass {
        public void display() {
            System.out.println(instanceVariable + " " + classVariable);
        }
    }

    // Local Inner Class
    // Inner class which is inside a block - if, loop, method, etc...
        // Cannot be declared as private, protected or public. Only Default is allowed
    public void method() {
        int methodVariable = 4;

        class LocalInnerClass {
            int localVariable = 6;

            public void print() {
                System.out.println(instanceVariable + " " + classVariable + " " + methodVariable + " " + localVariable);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.print();
    }
}

abstract class Car {
    public abstract void pressBrake();

    // public abstract void turnOnEngine(); 
}

public class NonStaticNestedClasses {
    public static void main(String[] args) {
        OuterClass1 obj = new OuterClass1();
        OuterClass1.MemberInnerClass innerObj = obj.new MemberInnerClass();

        innerObj.display();

        obj.method();

        // Anonymous Inner Class
        Car audiCarObj = new Car() {
            @Override
            public void pressBrake() {
                System.out.println("Press Brake Method of Audi Car");
            }
        };

        audiCarObj.pressBrake();
    }
}
