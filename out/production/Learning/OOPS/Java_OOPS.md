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
  - [Concrete Class](#concrete-class) | [Abstract Class](#abstract-class) | [Super Class](#super-class) | [Nested Class](#nested-class) | [Generic Class](#wild-cards) | [Wild Cards](#wild-cards) | [POJO Class](#pojo-class) | [Enum Class](#enum-class) | [Final Class](#final-class) | [Singleton Class - IMPORTANT](#singleton-class) | [Immutable Class](#immutable-class) | [Wrapper Class](#wrapper-class) 
- [Functional Interface and Lambda Expressions](#functional-interface-and-lambda-expressions)

<br />

- [Important Points](#important-points)
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

[Code](./Programs/Interface/InterfaceClass.java)

Another way to achieve <ins>abstraction</ins> in Java, is with interfaces.

An `interface` is a completely **"abstract class"** that is used to group related methods with empty bodies:

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the `implements` keyword (instead of `extends`). The body of the interface method is provided by the "implement" class:

**Need of interface:**
- Abstraction
- Polymorphism
  - Ineterface can be used as a datatype. We cannot create an object of an interface, but it can hold reference of all the objects that implement it. `At runtime`, it decides which method needs to be invoked.
  - Bird interface. Crow implements Bird, Eagle implements Bird. Bird eagle = new Eagle();
- Multiple Inheritance

**Notes:**

- Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are **by default** abstract and public. Method cannot be declared as final.
- Interface attributes are **by default** public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)

- private and protected modifiers are not allowed while creating interface.
- Overriding method cannot have more restrict access specifier. If method is public in interface, it cannot be private, protected in implementing class.
- If an abstract class implements an interface, it is **not forced** to override all the methods.

Nested Interface:
- Nested interface declared within another interface.
- Nested interface declared within a class.

Java-8 and Java-9 features on Interface:

Java-8: [Default methods](./Programs/Interface/DefaultMethodsInInterface.java), [Static methods](./Programs/Interface/StaticMethodsInInterface.java), Functional Interface and Lamda Expressions.

Java-9: [Private methods and Private Static methods](./Programs/Interface/PrivateAndPrivateStaticMethodsInInterface.java)

- stream() is a Default method in Collection Interface introduced in Java-8.


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

[Concrete Class](#concrete-class) | [Abstract Class](#abstract-class) | [Super Class](#super-class) | [Nested Class](#nested-class) | [Generic Class](#wild-cards) | [Wild Cards](#wild-cards) | [POJO Class](#pojo-class) | [Enum Class](#enum-class) | [Final Class](#final-class) | [Singleton Class](#singleton-class) | [Immutable Class](#immutable-class) | [Wrapper Class](#wrapper-class) 

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


### Nested Class:

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
      - `Cannot be declared as private`, protected or public. Only Default is allowed

[Inheritance in Nested Class](./Programs/TypeOfClasses/InheritanceInNestedClass.java)

Anonymous Inner Class:
- An Inner class without a name is called an Anonymous Inner Class.
- When to use? When we want to override the behaviour of a method without even creating any subclass. [link](./Programs/TypeOfClasses/NonStaticNestedClasses.java)
- 2 things happen behind the scene:
  - Sub class is created, name decided by the compiler.
  - Creates an Object of sub clas and assign its reference to object audiCarObj

### Generic Class: IMPORTANT

[Code](./Programs/TypeOfClasses/GenericClass.java)

Using <T> with class. We can use any keyword in place of T.
T can be replaced with any `non-primitive objects`.

We can have inheritance in Generic class 
- Parent Class is Generic: Child class can either be Non-Generic or Generic
- Parent Class is Non-Generic and Child class is Generic.

There can be more than one Generic Types in a class. class Class<A, B> {}

We can make `Generic Methods` as well. We can have generic methods inside both Generic and Non-Generic classes.
- Before the return type we need to define the type parameters.

We can use Raw types.

We can also have `Bounded Generics` classes.
  - There are 2 types: Upper Bound and Multi Bound

### Wild Cards:

Three types of `wild cards`:
- Upper Bound Wild Cards: <? extends UpperBoundClassName> i.e. class name and below
- Lower Bound Wild Cards: <? supper LowerBoundClassName> i.e. class name and above
- Unbounded Wild Cards: <?> only you can read

### POJO Class:

Plain Old Java Objects.

Usecases: Map the incoming request object to a POJO. Between Repository and DB, make a POJO to imitate DB.


### Enum Class:

[Code](./Programs/TypeOfClasses/Enums/Main.java)

- Collection of Constants. Variables are static and final implicitly.
- Its constructor is alway private, hence we cannot initiated.
- It cannot extend any class as it internally extends java.lang.Enum class. It can implement interfaces.
- No other class can extend enums.
- It can have abstract methods, and all the constants should implement that abstract method.

In a [custom value enum](./Programs/TypeOfClasses/Enums/CustomValueEnum.java), Wathever variables, methods and Constructors we define in this class are for each enum constants (MONDAY,...,SUNDAY).

[Method Override By Constant:](./Programs/TypeOfClasses/Enums/MethodOverrideByConstant.java) Although a non-static method in enum seems like a common methods for each constants, Each constants have their own instance of this method. We can override this method for each Constants.

[Enum with abstract method:](./Programs/TypeOfClasses/Enums/EnumWithAbstractMethod.java) All the constants have to override the abstract method and provide their own implementation.

[Enum Implemnts Interface](./Programs/TypeOfClasses/Enums/EnumImplementsInterface.java)

### Final Class:

It cannot be inherited.

### Singleton Class:

**IMPORTANT**

Its objective is to create `one and only one object`. E.g. DB Connection, etc.

Different ways of creating singleton class:
- [Eager Initialization](./Programs/TypeOfClasses/SingletonClasses/EagerInitialization.java)

- [Lazy Initialization](./Programs/TypeOfClasses/SingletonClasses/LazyInitialization.java)
  - To overcome the problem of eager initialization of static object being loaded into the memory when application starts.
  - **Disadvantage:** What if 2 threads come in parallel and object is not craeted. They would create an Object independently and there would be 2 objects created.

- [Synchronization Block](./Programs/TypeOfClasses/SingletonClasses/SynchronizationBlock.java)
  - To overcome the 2 thread problem of lazy initialization. How? Make the getInstance() method synchronized.
  - **Disadvantage:** Putting synchronized at method level make it a bit slow.

- [Double Check Lock](./Programs/TypeOfClasses/SingletonClasses/DoubleCheckLocking.java) (there is memory issue, resolved through volatile instance variable)
  - To overcome the slowness issue of synchronization method.
  - Instead of making the entire method synchronized, make the internal if block of null case synchronized.
  - Volatile is used to solve the issue of L1 cache sync up with memory at core level in CPU, and the issue of reordering.
  - For a volatile variable, any read and write operations happen through memory instead from the cache.

- [Bill Pugh Solution](./Programs/TypeOfClasses/SingletonClasses/BillPugh.java)
  - Slight variation in the Eager Initialization method
  - Initialization is wrapped inside a nested class. `Why?` Nested classes don't get loaded at the time of application start.


- Enum Singleton
  - Per JVM only one snapshot of enum is present.


### Immutable Class:

[Code](./Programs/TypeOfClasses/ImmutableClasses.java)

State of immutable class cannot be changed.
- We cannot change the value of the object once it is created.
- Declare class as final so that it cannot be extended
- All class member should be private, no direct access.
- Class member are initialzed only using class Constructor. Hence, no setter methods, only getter methods
- Returns the copy of the Object

### Wrapper Class:

## Important Points

## Functional Interface and Lambda Expressions:

### Functional Interface:

If an interface contains `only one abstract method`, then the interface is know as [functional interface](./Programs/FunctionalInterfaces/FunctionalInterfaceOverview.java). Alson known as SAM Interface (Single Abstract Method).

@FunctionalInterface keyword can be used at the top of class (Optional). This restricts the Interface to have only one method.

Functional Interface can contain a `default, static, Object class` methods along with one abstract method.

Different Ways to Implement functional Interface: [Code](./Programs/FunctionalInterfaces/ImplementFunctioanlInterface.java)
1. Using "implements"
2. Using Anonymous Class
3. Using Lambda Expressions

### Lambda Expressions:

Lambda Expression is a way to implementing Functional Interface.

### Type of Functional Interface:

There are four types. They are inbuilt. [code](./Programs/FunctionalInterfaces/TypeOfFunctionalInterfaces.java)

All four are present inside java.util.function; package.

**1. Consumer:**
- Represents an operation that accept single input parameter and returns no result.

**2. Supplier:**
- Represents the supplier of result. Accepts no input parameter but returns a result

**3. Function:**
- Represent function, accepts one argument, processes it and produces a result

**4. Predicate:**
- Accept input but always return boolean

If we have any requirement apart from above four, we can write our own functional interface. Or we can use them if our needs are satisfied with their offerings.

### FI Extends Non-Functional Interface or Functional Interface:
[code](./Programs/FunctionalInterfaces/FuncInterfaceExtends.java)

1. Functional Interface extends Interface
2. Interface extends Functional Interface
3. Functional Interface extends other Functional Interface.


## References

[1] [Abstrach Class and Abstract Method](https://www.geeksforgeeks.org/abstract-methods-in-java-with-examples/) <br />
[2] [Access Modifiers](https://www.geeksforgeeks.org/access-modifiers-java/) <br />
[3] [Java Modifiers](https://www.w3schools.com/java/java_modifiers.asp) <br />
[4] [Inheritance](https://www.geeksforgeeks.org/inheritance-in-java/?ref=lbp) <br />