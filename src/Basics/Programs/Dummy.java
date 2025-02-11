package Basics.Programs;

public class Dummy {
    public static void Names(String... n)
    {
        for(String str : n)
        {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Dummy.Names("Parth", "Rathod");
        Dummy.Names("Name1", "Name2", "Name3");
    }
}
