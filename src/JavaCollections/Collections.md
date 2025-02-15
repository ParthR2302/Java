# Collections

### Index:

- [Introduction, Need and Advantages](#what-is-a-collection-and-a-collection-framework---need-of-them)
- [List Interface](#list-interface)

<br>

- [References](#references)


## What is a collection and a collection framework - Need of them:

**Collection:** An object that represents a group of objects, know as its elements.

**Collection Framework:** It provides a set of interfaces and classes that help in managing group of objects.
- In Java, the Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces of Java collection classes.
- The utility package, (`java.util`) contains all the classes and interfaces that are required by the collection framework.

Before the Collection Framework(or before JDK 1.2) was introduced, the standard methods for grouping Java objects (or collections) were Arrays or Vectors, or Hashtables. All of these collections had `no common interface`. Therefore, though the main aim of all the collections is the same, the implementation of all these collections was <u>defined independently</u> and had no correlation among them. 


```Java
public static void main(String[] args)
{
    int arr[] = new int[] { 1, 2, 3, 4 };
    Vector<Integer> v = new Vector();
    Hashtable<Integer, String> h = new Hashtable();

    // Adding Elements in Vector and Hashtable
    v.addElement(1);
    v.addElement(2);
    h.put(1, "geeks");
    h.put(2, "4geeks");

    // Accessing the first element of the array, vector and hashtable
    System.out.println(arr[0]);
    System.out.println(v.elementAt(0));
    System.out.println(h.get(1));
}
```

As we can observe, none of these collections(Array, Vector, or Hashtable) implements a standard member access interface, it was very difficult for programmers to write algorithms that can work for all kinds of Collections. 

Another drawback is that most of the ‘Vector’ methods are final, meaning we cannot extend the ’Vector’ class to implement a similar kind of Collection. 

Therefore, Java developers decided to come up with a common interface to deal with the above-mentioned problems and introduced the Collection Framework in JDK 1.2 post which both, legacy Vectors and Hashtables were modified to conform to the Collection Framework.

**Advantages of Collection Framework:**

1. Consistent API:
2. Reduces Programming Efforts:
3. Increased Program speed and qaulity:

Hierarchy of the collection framework:

<image src="./images/collectionHierarchy.png" width="600" height="350"> <br>

- The utility package, (java.util) contains all the classes and interfaces that are required by the collection framework. 
- The collection framework contains an interface named an `iterable interface` which provides the iterator to iterate through all the collections. 
- This interface is extended by the main `collection interface` which acts `as a root` for the collection framework.

**Collection Interface** is acts as the root inteface for all the other collection types. 
- List, Set, Queue, Deque, Map are some of the interfaces which implement the collection interface. These nterfaces are then used to imlement different classes.


## List Interface:

It is used to store the `ordered collections` of elements. So in a Java List, you can organize and manage the data <u>sequentially</u>.

The <span style="color: rgb(206, 8, 8)">implementation classes</span> of List interface:
- [ArrayList](#arraylist) | LinkedList | Stack | Vector

### ArrayList:

[Code](./List/ListInterface.java)

ArrayList Class implements List Interface which in turn extends Collection Interface.

ArrayList is an `ordered collection`. Which means it will store the elements in same order as passed/created. It can contain duplicate elements.

```Java
List<Obj> list = new ArrayList<Obj> ();
```

|Operation|Time Complexity|Space Complexity|
|-|-|-|
|Add(Object)|O(1) Element is added at the end<br> Worst Case: O(N) if array is full and need resizing|O(1) <br> O(N) if resizing is needed|
|Add(Index, Object)|O(N) Needs to shift all the elements to right|O(1). No extra space needed expect for resizing|
|Remove|O(N) Need to shift all the elements |O(1)|
|Replace|O(1)|O(1)|
|Travers|O(N)|O(1)|










## Reference:

[1] [Java Collection - GFG](https://www.geeksforgeeks.org/collections-in-java-2/) <br>
[2] [Java Collection Crash Course](https://www.youtube.com/watch?v=92k5uokmW9o&t=38s) <br>