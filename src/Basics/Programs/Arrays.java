package Basics.Programs;

public class Arrays {

    public static void printArray(int[] arr) {
        int len = arr.length;
        System.out.println("The length of the array: " + len);
        System.out.print("Array members: ");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void print2DArray(int arr[][]) {
        int totalRows = arr.length;
        int totalColumns = arr[0].length;

        System.out.println("Total totalRows in the array: " + totalRows);
        System.out.println("Total columns in the array: " + totalColumns);

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalColumns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Method 2 of printing 2D Array");

        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static int[] returnArray() {
        return new int[] { 1, 13, 4 };
    }

    public static void main(String[] args) {

        /*
         * --------------------------------------- Creation methods - 1D Arrays:
         */
        int arr1[] = { 1, 2, 3 };
        Arrays.printArray(arr1);

        System.out.println("Break 1 ------------------------------------");

        int[] arr2;
        arr2 = new int[4];

        for (int i = 0; i < 4; i++)
            arr2[i] = i;
        Arrays.printArray(arr2);

        System.out.println("Break 2 ------------------------------------");

        int[] arr3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int[] arr3 = new int[10]{ 1,2,3,4,5,6,7,8,9,10 }; // Error. Cannot define
        // dimension expressions when an array initializer is provided
        Arrays.printArray(arr3);

        System.out.println("Break 3 ------------------------------------");

        /*
         * --------------------------------------- Creation methods - 2D Arrays:
         */
        int[][] multiDimArray = {
                { 1, 2, 3, 10 },
                { 4, 5, 6, 20 },
                { 7, 8, 9, 30 } };

        Arrays.print2DArray(multiDimArray);

        System.out.println("Break 4 ------------------------------------");

        int[][] mat = new int[3][];
        for (int i = 0; i < 3; i++) {
            mat[i] = new int[4];
            for (int j = 0; j < 4; j++) {
                mat[i][j] = (i + j);
            }
        }

        Arrays.print2DArray(mat);

        System.out.println("Break 5 ------------------------------------");

        /*
         * --------------------------------------- Creation methods - Array of Objects:
         */

        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the elements of the array
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                    + arr[i].roll_no + " "
                    + arr[i].name + " }");

        System.out.println("Break 6 ------------------------------------");

        /*
         * --------------------------------------- Out of bound exception
         */

        // System.out.println(arr2[1000]);
        // Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 1000 out of bounds for length 4 at
        // Basics.Programs.Arrays.main(Arrays.java:118)

        // Return array from function

        Arrays.printArray(Arrays.returnArray());
    }
}

class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}