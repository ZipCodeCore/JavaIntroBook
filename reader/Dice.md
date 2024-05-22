# Dice in Softwre

Dice are a common tool in software development. They are used to generate random numbers, which can be used for a variety of purposes. For example, dice can be used to simulate the roll of a die in a game, or to generate random numbers for testing purposes.

In this chapter, we will discuss how to generate random numbers using dice, and how to use these random numbers in your software. We will also discuss the concept of randomness and how it can be used in software development.

Let's make sure we are talking about the most common form of dice, the 6-sided die. It is used in many games and other applications. The 6-sided die has 6 faces, numbered 1 through 6. When you roll a 6-sided die, the result is a random number between 1 and 6.

Here is a sample Java program that simulates the roll of a 6-sided die:

```java
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        int result = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + result);
    }
}
```

But now I want to create a class `Die` that represents a single die. The `Die` class should have


- a constructor that initializes the die to a random value between 1 and 6
- a method `roll` that rolls the die and returns the result
- a method `getValue` that returns the current value of the die

Here is the `Die` class:

```java
import java.util.Random;

public class Die {
    private int value;

    public Die() {
        roll();
    }

    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }
}
```

Now I can use the `Die` class to simulate the roll of a die:

```java

public class Main {
    public static void main(String[] args) {
        Die die = new Die();
        System.out.println("You rolled a " + die.getValue());
    }
}
```

This code creates a `Die` object, rolls the die, and prints the result. The `Die` class encapsulates the logic for generating random numbers, making it easy to use in other parts of your software.

## Two Dies (Dice)

Now I want to create a class `Dice` that represents a pair of dice. The `Dice` class should have

- a constructor that initializes the dice to random values between 1 and 6
- a method `roll` that rolls the dice and returns the total
- a method `getValues` that returns the current values of the dice
- a method `isDoubles` that returns true if the dice are doubles (i.e., the values are the same)

Here is the `Dice` class:

```java
import java.util.Random;

public class Dice {
    private Die die1;
    private Die die2;

    public Dice() {
        die1 = new Die();
        die2 = new Die();
    }

    public int roll() {
        die1.roll();
        die2.roll();
        return die1.getValue() + die2.getValue();
        // NOTICE: the return value is the SUM of the two dice
    }

    public int[] getValues() {
        return new int[]{die1.getValue(), die2.getValue()};
    }

    public boolean isDoubles() {
        return die1.getValue() == die2.getValue();
    }
}
```

Now I can use the `Dice` class to simulate the roll of a pair of dice:

```java

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int total = dice.roll();
        int[] values = dice.getValues();
        boolean doubles = dice.isDoubles();

        System.out.println("You rolled a " + total);
        System.out.println("Values: " + values[0] + ", " + values[1]);
        System.out.println("Doubles: " + doubles);
    }
}
```

Now in some fancy dungeon games, people use dice of different numbers of sides. For example, a 20-sided die is used in some games. Here is a class `Die` that represents a 20-sided die:


```java
import java.util.Random;

public class Die {
    private int value;
    private int sides;

    public Die(int sides) {
        this.sides = sides;
        roll();
    }

    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
    }

    public int getValue() {
        return value;
    }
}
```

Notice how the `Die` class now takes a parameter `sides` in the constructor, which specifies the number of sides on the die. This allows you to create dice with different numbers of sides, such as a 20 sided die.

You could also create 8-, 10-, 12-, or 100-sided dice by passing the appropriate number of sides to the constructor.

```java

public class Main {
    public static void main(String[] args) {
        Die d20 = new Die(20);
        System.out.println("You rolled a " + d20.getValue());
    }
}
```

If you needed to roll a pair of dice many, many times, say 153 times, how would you do that? You could create a loop that rolls the dice 153 times, and then prints the total of each roll. Here is an example:

```java 

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i = 0; i < 153; i++) {
            int total = dice.roll();
            System.out.println("Roll " + (i + 1) + ": " + total);
        }
    }
}
```

Now let's keep track of the results of each roll. We can create an array to store the results of each roll, and then print the results at the end. Here is an example:

```java

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int[] results = new int[153];

        for (int i = 0; i < 153; i++) {
            results[i] = dice.roll();
        }

        for (int i = 0; i < 153; i++) {
            System.out.println("Roll " + (i + 1) + ": " + results[i]);
        }
    }
}
```

See the two loops? The first loop rolls the dice 153 times and stores the result of each roll in the `results` array. The second loop prints the results of each roll. This is a common pattern in software development: you perform some operation many times, store the results in an array, and then process the results later.

You could also track the number of times each total occurs. You could create an array to store the number of times each total occurs, and then print the results at the end.
Because the Dice class rolls two 6-sided dice, the total will be between 2 and 12. Here is an example:

```java

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int[] counts = new int[11];

        for (int i = 0; i < 153; i++) {
            int total = dice.roll();
            counts[total - 2]++;
        }
        
        for (int i = 0; i < 11; i++) {
            System.out.println("Total " + (i + 2) + ": " + counts[i]);
        }
    }
}
```

Why is the array 11 elements long? Because the total can be between 2 and 12, which is 11 possible values. The `counts` array stores the number of times each total occurs. The first loop rolls the dice 153 times and increments the count for each total. The second loop prints the number of times each total occurs.

There is that two-loop pattern again: you perform some operation many times, store the results in an array, and then process the results later.

## Summary

Dice are a common tool in software development. They are used to generate random numbers, which can be used for a variety of purposes. In this chapter, we discussed how to generate random numbers using dice, and how to use these random numbers in your software. We also discussed the concept of randomness and how it can be used in software development.

There is a LOT more to using the Random class in Java. You can generate random numbers in a range, generate random booleans, and even generate random strings. You can also use the Random class to shuffle arrays and pick random elements from a list. The Random class is a powerful tool for generating random numbers in your software. More on that later.

