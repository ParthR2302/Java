package JavaCollections.Programs.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        int n = 5;
        Vector<Integer> vec = new Vector<>(n);

        System.out.println("Current size of vec: " + vec.size() + " and the capacity is: " + vec.capacity());

        for(int i=1;i<=n;i++) vec.add(i);

        System.out.println(vec);
        System.out.println("Current size of vec: " + vec.size() + " and the capacity is: " + vec.capacity());

        vec.add(5, 6); // vec.add(7, 6); at this point would give error.
        System.out.println(vec);
        System.out.println("Current size of vec: " + vec.size() + " and the capacity is: " + vec.capacity());

        System.out.println("\nBreak 1 -------------------------------------------------------------------------------------------\n");

        Vector<Integer> vec1 = new Vector<>();
        vec1.add(34);
        System.out.println("Current size of vec: " + vec1.size() + " and the capacity is: " + vec1.capacity());
    }
}
