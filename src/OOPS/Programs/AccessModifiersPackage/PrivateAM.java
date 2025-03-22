package OOPS.Programs.AccessModifiersPackage;

class C1 {
    private int cnt1;
    public int cnt2;
    public int num;

    public int getCnt1() {
        return cnt1;
    }

    C1() {
        this.cnt1 = 2;
        this.cnt2 = 4;
    }

    C1(int cnt1, int cnt2) {
        this.cnt1 = cnt1;
        this.cnt2 = cnt2;
    }

    public void display() {
        // display() function can access cnt1 as both of them are inside the same class.
        System.out.println("Value of cnt1 = " + cnt1);
        System.out.println("Value of cnt2 = " + cnt2);
    }
}

class Child extends C1 {
    // Child object only inherits num, cnt2, display() and getCnt1() from C1 class.
}

public class PrivateAM {
    public static void main(String[] args) {

        C1 obj = new C1(3, 7);

        // int x = obj.cnt1; // Error. cnt1 is not visible
        System.out.println(obj.getCnt1());
        System.out.println(obj.cnt2);

        obj.display();

        Child childObj = new Child();
        System.out.println(childObj.cnt2);
        System.out.println(childObj.num);
        System.out.println(childObj.getCnt1());
    }
}
