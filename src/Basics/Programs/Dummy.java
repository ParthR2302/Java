package Basics.Programs;

import java.util.Scanner;

public class Dummy {
    public static void Names(String... n) {
        for (String str : n) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void func() {
        int arr[] = { 1, 2, 53, 5, 13 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Using new keyword
        int arr2[] = new int[3];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr2.length;i++) arr2[i] = sc.nextInt();

        for(int ele : arr2) System.out.print(ele + " ");
        System.out.println();

        sc.close();
    }

    public static void main(String[] args) {
        Dummy.Names("Parth", "Rathod");
        Dummy.Names("Name1", "Name2", "Name3");

        Dummy.func();
    }
}
