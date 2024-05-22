

### A first Java progem

Staring with the canonical "Hello, World!" program, we will move on to more complex programs, and then to full projects.

Study the code, and then discuss it. What does it do? How does it do it? What are the parts of the code? What are the parts of the code doing?

What is that `public static void main(String[] args)` thing? What is `System.out.println("Hello, World!")` doing? (Don't over think it!)

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Investigating the [strouhal-number](https://www.sciencedirect.com/topics/engineering/strouhal-number)

Now, what does this code do? How does it do it? 
What are the parts of the code? What are the parts of the code doing?

```java
import java.util.Scanner;

public class SomethingWeird {
    public static void main(String[] args) {
        int aNumber = (int) (Math.random() * 100); // Generate a random number between 0 and 99
        int attempts = 0;
        boolean wellHuh = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SomethingWeird!");

        while (!wellHuh) {
            System.out.print("Enter your strouhal (between 0 and 99): ");
            int strouhal = scanner.nextInt();
            attempts++;

            if (strouhal == aNumber) {
                System.out.println("Congratulations! What ever it was, you did it in " + attempts + " attempts.");
                wellHuh = true;
            } else if (strouhal < aNumber) {
                System.out.println("Too low! Poor doggie.");
            } else {
                System.out.println("Too high! Poor kitty.");
            }
        }

        scanner.close();
    }
}
```

Why are the variables named the way they are? What is the `while` loop doing? 
What is the `if` statement doing? What is the `else if` statement doing? 
What is the `else` statement doing? 

Scanner? What's a scanner? 
What is the `scanner` object doing? What is the `scanner.nextInt()` method doing? What is the `scanner.close()` method doing?

What is the `import java.util.Scanner;` statement doing? Imagine why we need that? What would happen if we didn't have it?

`int` and `boolean`? What do they represent?

### Explanation of the code

_The code generates a random number between 0 and 99.
The user is asked to guess the number.
If the user's guess is too low, the program tells the user that the guess is too low.
If the user's guess is too high, the program tells the user that the guess is too high.
If the user's guess is correct, the program tells the user that the guess is correct and how many attempts it took to get the correct guess._

This description is a good start, but it doesn't explain the code.

### Discussion of the code

What is the `strouhal` number? What is the `strouhal` number used for in this code? (hint, absolutely NOTHING, it's a [red herring](https://en.wikipedia.org/wiki/Red_herring).)

What is the `aNumber` variable used for? What is the `attempts` variable used for? What is the `wellHuh` variable used for?

The wellHuh variable is a [flag](https://en.wikipedia.org/wiki/Flag_(computing)) variable. What is a flag variable? It is used to control the flow of the program. 

What is the `scanner` object used for? What is the `scanner.nextInt()` method used for? What is the `scanner.close()` method used for?
A Scanner is a class in Java that allows you to take input from the user. The `scanner.nextInt()` method reads the next integer from the user. The `scanner.close()` method closes the scanner object.

What is the `import java.util.Scanner;` statement used for? It is used to import the Scanner class from the java.util package.
We need to import the Scanner class because it is not part of the core Java language. If we didn't have the import statement, the compiler would not know what the Scanner class is. And it would give us an error.

What is the `int` keyword used for? What is the `boolean` keyword used for? The `int` keyword is used to declare an integer variable. The `boolean` keyword is used to declare a boolean variable. These tow variable contain the state of the program. They change as the program runs.
As soon as the user guesses the correct number, the `wellHuh` variable is set to true. This causes the while loop to stop running.

What is the `while` loop used for? The `while` loop is used to keep asking the user for input until the user guesses the correct number.

What is the `if` statement used for? What is the `else if` statement used for? What is the `else` statement used for? The `if` statement is used to check if the user's guess is correct. The `else if` statement is used to check if the user's guess is too low. The `else` statement is used to check if the user's guess is too high.
This is `logic` of the program. It is the `thinking` part of the program. It makes decisions, based on the user's input, and controls the _flow_ of the program. (_Control flow) is the order in which the program's code is executed. (There are several means by which you modify the control flow of a program, including `if` statements, `for` loops, and `while` loops.)

#### Exercises

Rename the variables to something more meaningful. `wellHUh` is not a good name for a variable. What would be a better name? Do the other variables as well.
And based on what _you know now that the class does_, what would be a better name for the class?

What would you do to make the program more user friendly? What would you do to make the program more fun?

Java provides ways to organize your code. Classes give us a means to organize our code into logical units. What would be a good name for the class? What would be a better name for the method?

If you replaced the `main()` method with a method that created an Object of type `SomethingWeird` and called a method on that object, what would you name the method? (well, don't overthink it!)

How about a method that would generate a random number? What would you name that method?
How about a method that would take the user's input? What would you name that method?
Give me an example of a method that would check the user's input against the random number. What would you name that method?

Each of these ideas are different ways to structure the game's code. They are different ways to think about the problem. They are different ways to think about the solution.

Coding is all about thinking about the problem and thinking about how to frame a possible solution.

### Another simple program

```java
public class SimpleProgram {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a + b;

        System.out.println("The sum of " + a + " and " + b + " is " + c);
    }
}
```

What's going on in this code?

What are the variables `a`, `b`, and `c` used for? What is the `+` operator used for? What is the `System.out.println()` method used for?

What is the `int` keyword used for? What is the `String` keyword used for? What is the `void` keyword used for? The `int` keyword is used to declare an integer variable. The `String` keyword is used to declare a string variable. The `void` keyword is used to declare a method that does not return a value.

### Program for asking about animals

```java
import java.util.HashMap;
import java.util.Scanner;

public class AnimalProgram {
    public static void main(String[] args) {
        HashMap<String, String> animals = new HashMap<>();
        animals.put("dog", "Woof! Dogs are known for their loyalty and are often referred to as man's best friend.");
        animals.put("cat", "Meow! Cats are independent and have a reputation for being mysterious and aloof.");
        animals.put("cow", "Moo! Cows are domesticated animals that are primarily raised for milk and meat production.");
        animals.put("duck", "Quack! Ducks are aquatic birds that are known for their webbed feet and ability to swim.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        if (animals.containsKey(animal)) {
            String sound = animals.get(animal);
            System.out.println("The sound of a " + animal + " is " + sound);
        } else {
            System.out.println("Sorry, I don't know the sound of that animal.");
        }

        scanner.close();
    }
}
```

What is the `HashMap` class used for? What is the `Scanner` class used for? What is the `System.out.println()` method used for?
(are you getting tired of seeing println yet?)(get over it, println is here to stay!)

Add more animals to this program, where would you add them? How would you add them?

Try to explain the code in your own words. What is the code doing?
What is that `animals` object> What is the `animals.put()` method doing? What is the `animals.containsKey()` method doing? What is the `animals.get()` method doing?

#### Note on the `HashMap` class

The `HashMap` class in Java is used to store and retrieve data using key-value pairs. It is a part of the Java Collections Framework and provides an efficient way to store and retrieve data based on unique keys.

In this program, the `HashMap<String, String>` is used to store information about different animals and their corresponding sounds. The keys in the HashMap are the names of the animals (e.g., "dog", "cat", "cow", "duck"), and the values are the sounds associated with each animal (e.g., "Woof!", "Meow!", "Moo!", "Quack!").

The HashMap allows us to quickly retrieve the sound of an animal by providing its name as the key. For example, if the user enters "dog", the program will use the `animals.containsKey(animal)` method to check if the HashMap contains the key "dog". If it does, the program will use the `animals.get(animal)` method to retrieve the corresponding sound ("Woof!") and display it using System.out.println().

By using a HashMap, we can easily associate each animal with its sound and retrieve the sound efficiently based on the animal's name. It provides a convenient way to organize and access data in this program.

