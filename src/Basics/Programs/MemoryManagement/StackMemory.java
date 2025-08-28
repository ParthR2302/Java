package Basics.Programs.MemoryManagement;

public class StackMemory {
    public static void main(String[] args) {
        int primitive = 24;
        Person person = new Person();
        String stringLiteral = "24";

        System.out.println(primitive + " " + stringLiteral);

        StackMemory stackMemory = new StackMemory();
        stackMemory.MemoryManagementTest(person);
    }

    public void MemoryManagementTest(Person person) {
        Person person2 = person;
        String stringLiteral = "24";
        String stringObj = new String("24");

        System.out.println(person2.getClass() + " " + stringLiteral + " " + stringObj);
    }
}
