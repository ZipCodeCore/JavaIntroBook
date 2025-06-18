# FindWord: Read me some code...

Here is an example of pretty simple Java code to read and understand. This program demonstrates several important Java concepts including string manipulation, arrays, loops, and method design.

## What This Program Does

The `FindWord` program is a text analysis tool that counts how many times a specific word appears in a given text string. It's case-insensitive, meaning it will find "Hello", "hello", and "HELLO" as the same word.

## Key Features

- **Case-insensitive search**: Converts both input text and target word to lowercase
- **Word boundary recognition**: Uses string splitting to identify individual words
- **User interaction**: Prompts user for input and provides formatted output
- **Modular design**: Separates word counting logic from user interaction

## How It Works

The program uses several important Java techniques:

1. **String manipulation**: Uses `toLowerCase()` to normalize case and `split()` to break text into words
2. **Array processing**: Iterates through the array of words using a for loop
3. **Method separation**: Divides functionality into logical methods for better organization
4. **User input handling**: Uses `Scanner` to read user input from the console 

```java
import java.util.Scanner;

public class FindWord {

    public int countWords(String input, String target) {
        int wordsLen, i, count=0;
        input = input.toLowerCase();
        target = target.toLowerCase();

        String words[] = input.split("\\s+");
        wordsLen = words.length;

        for(i=0; i<wordsLen; i++) {
            if(target.equals(words[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str, word;
        int wordsLen, i, count=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String: ");
        str = s.nextLine();
        System.out.print("\nEnter a Word to Find its Occurrence: ");
        word = s.next();

        count = new FindWord().countWords(str, word);

        System.out.println(new FindWord().testResult(count, word));

    }

    public String testResult(int count, String word) {
        if(count==0)
            return "\nThe word \"" +word+ "\" is not found in the String.";
        else if(count==1)
            return "\nThe word \"" +word+ "\" occurs only one time.";
        else
            return "\nThe word \"" +word+ "\" found, " +count+ " times.";
    }
}
```

## Code Breakdown

### Method: `countWords(String input, String target)`

This is the core method that performs the word counting logic:

1. **Normalization**: Both `input` and `target` strings are converted to lowercase using `toLowerCase()` to ensure case-insensitive matching
2. **Word splitting**: The input string is split into an array of words using `split("\\s+")`, which splits on one or more whitespace characters
3. **Counting loop**: A for loop iterates through each word in the array, comparing it to the target word using `equals()`
4. **Return result**: The method returns the total count of matches found

### Method: `main(String[] args)`

This method handles user interaction and program flow:

1. **Scanner setup**: Creates a `Scanner` object to read user input from the console
2. **Input collection**: Prompts the user to enter a text string and the word to search for
3. **Method invocation**: Calls `countWords()` to perform the actual counting
4. **Result display**: Uses `testResult()` to format and display the final result

### Method: `testResult(int count, String word)`

This method provides user-friendly output formatting:

- **Zero matches**: Returns a message indicating the word was not found
- **One match**: Returns a message indicating the word was found once
- **Multiple matches**: Returns a message showing how many times the word was found

## Learning Points

This code demonstrates several important programming concepts:

- **Method design**: Breaking functionality into logical, reusable methods
- **String processing**: Converting case, splitting strings, and comparing text
- **Array manipulation**: Working with arrays created from string operations
- **User interface**: Creating a simple console-based interaction
- **Conditional logic**: Using if-else statements to handle different scenarios
- **Object instantiation**: Creating instances of the class to call non-static methods

## Example Usage

```
Enter the String: Hello world this is a test hello again
Enter a Word to Find its Occurrence: hello

The word "hello" found, 2 times.
```

