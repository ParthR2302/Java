package OOPS.Programs;

class OuterClass {
    int x;
    class InnerClass {
        int y;
        InnerClass() {
            this.y = 20;
        }

        public void myInnerMethod() {
            System.out.println("Inside myInnerMethod() method");
        }
    }

    // We can define private inner class.
    private class PrivateInnerClass {
        int z = 17;
        void print() {
            System.out.println("Inside print method of PrivateInnerClass with value of z as: " + z);
        }
    }

    OuterClass() {
        this.x = 10;
    }

    public void myOuterMethod() {
        PrivateInnerClass privateInnerClassObj = new PrivateInnerClass();
        System.out.println("Inside myOuterMethod() method");
        privateInnerClassObj.print();
    }

    static class StaticInnerClass {
        void print() {
            System.out.println("Print method of staticInnerClass");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myInner.y + myOuter.x);
        myOuter.myOuterMethod();
        myInner.myInnerMethod();

        // InnerClass myInner2 = new InnerClass();
        // myInner2.myInnerMethod(); // Erro. The method myInnerMethod() is undefined for the type InnerClass

        // ------------------------------------------------------------------------------ Private Inner Class
        System.out.println("\n---------------------------------------------------------------------------");

        // // We cannot create an object of PrivateInnerClass class as that class is of type Private. It can only be initialized inside the OuterClass class.
        // OuterClass.PrivateInnerClass myPrivateInnerClass = myOuter.new PrivateInnerClass(); // Error. The type OuterClass.PrivateInnerClass is not visible

        // ------------------------------------------------------------------------------ Static Inner Class
        System.out.println("\n---------------------------------------------------------------------------");

        OuterClass.StaticInnerClass myStaticInnerClass = new OuterClass.StaticInnerClass();
        myStaticInnerClass.print();
    }
}
