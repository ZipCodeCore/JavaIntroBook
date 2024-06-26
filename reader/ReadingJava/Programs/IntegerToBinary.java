// Level-2 
// Make this program into a much more useful class.
// make main method into a method that takes a string array as an argument.

// but make the convert method into a static method that takes an int as an argument and returns a string.

/******************************************************************************
 *  Compilation:  javac IntegerToBinary.java
 *  Execution:    java IntegerToBinary n
 *
 *  Prints out the binary representation of the integer n.
 *
 *  % java IntegerToBinary 8
 *  1000
 *
 *  % java IntegerToBinary 366
 *  101101110
 *
 *  from Princeton
 ******************************************************************************/

public class IntegerToBinary {

    public static void convert(int n) {
        if (n == 0) return;
        convert(n / 2);
        StdOut.print(n % 2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        convert(n);
        StdOut.println();
    }

}
