# Reverse a string in Java

Reversing a string is common interviewing question. If you can answer it, it shows you understand Java Strings, loops, and arrays. It also shows you can think through a problem and write a solution.

## The Problem

Given a string, reverse it. For example, given the string "hello", the output should be "olleh".

And if the string is longer, like _"That's one small step for man, one giant leap for mankind."_, the output should be _".dniknam rof pael tnaig eno ,nam rof pets llams eno s'tahT"_.

## The Solution

Here's a simple solution to reverse a string in Java:

### Using a `StringBuilder`

```java
public class ReverseString {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));

        str = "That's one small step for man, one giant leap for mankind.";
        System.out.println(reverseString(str));
    }
}
```

This solution uses a `StringBuilder` to reverse the string. It's a simple and efficient solution.


### Using StringBuffer

```java
public class ReverseString {
    public static String reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));

        str = "That's one small  step for man, one giant leap for mankind.";
        System.out.println(reverseString(str));
    }
}
```

This uses a related class, `StringBuffer`, to reverse the string. StringBuffer is synchronized, which means it's thread-safe. If you don't need thread safety, it's better to use StringBuilder, which is faster.


### Using two indices, `i` and `j`

You might be asked to reverse a sring WITHOUT using `StringBuilder` or `StringBuffer`. Yeah, interviewers are like that sometimes. Here's a solution that uses two indices, `i` and `j`, to reverse the string:

```java
public class ReverseString {
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));

        str = "That's one small  step for man, one giant leap for mankind.";
        System.out.println(reverseString(str));
    }
}
```

This solution uses two indices, `i` and `j`, to swap the characters at the beginning and end of the string. It continues swapping characters until the two indices meet in the middle of the string.

This solution is more efficient than the previous ones because it doesn't create a new object (like `StringBuilder` or `StringBuffer`). Instead, it works directly on the character array of the string.

### Recursion?

Using recusion is often frowned upon if it's not necessary. But here's a recursive solution to reverse a string:

```java
public class ReverseString {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
        // notice how this method CALLS ITSELF. Hmm.
    }

    public static void main(String[] args) {{
        String str = "hello";
        System.out.println(reverseString(str));

        str = "That's one small step for man, one giant leap for mankind.";
        System.out.println(reverseString(str));
    }
}
```

This solution uses recursion to reverse the string. It's a simple and elegant solution, but it's not the most efficient. For long strings, it can cause a `StackOverflowError`. A more efficient solution would be to use a `StringBuilder` or a `char` array to reverse the string.

## Conclusion

Reversing a string is a common problem in Java interviews. It's a good way to demonstrate your understanding of Java Strings, loops, and arrays. The solution can be simple or complex, depending on the approach you take. The key is to think through the problem and come up with a solution that works.
