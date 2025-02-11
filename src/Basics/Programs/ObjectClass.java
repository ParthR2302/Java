package Basics.Programs;
class Person {
    String name;

    Person(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Person Name: " + name;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Person p = new Person("Bhagi");

        // Both toString() and hashCode() methods are present in Object class.
        // For Person class, we have overridden toString(). We are using the hashCode() method of the Object class.
        System.out.println(p.toString());
        System.out.println(p.hashCode());
        System.out.println(p.getClass());
    }   
}
