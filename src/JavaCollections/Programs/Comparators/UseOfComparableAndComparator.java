package JavaCollections.Programs.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Sorting Using
 * - Comparable: Use of Comparable Interface - Implemented by class itself
 * - Comparator:
 *      - Sorting using Comparator - Implemented by Separate Lambda
 *      - Sorting using Comparator - Implemented by Separate Class
 * 
 * When to use Comparable Interface: When we create a class and know that this class will be used in a list/collection.
 *      If we want the class to have a default sorting behaviour, we can implement the Comparable Interface to provide that.
 *      When sorting the collection, we can then either give or not give external comparator for this objects. 
*/

class Student implements Comparable<Student> {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {        
        return Integer.compare(this.id, o.id);
    }
    
}

// Using Comparator interface to create a new comparator class which then can be used as a comparator for the targeted class
class StudentNameDescComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
    }    
}

public class UseOfComparableAndComparator {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Bhagi"));
        studentList.add(new Student(2, "Sanjeev"));
        studentList.add(new Student(4, "Nikhil"));
        studentList.add(new Student(1, "Parth"));

        // Use of Comparable Interface - Implemented by class itself
        Collections.sort(studentList);
        System.out.println("Students Array sorted in ascending order for id:");
        studentList.forEach(s -> System.out.println(s.id + " " + s.name)); // Ascending order for id

        System.out.println("-----------------------------------------------------------------");

        // Sorting using Comparator - Implemented by Separate Lambda
        Collections.sort(studentList, (s1, s2) -> Integer.compare(s2.id, s1.id));
        System.out.println("Students Array sorted in descending order for id:");
        studentList.forEach(s -> System.out.println(s.id + " " + s.name)); // Descending order for id

        System.out.println("-----------------------------------------------------------------");

        // Sorting using Comparator - Implemented by Separate Class
        Collections.sort(studentList, new StudentNameDescComparator());
        System.out.println("Students Array sorted in descending order for name:");
        studentList.forEach(s -> System.out.println(s.id + " " + s.name)); // Descending order for name
    }
}
