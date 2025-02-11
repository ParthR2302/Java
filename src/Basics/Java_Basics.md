# Java From Scratch

### Index:
- [JDK, JRE, JVM](#what-is-jdk-jvm-and-jre)
- [Key Fetures](#key-features-of-java)
- [Data Types](#data-types)
- [Variables](#variables)
- [Operators](#operators)
- [Decision Making](#decision-making)
- [Loops](#loops)
- [Methods](#methods)

- [**IMPORTANT**: Additional Material](#miscellaneous-material)
- [References](#references)

## What is JDK, JVM and JRE?

**JDK** (Java Development Kit): It contains tools and libraries using which we can create Java Code. <br />
It contains debugger, javac compiler, etc. It also contains JRE.

**JRE** (Java Runtime Envrionment): It provides an enviroment from which we can run the program. <br />
JRE contain JVM.

**JVM** (Java Virtual Machine): Java program runs becuase of JVM.

### Flow:
- Java file is created with **.java** extension.
- This file is compiled using ```javac``` compiler and converted to a Bytecode. This Bytecode is platform <span style="color:skyblue">Independent</span>.
- JVM undestands the Bytecode. JVM converts this Bytecode to Machine Code. This Machine Code is platform <span style="color:skyblue">Dependent</span>.
    - JVM has a ```Just In Time (JIT)``` compiler. 


## Key Features of Java:

1. Platform Independent:
    - Bytecode generated from any platform can be run onany platform. Each platform (Windows, Linux, Mac) has its own JVM which interprets the bytecode.
2. Object Oriented Programming: <br>
    The four main concepts of Object-Oriented programming are:
    - Abstraction, Encapsulation, Inheritance, Polymorphism
3. Simplicity:
4. Robustness: <br>
    The main features of java that make it robust are garbage collection, exception handling, and memory allocation.
5. Security: <br>
6. Distributed: <br>
    The java programs can be easily distributed on one or more systems that are connected to each other through an internet connection.
7. Multithreading:
8. Portability:
9. High Performance:

## Data Types:

Java has two categories in which data types are segregated.

**Primitive Data Type:** such as boolean, char, int, short, byte, long, float, and double. The Boolean with uppercase B is a wrapper class for the primitive data type boolean in Java.

**Non-Primitive Data Type or Object Data type:** such as String, Array, etc.

|Type|Description|Default|Size|Example Liberals|Range Values|
|----|-----------|-------|----|----------------|------------|
|boolean|true or false|false|8 bits|true, false|true, false|
|byte|twos-complement integer|0|8 bits|(none)|-128 to 127|
|char|```Unicode character```|\u0000|16 bits|‘a’, ‘\u0041’, ‘\101’, ‘\\\’, ‘\\’, ‘\n’, ‘β’|characters representation of ASCII values 0 to 255|
|short|twos-complement integer|0|16 bits|(none)|-32,768 to 32,767|
|int|twos-complement intger|0|32 bits|-2,-1,0,1,2|-2,147,483,648 to 2,147,483,647|
|long|twos-complement intger|0|64 bits|-2L,-1L,0L,1L,2L|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|float|IEEE 754 floating point|0.0|32 bits|1.23e100f , -1.23e-100f , .3f ,3.14F|upto 7 decimal digits|
|double|IEEE 754 floating point|0.0|64 bits|1.23456e300d , -123456e-300d , 1e1d|upto 16 decimal digits|

**Why is the Size of char 2 bytes in Java?**
Unlike languages such as C or C++ that use the ASCII character set, Java uses the Unicode character set to support <span style="color:#777;text-decoration: underline;font-weight: bold">internationalization</span>. Unicode requires more than 8 bits to represent a wide range of characters from different languages, including Latin, Greek, Cyrillic, Chinese, Arabic, and more. As a result, Java uses 2 bytes to store a char, ensuring it can represent any Unicode character.

## Variables: 

[Code](./Programs/Variables.java)

1. Local Variables:
    - The scope of local variables exists only within the block in which the variables are declared
2. Instance Variables:
    - As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
    - Instance variables can be accessed <ins>only by creating objects</ins>.
    - Initialization of an instance variable is not mandatory. Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
3. Static Variables:
    - Static variables are also known as class variables. 
    - Unlike instance variables, we can only have <ins>one copy</ins> of a static variable per class, irrespective of how many objects we create.
    - Initialization of an static variable is not mandatory.
    - If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.

- Static methods and static variables can be accessed directly by any static and non-static method.
- Non static methods and non static variables can only be accessed by the object of the class.

## Operators:

Type of Operators in Java:
1. Arithmetic Operators
2. Unary Operators
3. Assignment Operator
4. Relational Operators
5. Logical Operators
6. Ternary Operator
7. Bitwise Operators
8. Shift Operators
9. instance of operator

Precedence and Associativity of Java Operators:

## Decision Making: 

Decision Making Statements: if, if-else, switch, break, continue, jump (Three Jump Statements: break, continue and return).

## Loops: 

[Code](./Programs/Loops.java)

Type of Loops: for loop, while loop, do-while loop

## Methods: 

[Code](./Programs/Methods.java)

2 types of Methods: 
1. Predefined Methods: Math.random(), Math.PI()
2. User Defined Methods: public void main() {}
    
Ways to create a method: Instance Methods, Static Methods.

NOTE: Java passes all primitive data types by value.

**<span style="color:skyblue">Static Method VS Non Static Method: [link](./Programs/StaticMethodVsNonStatic.java)</span>**

Static method: This method belongs to the class and can be called without creating an object. [[4](#references)] <br />
Instance method: This method belongs to an object and requires an object to be called.

|Fetures|Static Method|Non Static Method|
|----|----|----|
|Definition|Created using the static keyword and retrieved without creating an object.|Requires an object of its class to be invoked.|
|Access|<span style="color: red">Access only static variables and methods.<span />|Can access both static and instance members.|
|this keyword|Cannot use the this keyword within static methods.|Can use the this keyword to refer to the current object.|
|Override|Does not support runtime polymorphism|Supports runtime polymorphism|

## Miscellaneous Material:

1. [Object Class](#object-class)
2. [Multiple Classes in One File](#multiple-classes-in-one-file)
3. [Command Lines Arguments](#command-line-arguments)
4. [Variable Arguments](#variable-arguments-varargs-in-java)

### Object Class:

[code file](./Programs/ObjectClass.java) <br/>

Object class in Java is present in `java.lang` package [[3](#references)]. Every class in Java is <u>directly or indirectly derived from the Object class</u>. If a class does not extend any other class then it is a direct child class of the Java Object class and if it extends another class then it is indirectly derived. 

The Object class provides several methods such as `toString(),equals(), hashCode(), and many others`. <br />
List of methods from Object class: toString(); hashCode(); equals(Object obj); finalize(); getClass(); clone(); wait(), notify() notifyAll() (Concurrency methods) <br />
We can override the methods of Object class in our defined class.

### Multiple Classes in one file
[code file](./Programs/MultipleClasses.java) <br />
- At most one public class in Java. 
- If there is one public class then the <u>name of that class must be same as the name of the file</u>.

- Multiple classes in same file can have their own main method. 
```java
class Test {
    public static void main(String[] args) {
        System.out.println("Main Method of Test Class");
    }
}

public class MultipleClasses {
    int x;

    public static void main(String[] args) {
        System.out.println("Main method of MultipleClasses class");
    }
}
```
We can compile the file and run specif class using:
```bash
javac MultipleClasses.java
java MultipleClasses
java Test
```

## Command Line Arguments:

[Code](./Programs/CommandLineArguments.java)

## Variable Arguments (Varargs) in Java:

[Code](./Programs/VariableArgs.java)

Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments. [[5](#references)]

```Java
public void func(String... arguments)
{
    // We can treat the arguments in kind of similar way like list
    int len = arguments.length;
    for(int i=0;i<len;i++>) // Access elements using arguments[i]
    for(String str : arguments) // Each str would represent strings in arguments
}

// Inside main:
func("S1", "S2", "S3") // We can pass multiple arguments
```

**Need of Java Varargs:** <br />
Until JDK 4, we cant declare a method with variable no. of arguments. If there is any change in the number of arguments, we have to declare a new method. This approach increases the length of the code and reduces readability.

Before JDK 5, variable-length arguments could be handled in two ways.
- One uses an overloaded method(one for each).
- Another puts the arguments into an array and then passes this array to the method. Both of them are potentially error-prone and require more code. 

To resolve these problems, Variable Arguments (Varargs) were introduced in JDK 5.

**Erroneous Varargs Examples:**

We cannot pass two varargs in one function.

If there are non-varargs variables passed then they should be passed first. Varargs must be at the end.

```java 
void method1(String… gfg, int… q) {} 
// Error in method1: The variable argument type String of the method method must be the last parameter

void method2(int... args, string str) {}
// Error in method1: The variable argument type int of the method method must be the last parameter

```

**Key Points Regarding Varargs:** <br />
1. Vararg Methods can also be overloaded, but overloading may lead to ambiguity.
2. Before JDK 5, variable length arguments could be handled in two ways: One was using overloading, other was using array argument.
3. There can be only one variable argument in a method.
4. Variable argument (Varargs) must be the last argument.

## References:

[1] Documentation: [GFG](https://www.geeksforgeeks.org/java/) <br />
[2] Playlist: [Complete Java Programming](https://www.youtube.com/playlist?list=PLA3GkZPtsafY62QhQ030p85HAer0pFDdr) <br />
[3] [Object Class](https://www.geeksforgeeks.org/object-class-in-java/) <br />
[4] [Static Method VS Non Static Method](https://www.geeksforgeeks.org/static-methods-vs-instance-methods-java/) <br />
[5] [Variable Arguments - Varargs](https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/) <br />