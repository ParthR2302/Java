# Java OOPS:

### Index:

- [Abstract Class and Abstract Methods](#abstract-class-and-methods)
- [Access Modifiers](#access-modifiers)

- [References](#references)

## Abstract Class and Methods:

[Code](./Programs/AbstractClass.java)

Java abstract class is a class that can not be instantiated by itself, it needs to be subclassed by another class to use its properties. [[1](#references)]<br />
In Java, just like in C++ an instance of an abstract class cannot be created. <br />
Abstract is like blueprint. <br />

Properties of Abstract Class:
1. An instance of an abstract class can not be created. Constructors are allowed.
2. We can have an abstract class <span style="color:skyblue"> <u>without any abstract</u> </span> method.
3. If a class contains <span style="color:skyblue"> <u>at least one abstract method</u> </span> then compulsory should declare a class as abstract.
4. There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms <span style="color:skyblue"> <u>final method can not be abstract itself</u> </span> as it will yield an error: “Illegal combination of modifiers: abstract and final”
5. We can define <span style="color:skyblue"> <u>static</u> </span> methods in an abstract class
6. We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract 
7. If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method

Abstract class can have following elements: data member, abstract method, method body (non-abstract method), constructor, main() method.

## Access Modifiers:

There are 4 types of Access Modifiers: [[5](#references)]
- Default (No keyword required), public, private, protected

### Default Access Modifier:

[Code](./Programs/AccessModifiersPackage/Package2/Pack2Class.java)

- When no access modifier is provided, the program autometically provides default AM.
- Default AM are accessible **only within the same package**

### Private Access Modifier:

[Code](./Programs/AccessModifiersPackage/PrivateAM.java)

- The methods or data members declared as private are accessible only **within the class** in which they are declared.
- Top-level classes or interfaces can not be declared as private.

### Protected Access Modifier:

[Code - ProtectedAMClass1.java](./Programs/AccessModifiersPackage/Package1/ProtectedAMClass1.java) | [Code - ProtectedAMClass2.java](./Programs/AccessModifiersPackage/Package2/ProtectedAMClass2.java)

- The methods or data members declared as protected are accessible **within the same package** or **subclasses in different packages**.

### Public Access Modifier:

- The public access modifier has the widest scope among all other access modifiers.
- Classes, methods, or data members that are declared as public are accessible from everywhere in the program. There is no restriction on the scope of public data members.

## References

[1] [Abstrach Class and Abstract Method](https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/) <br />
[2] [Access Modifiers](https://www.geeksforgeeks.org/access-modifiers-java/) <br />