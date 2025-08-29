package OOPS.Programs.TypeOfClasses;

class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    static class DefaultStaticNestedClass {
        public void display() {
            System.out.println(classVariable);
        }
    }

    private static class PrivateStaticNestedClass {
        public void display() {
            System.out.println(classVariable);
        }
    }

    public void print() {
        PrivateStaticNestedClass privateStaticNestedClass = new PrivateStaticNestedClass();
        privateStaticNestedClass.display();
    }

}

public class StaticNestedClass {
    public static void main(String[] args) {
        OuterClass.DefaultStaticNestedClass obj = new OuterClass.DefaultStaticNestedClass();
        // Since, inner class is of type static, we can create an Object of it using the reference of the OutClass.
        // We don't need to craete an Object of the OutClass and then use that Object to create and Object of the Inner Class (Case of Non-Static Inner Class).
        obj.display();

        OuterClass obj2 = new OuterClass();
        obj2.print();
    }
}
