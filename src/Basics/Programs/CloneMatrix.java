package Basics.Programs;

public class CloneMatrix {

    public static void printMat(int mat[][]) {
        for (int[] row : mat)
            for (int ele : row)
                System.out.print(ele + " ");
        System.out.println();
    }

    public static void deepCopyMat()
    {
        int[][] original = {{1, 2, 3}, {4, 5, 6}};

        int[][] deepCloned = new int[original.length][];
        for(int i=0;i<original.length;i++)
            deepCloned[i] = original[i].clone();
        
        deepCloned[0][1] = 100;

        printMat(original);
        printMat(deepCloned);

    }

    public static void cloneMat() {
        int[][] original = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] assigned = original;

        assigned[0][0] = 100;
        // If we print assigned[0][0] and original[0][0], both would give 100.
        // Both original and assigned changed because they reference the same array.
        // This is not a copy; it's just another reference.

        System.out.println("Clone matrix using = operator");

        printMat(original);
        printMat(assigned);

        System.out.println("Clone matrix using colne() method");

        int[][] cloned = original.clone();
        // Using clone method(): only the outer array is cloned, but the inner arrays are still shared.

        cloned[0][1] = 33;

        printMat(original);
        printMat(assigned);
        printMat(cloned);
    }

    public static void main(String[] args) {

        int intArray[][] = { { 1, 2, 3 }, { 4, 5 } };
        int cloneArray[][] = intArray.clone();

        System.out.println(intArray == cloneArray); // will print false

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);

        System.out.println("Break 1 ------------------------------------------");

        int[][] equalArray = intArray;

        System.out.println(intArray == equalArray); // will print true. 

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArray[0] == equalArray[0]);
        System.out.println(intArray[1] == equalArray[1]);

        System.out.println("Break 2 ------------------------------------------");

        System.out.println("Cloning Matrix using both = operator and clone() method");
        CloneMatrix.cloneMat();

        System.out.println("Deep copy for matrix with primitive data-type");
        CloneMatrix.deepCopyMat();
    }
}