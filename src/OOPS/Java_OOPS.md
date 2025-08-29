# Java OOPS:

### Index:

- [Abstract Class and Abstract Methods](#abstract-class-and-methods)
- [Access Modifiers](#access-modifiers)
    - Default, Private, Protected, Public, Final, Abstract, Transient, Synchronized, Volatile
- [Encapsulation](#encapsulation)
- [Java Packages and API](#java-packages-and-api)
- [Inheritacne](#inheritance)
- [Polymorphism](#polymorphism)
- [Inner Class](#inner-class)
- [Abstraction](#abstraction)
- [Interface](#interface)
- [Enums](#enums)
- [Java Classes](#java-classes)

<br />

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
7. If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class can provide implementation to the remaining abstract method

Abstract class can have following elements: data member, abstract method, method body (non-abstract method), constructor, main() method.

## Access Modifiers:

There are 4 types of Access Modifiers: [[2](#references)]
- [Default](#default-access-modifier) (No keyword required) | [public](#public-access-modifier) | [private](#private-access-modifier) | [protected](#protected-access-modifier)

There are non-access specifiers in a class too:
- [final](#final) | [abstract](#abstract)

Other modifiers:

- [transient](#transient) | [synchronized](#synchronized) | [volatile](#volatile)

### Default Access Modifier:

[Code](./Programs/AccessModifiersPackage/Package2/Pack2Class.java)

- When no access modifier is provided, the program autometically provides default AM.
- Default AM are accessible <span style="color:skyblue">**only within the same package**</span>

### Private Access Modifier:

[Code](./Programs/AccessModifiersPackage/PrivateAM.java)

- The methods or data members declared as private are accessible <span style="color:skyblue">**only within the class**</span> in which they are declared.
- Top-level classes or interfaces can not be declared as private.

### Protected Access Modifier:

[Code - ProtectedAMClass1.java](./Programs/AccessModifiersPackage/Package1/ProtectedAMClass1.java) | [Code - ProtectedAMClass2.java](./Programs/AccessModifiersPackage/Package2/ProtectedAMClass2.java)

- The methods or data members declared as protected are accessible <span style="color:skyblue">**within the same package**</span> or <span style="color:skyblue">**subclasses in different packages**</span>.

### Public Access Modifier:

- The public access modifier has the widest scope among all other access modifiers.
- Classes, methods, or data members that are declared as public are accessible from everywhere in the program. There is no restriction on the scope of public data members.

### final:

- final methods and variables cannot be overridden or modified.
- final class cannot be inherited by any other class.

### abstract:

- Abstract keyword can be applied to classes and/or methods only. We cannot use abstract variables.

### Transient:

- Attributes and methods are skipped when serializing the object containing them

### Synchronized:

- Methods can only be accessed by one thread at a time

### Volatile:

- The value of an attribute is not cached thread-locally, and is always read from the "main memory"


## Encapsulation:

The meaning of **Encapsulation**, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

- declare class variables/attributes as `private`
- provide public **get** and **set** methods to access and update the value of a `private` variable.

**Why?**

- Better control of class attributes and methods
- Class attributes can be made `read-only` (if you only use the get method), or `write-only` (if you only use the set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data

## Java Packages and API:

A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

- Built-in Packages (packages from the Java API)
- User-defined Packages (create your own packages)

The `Java API` is a library of prewritten classes, that are free to use, included in the `Java Development Environment`.

```Java
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```

## Inheritance:

[Code](./Programs/Inheritance/Inheritance.java)

subclass (child) - the class that inherits from another class

superclass (parent) - the class being inherited from

We use `entends` keyword to inherit from a class.

### Type of Inheritance: 

There are multiple types of Inheritance we can achieve in Java[[4]](#references).

1. [Single Inheritance](#single-inheritance)
2. [Multilevel Inheritance](#multilevel-inheritance)
3. [Hierarchical Inheritance](#hierarchical-inheritance)
4. [Multiple Inheritance](#multiple-inheritance)
5. [Hybrid Inheritance](#hybrid-inheritance)

### Single Inheritance:

In single inheritance, a sub-class is derived from only one super class.

### Multilevel Inheritance:

In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes.

### Hierarchical Inheritance:

In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass.

### Multiple Inheritance:

[Code](./Programs/Inheritance/MultipleInheritance.java)

In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes. Java `does not support` multiple inheritances `with classes`.

In Java, we can achieve multiple inheritances only `through Interfaces`.

### Hybrid Inheritance:

It is a mix of two or more of the above types of inheritance. 

Since Java doesn’t support multiple inheritances with classes, hybrid inheritance involving multiple inheritance is also not possible with classes. In Java, we can achieve hybrid inheritance only through Interfaces if we want to involve multiple inheritance to implement Hybrid inheritance.

## Polymorphism:

[Code](./Programs/Polymorphism.java)

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Parent class is Animal which has a method named animalSound(). Sub classes can be Dog, Cat, Pig. They can have their own animalSound() methods.

## Inner Class: 

[Code](./Programs/InnerClass.java)

In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class:

One `advantage of inner classes`, is that they can access attributes and methods of the outer class

[Code](./Programs/InnerClass.java) contains initialization and usage of private, default and static inner classes.

## Abstraction: 

Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces.

The abstract keyword is a `non-access modifier`, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:

Refer to [Abstraction](#abstract-class-and-methods)

## Interface:

[Code](./Programs/Interface.java)

Another way to achieve <ins>abstraction</ins> in Java, is with interfaces.

An `interface` is a completely **"abstract class"** that is used to group related methods with empty bodies:

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the `implements` keyword (instead of `extends`). The body of the interface method is provided by the "implement" class:

**Notes:**

- Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are by default abstract and public
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)


## Enums:

[Code](./Programs/EnumsJava/EnumsUse.java)


An <span style="color:skyblue">enum</span> is a special "class" that represents a group of **constants** (unchangeable variables, like `final` variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

We can loop through enum values using predefined values() method:

```Java
for (Level myVar : Level.values()) {
  System.out.println(myVar);
}
```

**Difference between Enums and Classes:**

An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).


## Java Classes:

Types of Classes in Java:

### Concrete Class:

### Abstract Class:

- Can be 0-100% Abstraction
- Abstract class can inherit other abstract classes.
  - The child abstract class can either give implementation to the abstract methods of parent class, can either add a new abstract/concreate methods and can either leave the abstract methods from parent class (Don't provide implementation).
- Cannot create an Object of abstract class.
- If a concrete class extends an abstract class, we can store the reference of that concrete class object in the parent abstract class.

### Super Class:

- In Java, there is one class called Object, which is the Parent class of all the classes that are not inheriting other classes.


### Nested Class: IMPORTANT

Class within another class.

When to use? If we know that the class will only be used by one other class, instead of creating a new file, we can add that class to the other class. Also helps us to group logically related classes in one file.

Scope: Its scope would be same as the parent class's scope.

2 Types:
1. Static Nested Class
2. Non-Static Nested Class (Inner Class)
    - Member Inner Class
    - Local Inner Class
    - Anonymous Inner Class

`IMPORTANT:` Outerclasses have 2 Access Specifiers: public and default ( package-private / no-keyword provided).
  - Like methods, Inner Classes can have private and protected access modifiers as well.

```Java
// Static Nested Class
OuterClass.DefaultStaticNestedClass obj = new OuterClass.DefaultStaticNestedClass();

// Non-Static Nested Class
OuterClass1 obj = new OuterClass1();
OuterClass1.DefaultNonStaticNestedClass innerObj = obj.new DefaultNonStaticNestedClass();
```

[Static Nested Class](./Programs/TypeOfClasses/StaticNestedClass.java) | [Non Static Nested Class - Member, Local and Anonymous Inner Classes](./Programs/TypeOfClasses/NonStaticNestedClasses.java)


Local Inner Class:
  - Inner class which is inside a block - if, loop, method, etc...
      - Cannot be declared as private, protected or public. Only Default is allowed

[Inheritance in Nested Class](./Programs/TypeOfClasses/InheritanceInNestedClass.java)

Anonymous Inner Class:
- An Inner class without a name is called an Anonymous Inner Class.
- When to use? When we want to override the behaviour of a method without even creating any subclass. [link](./Programs/TypeOfClasses/NonStaticNestedClasses.java)
- 2 things happen behind the scene:
  - Sub class is created, name decided by the compiler.
  - Creates an Object of sub clas and assign its reference to object audiCarObj



## References

[1] [Abstrach Class and Abstract Method](https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/) <br />
[2] [Access Modifiers](https://www.geeksforgeeks.org/access-modifiers-java/) <br />
[3] [Java Modifiers](https://www.w3schools.com/java/java_modifiers.asp) <br />
[4] [Inheritance](https://www.geeksforgeeks.org/inheritance-in-java/?ref=lbp) <br />