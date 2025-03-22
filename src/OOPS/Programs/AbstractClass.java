package OOPS.Programs;
// 1. Abstract class with abstract method. Refer to Shape class.
// 2. A non-abstract method method in abstract class.Refer to Subject class.
// 3. Abstract class can have final method. Refer to func() method of Subject class.
// 4. We can create static methods in abstract class. Refer to staticFunc() method of Subject clas.
// 5. We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract. Refer to class D and class E.

abstract class Shape {
    abstract void draw();
}

class Square extends Shape {
    public void draw() {
        System.out.println("Draw Method of Square");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Draw Method of Circle");
    }

    public void circleMethod()
    {
        System.out.println("Independent method of the Circle class");
    }
}

// ------------------------------------------------------------------------------------

abstract class Subject {
    Subject() {
        System.out.println("Constructor of Subject class called");
    }

    abstract void syllabus();

    void Learn() {
        System.out.println("Preparing Right Now!");
    }

    final void func() {
        System.out.println("This is a final method in the abstract class");
    }

    static void staticFunc() {
        System.out.println("Static function in Subject class");
    }
}

class IT extends Subject {

    IT() {
        System.out.println("Constructor of IT class called");
    }

    void syllabus() {
        System.out.println("C , Java , C++");
    }

    void ITMethod() {
        System.out.println("Independent method of IT class");
    }
}

// ------------------------------------------------------------------------------------

abstract class B {
    // declaring inner class as abstract with abstract
    // method
    abstract class C {
        abstract void myAbstractMethod();
    }
}

class D extends B {
    class E extends C {
        // implementing the abstract method
        void myAbstractMethod() {
            System.out.println(
                    "Inside abstract method implementation");
        }
    }
}

// Class with main method
public class AbstractClass {
    public static void main(String[] args) {

        // Shape obj = new Shape(); // Error, Cannot create an instance of an Abstract class.
        Shape square = new Square();
        square.draw();
        Circle circle = new Circle();
        circle.draw();
        // NOTE: square object has Shape as the datatype and circle object has Circle as
        // the datatype

        System.out.println("\nBreak 1 ----------------------------------------------------------------------------------------------\n");

        Subject sub = new IT();
        sub.Learn();
        sub.syllabus();
        sub.func();
        // sub.ITMethod(); // Error, as declaration is done like Subject sub = new IT();
        // If declaration was done like IT sub = new IT(); then it would not have given error.
        Subject.staticFunc();

        System.out.println("\nBreak 2 ----------------------------------------------------------------------------------------------\n");

        D outer = new D();
        D.E inner = outer.new E();
        inner.myAbstractMethod(); 

        System.out.println("\nBreak3 ----------------------------------------------------------------------------------------------\n");

        Shape circle1 = new Circle();
        circle1.draw();
        // circle1.circleMethod(); // Error. As the initialization is done using Shape. circleMethod() is created in the Circle class, it is not present in the Shape interface
        Circle circle2 = new Circle();
        circle2.circleMethod(); // No error.
    }
}
