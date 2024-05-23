## Level Zero

_Level Zero_ is the beginning samples of source.
Meant to be very entry-level.

### Canonical Hello World

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println('Hello from ZipCode!');
    }
}

# Output:
# 'Hello, World!'
```

In this example, we've created a basic Java program that prints `Hello from ZipCode!` to the console. This is often the first program that beginners write when learning a new programming language. It's a simple yet effective way to understand the basic structure of a Java program.

### Understanding Primitive Data Types in Java

```java
public class BasicDataTypes {
    public static void main(String[] args) {
        int number = 10;
        float floatNumber = 20.0f;
        double doubleNumber = 30.0;
        char character = 'A';
        boolean isJavaFun = true;

        System.out.println(number);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(character);
        System.out.println(isJavaFun);
    }
}

# Output:
# 10
# 20.0
# 30.0
# A
# true
```

This code declares and initializes several variables of different data types, then prints their values to the standard output.
Understanding these primitive data types is crucial to programming in Java, as they form the building blocks of more complex data structures and algorithms.
But they are an awkward part of Java, they make Java not a completely OOP language.

### Control Structures: Making Decisions with If-Else Statements

Control structures allow your program to make decisions based on certain conditions. One of the most common control structures in Java is the if-else statement.

```java
public class ControlStructures {
    public static void main(String[] args) {
        int number = 8;

        if (number > 4) {
            System.out.println('The number is greater than 4.');
        } else {
            System.out.println('The number is not greater than 4.');
        }
    }
}

# Output:
# 'The number is greater than 4.'
```

In this example, the program checks if the variable `number` is greater than 5.
If it is, it prints `The number is greater than 5.` to standard output.
Otherwise, it prints `The number is not greater than 5.`
Understanding control structures is key to writing dynamic programs that can respond to different situations and make decisions.

### Simple Class Definitions: Creating Your First Java Class

In Java, _almost_ everything is an object, and objects are instances of classes.
Classes are essentially blueprints for creating objects.
They define the instance variables and methods that an object of that class will have.

```java
public class NameNumber {
    int number;
    String text;

    NameNumber(int number, String text) {
        this.number = number;
        this.text = text;
    }

    String toString() {
      return "Number: " + this.number + "\nText: " + this.text
    }

    void display() {
        System.out.println(this.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        NameNumber anObject = new NameNumber(10, 'Hello, World!');
        anObject.display();
    }
}

# Output:
# 'Number: 10'
# 'Text: Hello, World!'
```

In this example, we've created a simple class called `NameNumber` with two instance variables: `number` and `text`.
We've also defined a constructor for the class (the `NameNumber(int number, String text)`method), which is a special method that's called when an object of the class is created.
There is a`toString()`method which will return a String with the instance variables' value.
Finally, we've defined a`display()`method that calls`toString()`and prints the values of the`number`and`text` instance variables to the standard output.
