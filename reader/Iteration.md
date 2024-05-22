# Iteration

Iteration is the process of repeating a set of instructions a specified number of times or until a specific condition is met. In programming, iteration is a fundamental concept that is commonly used to loop through a block of code multiple times. This allows you to perform the same operation on each item in a collection, such as a list or array.

There are several types of iteration constructs in Java, including `for`, `while`, and `do-while` loops. 
Each type of loop has its own use cases and syntax, but they all serve the same purpose of repeating a block of code until a certain condition is met. The simple iteration statements are discussed in the Flow of Contorl chapter.

In this chapter, we will explore the lesser known types of iteration constructs in Java and how to use them effectively in your programs.

Here is an array of object, each object is a `Person` with a `name` and an `age`:

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

If I created an array of Person objects, each with a different name and age, I could iterate over the array and print out the name and age of each person:

```java
public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 35)
        };

        for (Person person : people) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }
}
```

That `for` loop is special. It's called an "enhanced for loop" or a "for-each loop". It's a shorthand way of iterating over an array or a collection in Java. It's a more concise and readable way of writing a loop that iterates over each element in an array or collection. You don't need to manage an index variable or an other conditional variable. The loop automatically iterates over each element in the array or collection just once.

The syntax of the enhanced for loop is as follows:

```java
for (Type variable : array) {
    // code block to be executed
}
```

In this syntax:
- `Type` is the type of elements in the array or collection.
- `variable` is the variable that represents each element in the array or collection.
- `array` is the array or collection that you want to iterate over.

The enhanced for loop is a great way to iterate over arrays and collections when you don't need to keep track of the index or modify the elements in the array or collection. It's simple, concise, and easy to read.

There are other forms of _iteration_ in Java, including the `for` loop, the `while` loop, and the `do-while` loop. Each of these loops has its own use cases and syntax, but they all serve the same purpose of repeating a block of code until a certain condition is met.

In Java there are also other, less common, ways to iterate over collections, such as using the `Iterator` interface or the `forEach` method introduced in Java 8. These methods provide more flexibility and control over the iteration process, but they are more complex and require a deeper understanding of Java's collection framework.

The `Iterator` interface provides a way to iterate over a collection of elements and remove elements from the collection during the iteration process. It allows you to traverse a collection in both directions and perform various operations on the elements in the collection.

Here is an example of the `Iterator` interface being used to iterate over a list of strings:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
```

In this example, we create an `ArrayList` of strings and use the `iterator()` method to get an `Iterator` object that allows us to iterate over the elements in the list. We then use the `hasNext()` method to check if there are more elements in the list, and the `next()` method to get the next element in the list.

The Iterator interface provides two methods for iterating over a collection: `hasNext()` and `next()`. The `hasNext()` method returns `true` if there are more elements in the collection to iterate over, and `false` otherwise. The `next()` method returns the next element in the collection and advances the iterator to the next position.

### forEach Method

The `forEach` method introduced in Java 8 allows you to iterate over a collection using a lambda expression. It provides a more concise and readable way of iterating over collections and performing operations on each element in the collection.

Here is an example of using the `forEach` method to iterate over a list of strings:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.forEach(name -> System.out.println(name));
    }
}
```

In this example, we use the `forEach` method to iterate over the elements in the list of strings and print out each element using a lambda expression. The lambda expression `name -> System.out.println(name)` is a shorthand way of defining an anonymous function that takes a single argument `name` and prints it out.
See how short the code is? This is a good example of how Java has evolved over the years to make it easier and more concise to write code. Many Java programmers prefer using the `forEach` method over the traditional `for` loop because it is more readable and expressive. But many don't know the form, or don't have it memorized. It's a good thing to know, and to use when it makes sense.

In summary, iteration is a fundamental concept in programming that allows you to repeat a block of code multiple times. There are several ways to iterate over collections in Java, including the enhanced for loop, the `Iterator` interface, and the `forEach` method. Each of these methods has its own use cases and syntax, but they all serve the same purpose of repeating a block of code until a certain condition is met. The enhanced for loop is a simple and concise way to iterate over arrays and collections, while the `Iterator` interface and `forEach` method provide more flexibility and control over the iteration process. It's important to understand how each of these methods works and when to use them in your programs.

### Exercises

For these first three, make sure you have read the Flow of Control chapter.

1. Write a program that uses a `for` loop to iterate over an array of integers and print out the sum of all the elements in the array.

2. Write a program that uses a `while` loop to iterate over a list of strings and print out each string in reverse order.

3. Write a program that uses a `do-while` loop to iterate over a set of numbers and calculate the factorial of each number.

NOw, get fancy and try these:

4. Write a program that uses the `Iterator` interface to iterate over a collection of objects and remove any objects that meet a certain condition.  Finish out the example below. Here is an example of a collection of objects: 

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> iterator = numbers.iterator();
        while ( /*the iterator has a next element */ ) {
            // get the next element
            if (number % 2 == 0) { // if the number is even
                // remove the element
            }
        }

        System.out.println(numbers);
    }
}
```

5. Write a program that uses the `forEach` method to iterate over a list of strings and count the number of strings that contain a specific substring. Finish out the example below. Here is an example of a list of strings:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        int count = 0;
        names.forEach(name -> {
            if ( /* the name contains the substring "li" */ ) {
                // increment the count
            }
        });

        System.out.println(count);
    }
}
```

Hmm. Not sure what a "substring is"? Well, according to the [JavaDocs](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#substring(int,int)), a substring is a contiguous sequence of characters within a string. So, in the example above, we are looking for the substring "li" in each name in the list of strings. If the name contains the substring "li", we increment the count.

Imagine you needed to find a string like "Zip Code" in a paragraph of text. You might use a substring to find it.

### Summary

Iteration is a fundamental concept in programming that allows you to repeat a block of code multiple times. There are several ways to iterate over collections in Java, including the enhanced for loop, the `Iterator` interface, and the `forEach` method. Each of these methods has its own use cases and syntax, but they all serve the same purpose of repeating a block of code until a certain condition is met. The enhanced for loop is a simple and concise way to iterate over arrays and collections, while the `Iterator` interface and `forEach` method provide more flexibility and control over the iteration process. It's important to understand how each of these methods works and when to use them in your programs.

