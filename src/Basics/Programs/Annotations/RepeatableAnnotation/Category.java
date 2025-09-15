package Basics.Programs.Annotations.RepeatableAnnotation;

// @Repeatable()
public class Category {

}
/*

import java.lang.annotation.Retention;

// Step 1. Container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Authors {
    Author[] value();
}

// Step 2. Make @Author repeatable
@Repeatable(Authors.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Alice")
@Author(name = "Bob")
@Author(name = "Charlie")
public class Book {
    public static void main(String[] args) {
        // Fetch annotations at runtime
        Author[] authors = Book.class.getAnnotationsByType(Author.class);
        for (Author a : authors) {
            System.out.println("Author: " + a.name());
        }
    }
}
*/