# Flow of Control

In Java, there are several key _flow of control_ statements that allow you to control the flow of your program. 

These statements include: 
- `if` statements
- `for` loops
- `while` loops
- `do-while` loops
- `switch` statements

In this chapter, we will discuss each of these statements in detail and provide examples of how to use them in Java programs.

## `if` Statements

The `if` statement is used to execute a block of code only if a specified condition is true.

Here's an example of an `if` statement in Java:

```java
public class Main {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
    }
}
```

In this example, the `if` statement checks if the value of `x` is greater than 5. If the condition is true, the code inside the block is executed, and the message "x is greater than 5" is printed to the console.

```java
// Example using a boolean variable for the condition
public class Main {
    public static void main(String[] args) {
        boolean isSunny = true;
        if (isSunny) {
            System.out.println("It's a sunny day!");
        }
    }
}
```

In this example, the `if` statement checks if the `isSunny` variable is `true`. If the condition is true, the message "It's a sunny day!" is printed to the console.

## `if-else` Statements

The `if-else` statement is used to execute one block of code if a specified condition is true and another block of code if the condition is false.

Here's an example of an `if-else` statement in Java:

```java
public class Main {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }
    }
}
```

In this example, the `if-else` statement checks if the value of `x` is greater than 5. If the condition is true, the message "x is greater than 5" is printed to the console. If the condition is false, the message "x is less than or equal to 5" is printed.

## `if-else if-else` Statements

The `if-else if-else` statement is used to execute one block of code if a specified condition is true, another block of code if a second condition is true, and a default block of code if none of the conditions are true.

Here's an example of an `if-else if-else` statement in Java:

```java
public class Main {
    public static void main(String[] args) {
        int x = 10;
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else if (x < 10) {
            System.out.println("x is less than 10");
        } else {
            System.out.println("x is equal to 10");
        }
    }
}
```

In this example, the `if-else if-else` statement checks if the value of `x` is greater than 10, less than 10, or equal to 10. Depending on the value of `x`, the appropriate message is printed to the console.

But a better way to do this example is to use a `switch` statement.

## `switch` Statements

The `switch` statement is used to select one of many code blocks to be executed.

Here's an example of a `switch` statement in Java:

```java
public class Main {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 5:
                System.out.println("x is 5");
                break;
            case 10:
                System.out.println("x is 10");
                break;
            default:
                System.out.println("x is neither 5 nor 10");
        }
    }
}
```

It lets you add as many `case` statements as you need to handle different values of `x`. Here we've added a `default` case to handle any other value of `x` that isn't covered by the `case` statements. We have also added a `break` statement after each `case` to prevent the code from falling through to the next `case`.

Now, if we wanted to extend this example with 3 more possible values of `x`, we could do so like this:

```java
public class Main {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 5:
                System.out.println("x is 5");
                break;
            case 10:
                System.out.println("x is 10");
                break;
            case 15:
                System.out.println("x is 15");
                break;
            case 20:
                System.out.println("x is 20");
                break;
            default:
                System.out.println("x is neither 5, 10, 15, nor 20");
        }
    }
}
```

Switch statements are often used when you have a limited number of possible values for a variable and you want to execute different code blocks based on the value of the variable. You could use them with Java enums, for example.

## `for` Loops

The `for` loop is used to execute a block of code a specified number of times.

Here's an example of a `for` loop in Java:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }
    }
}
```

In this example, the `for` loop will execute the code block inside the loop 5 times, printing "Hello, World!" to the console each time.
We can also _count down_ with a `for` loop:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}
```

This will print the numbers 5, 4, 3, 2, and 1 to the console.

We can count by 2 or any other increment:

```java
public class Main {
    public static void main(String[] args) {
        int delta = 2; // delta is the increment and can be any integer
        for (int i = 0; i < 10; i += delta) {
            System.out.println(i);
        }
    }
}
```

This will print the numbers 0, 2, 4, 6, and 8 to the console.

## `while` Loops

The `while` loop is used to execute a block of code as long as a specified condition is true. THis used often when you don't know how many times you need to loop. Or when the condition is based on user input, is part of the data you're processing or is based on some other external factor.

Here's an example of a `while` loop in Java:

```java
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

In this example, the `while` loop will execute the code block inside the loop as long as the value of `i` is less than 5. It will print the numbers 0, 1, 2, 3, and 4 to the console.

(Notice that line `i++;` it is crucial to increment the value of `i` inside the loop to avoid an infinite loop. If you forget to increment the value of `i`, the loop will continue indefinitely.)

## `do-while` Loops

The `do-while` loop is similar to the `while` loop, but the condition is evaluated after the code block has been executed. This means that the code block will always be executed at least once, even if the condition is false. While not used as often as `while` loops, they are useful when you need to ensure that a block of code is executed at least once. (and yes, there are specific use cases where this can be handy.)

Here's an example of a `do-while` loop in Java:

```java
public class Main {
    public static void main(String[] args) {
        int i = 0;
        
        System.out.println("Loop started");
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        System.out.println("Loop ended");
    }
}
```

In this example, the `do-while` loop will execute the code block inside the loop as long as the value of `i` is less than 5. It will print the numbers 0, 1, 2, 3, and 4 to the console. See how the loop's body gets run first, before the condition is checked? If the condition is false, the loop ends and the flow of control moves to the next statement after the loop.

## Summary

In this chapter, we discussed the key flow of control statements in Java, including `if` statements, `for` loops, `while` loops, `do-while` loops, and `switch` statements. These statements allow you to control the flow of your program based on specified conditions and execute code blocks multiple times. Understanding how to use these statements effectively is essential for writing efficient and readable Java programs.

## Exercises

1. Write a Java program that uses an `if` statement to check if a number is positive, negative, or zero.

2. Write a Java program that uses a `for` loop to print the first 10 even numbers.

3. Write a Java program that uses a `while` loop to calculate the sum of the first 10 natural numbers.

4. Write a Java program that uses a `do-while` loop to print the numbers from 1 to 10.

5. Write a Java program that uses a `switch` statement to print the name of a month based on its number (1 for January, 2 for February, etc.).

6. Write a Java program that uses nested `for` loops to print a pattern of stars like the following:

```
*
**
***
****
*****
```

7. Write a Java program that uses nested `for` loops to print a pattern of numbers like the following:

```
1
22
333
4444
55555
```

8. Write a Java program that uses a `while` loop to find the factorial of a given number.

9. Write a Java program that uses a `do-while` loop to reverse a given number. (like this: 1234 -> 4321)

10. Write a Java program that uses a `switch` statement to print the name of a day of the week based on its number (1 for Sunday, 2 for Monday, etc.). (No fair peeking at the answer exercise 5)

## Additional Resources

- [Oracle Java Tutorials: Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [W3Schools Java Tutorial: Java Switch](https://www.w3schools.com/java/java_switch.asp)
- [GeeksforGeeks: Java Decision Making (if, if-else, switch, break, continue, jump)](https://www.geeksforgeeks.org/java-decision-making-if-if-else-switch-break-continue-jump/)

