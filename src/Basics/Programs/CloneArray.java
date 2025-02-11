package Basics.Programs;

public class CloneArray {

    public static void print1DArray(int arr[]) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void printStudentArray(Student1[] arr) {
        for (Student1 st : arr) {
            System.out.println("Name: " + st.name + " age: " + st.age);
        }
    }

    public static void main(String[] args) {

        /*
         * Array with a primitive datatype
         */

        int[] arr1 = { 1, 3, 19 };
        int arr2[] = arr1.clone(); // ------------------------- Using clone() method (Deep Copy)

        System.out.println(arr1 == arr2); // output: false. (Deep copy)

        arr2[1] = 1000;

        CloneArray.print1DArray(arr1);
        CloneArray.print1DArray(arr2);

        System.out.println("Break 1 ------------------------------------");

        int[] arr3 = { 24, 14, 42, 67, 1, 89 };
        int arr4[] = arr3; // ------------------------- Using = operator. (Shallow copy)

        System.out.println(arr3 == arr4); // output: true. (Shallow copy - Both point to same locations)

        arr4[1] = 1000;
        // arr3[1] would also give 1000 now. Both arrays point to same location hence
        // changes using one array would reflect on the other array as well.

        CloneArray.print1DArray(arr3);
        CloneArray.print1DArray(arr4);

        System.out.println("Break 2 ------------------------------------");

        /*
         * Array with Object datatype
         */

        Student1 arr5[] = new Student1[] { new Student1("parth", 22), new Student1("malav", 23) };
        Student1 arr6[] = arr5.clone(); // ------------------------- Using clone() method. (Shallow copy - Datatype is
                                        // Object)

        System.out.println(arr3 == arr4); // output: true. (Shallow copy - Both point to same locations)

        CloneArray.printStudentArray(arr5);
        CloneArray.printStudentArray(arr6);

        arr6[1].name = "Harsh";

        CloneArray.printStudentArray(arr5);
        CloneArray.printStudentArray(arr6);
        // Elements of arr4 are not newly created, rather they are also pointing to the
        // same objects which elements of arr3 are pointing (for same index).
        // Change using one array would also reflect in other array as there is not
        // deep-copy. In this case a shallow-copy is craeted.

        System.out.println("Break 3 ------------------------------------");

        Student1 arr7[] = arr5; // ------------------------- Using = Operator. (Shallow copy - Datatype is
                                // Object)

        System.out.println(arr7 == arr5); // output: true. (Shallow copy - Both point to same locations)

        arr7[1].name = "Rathod";

        CloneArray.printStudentArray(arr5);
        CloneArray.printStudentArray(arr7);

    }
}

// There already is a class named Student in this Project
class Student1 {
    public String name;
    public int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}