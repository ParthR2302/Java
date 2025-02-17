# Collections Frameworks and Streams

### Index:

- [Hierarchy](#hierarchy)
- [Collection Interface](#collection-interface)
    - [List Interface](#list-interface)

<br>

- [References](#references)

## Hierarchy:

Iterable is the root interface.

[Collection Interface](#collection-interface) and Map interface are different and both extend the Iterable interface.

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

## Collection Interface:

**Collection:** An object that represents a group of objects, known as its elements.

**Collection Framework:** It provides a set of interfaces and classes that help in managing group of objects.
- In Java, the Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces.
- The utility package, (`java.util`) contains all the classes and interfaces that are required by the collection framework.

Hierarchy of the collection framework:

<image src="./images/collectionHierarchy.png" width="600" height="350"> <br>

- The utility package, (java.util) contains all the classes and interfaces that are required by the collection framework. 
- The collection framework contains an interface named `Iterable interface` which provides the iterator to iterate through all the collections. 
- This interface is extended by the main `Collection interface` which acts `as a root` for the collection framework.

**Iterable Interface** is the root interface. Any class which implements this interface use `for-each` loop on the objects of that class.

**Collection Interface** is acts as the root inteface for all the other collection types. It extends Iterable Interface.
- List, Set, Queue, Deque are some of the interfaces which implement the collection interface. These nterfaces are then used to imlement different classes.

<hr>

## List Interface:

It is used to store the `ordered collections` of elements. So in a Java List, you can organize and manage the data <u>sequentially</u>. It can contain Duplicate elements.

`Note:` In Java, you cannot use primitive types like int, double, or char directly in generic types like List<int> because generics only support reference types (objects), not primitive types.

```Java
List<int> ls1 = new ArrayList<>(); // Error
List<Integer> ls2 = new ArrayList<>(); // No errors
```

The <span style="color: rgb(206, 8, 8)">implementation classes</span> of List interface:
- [ArrayList](#arraylist) | [Vector](#vector) | [Stack](#stack) | [LinkedList](#linked-list)

`Internal Implementation:` Internally, the implementation of List uses `Array of objects`. If the size is full and we try to add an element then the length of internal array is increased. This behaviour defers from class to class. For example, the length of internal array (Also known as the capacity of the class) is increased by 50% in ArrayList class and is doubled in Vector class.

### Size and Capcity:

Difference between **size and capacity**:
- Size: It is the count of elements currently present in the array.
- Capacity: By default the initial capacity is 10. After resizing the capacity changes. If while creation we pass the capacity then the initial capacity would become whatever value we pass.

How does **resizing** occur:
- The class (ArrayList, Vector) will create a new Array with new size (1.5x if ArrayList and 2x if Vector) and copy all the elements from the old array to the new array (TC: O(N)).
- When using remove() method, the capacity of the class is not shrinked automatically.
    - Initial capacity of vector is 2 (user defined). If we add 3 element then the size become 3 and capacity is automatically increased to 4 (2x). Now if we remove 2 elements then the size would become 1 but the capacity would still stay as 4.
    - We can achieve shrinking manually.

We don't have direct access to capacity in ArrayList but it is directly accessible in [Vector](./List/VectorClass.java).

`Note:` ArrayList grows dynamically, usually increasing capacity by 50% when it exceeds its current capacity. Vector grows by doubling its capacity when it exceeds its current limit.

### ArrayList:

[Code](./List/ArrayListClass.java)

ArrayList Class implements List Interface which in turn extends Collection Interface.

ArrayList is an `ordered collection`. Which means it will store the elements in same order as passed/created. It can contain duplicate elements.

It can increase the size as per our need.

```Java
// Different Methods of ArrayList Creation

ArrayList<Obj> list0 = new ArrayList<Obj> ();
List<String> list1 = new ArrayList<>();
List<String> list2 = Arrays.asList("Monday", "Tuesday");
String[] list3 = {"Jan", "Feb", "March"};
List<String> list4 = Arrays.asList(strArr);
```

|Operation|Time Complexity|Space Complexity|
|-|-|-|
|Add(Object)|O(1) Element is added at the end<br> Worst Case: O(N) if array is full and need resizing|O(1) <br> O(N) if resizing is needed|
|Add(Index, Object)|O(N) Needs to shift all the elements to right|O(1). No extra space needed expect for resizing|
|Remove|O(N) Need to shift all the elements |O(1)|
|Replace|O(1)|O(1)|
|Travers|O(N)|O(1)|

**Methods:**
- All the methods are mentioned in the [code](./List/ArrayListClass.java).
- remove(). It can either take Object as input or Index as input
- If the list contains Integer objects. `remove(2)` would take 2 as index because 2 is int. `remove((Integer)2)` would take 2 as an element.

There are three things that happen when add() method is used:
- Check Capacity, [Resizing](#size-and-capcity) (If needed), Add the element.

There are three things that happen when remove() method is used:
- Check bounds (If the index is within the valid range), remove the element (and shift all the elements that are in right side of the index by 1 in left direction), reduce the size
- The capacity does not shrink automatically when remove() method is called.

<hr>

### Vector

[Code](./List/VectorClass.java)

Same as ArrayList.

Difference: Vector is thread-safe (Synchronized) whereas ArrayList is Not-Synchronized (not thread-safe)

<hr>

### Stack

[Code](./List/StackClass.java)

<hr>

### Linked List

[Code](./List/LinkedListClass.java)

|Property|Linked List|Array|
|-|-|-|
|Data Structure|Non-Contiguous|Contiguous|
|Memory Allocation|Typically allocated one by one to individual elements|Typically allocated to the whole array|
|Insertion-Deletion|Efficient|Inefficient|
|Access|Sequential|Random|



## Reference:

[1] [Java Collection - GFG](https://www.geeksforgeeks.org/collections-in-java-2/) <br>
[2] [Java Collection Crash Course](https://www.youtube.com/watch?v=92k5uokmW9o&t=38s) <br>