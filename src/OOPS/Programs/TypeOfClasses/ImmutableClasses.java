package OOPS.Programs.TypeOfClasses;

import java.util.ArrayList;
import java.util.List;

final class MyImmutableClass {
    private final String name;
    private final List<Object> petNameList;

    MyImmutableClass(String name, List<Object> petNameList) {
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetList() {
        // This is required as making the list as final means you cannot now point it to new list, but you can add, delete values from the list.
        // Thats why we should send the copy of the list.
        return new ArrayList<>(petNameList);
    }   
}

public class ImmutableClasses {
    public static void main(String[] args) {
        List<Object> petNameList = new ArrayList<>();
        petNameList.add("pet1");
        petNameList.add("pet2");
        
        MyImmutableClass obj = new MyImmutableClass("Parth", petNameList);

        obj.getPetList().add("pet3");

        System.out.println(obj.getPetList());
    }
}
