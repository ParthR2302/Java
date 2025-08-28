package Basics.Programs.MemoryManagement;

import java.lang.ref.WeakReference;

public class StrongWeakReference {
    public static void main(String[] args) {
        WeakReference<Person> persoWeakReference = new WeakReference<Person>(new Person());

        int cnt = 1;

        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println(person1);

        while(true) {
            System.out.println("Dummy Text: " + cnt);
            cnt++;
            if(cnt >= 100) {
                System.gc(); // Doesn't work. Refer to Garbage Collector Notes.
                if(cnt >= 200) {
                    person1 = person2; // Even breaking the link of person1 would not call GC.
                }
            }
            if(persoWeakReference == null) break;
        }

        System.out.println("------------------------------ Method Ended ------------------------------");
    }
}
