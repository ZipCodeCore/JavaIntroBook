
# Sorting and Searching

Sorting and Searching are two very common mental models of computing. Sorting is the process of arranging elements in a specific order, while searching is the process of finding a specific element in a collection of elements. Both sorting and searching are fundamental operations in computer science and are used in various applications.

In this chapter, we will discuss different sorting and searching algorithms, including Bubble Sort, Selection Sort, Insertion Sort, Linear Search, and Binary Search. We will also discuss the time complexity of these algorithms and how to implement them in Java.

## Sorting Algorithms

 Here's a Java class named `SortingAlgorithms` that includes three sorting algorithms: Bubble Sort, Selection Sort, and Insertion Sort.

```java
public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap arr[minIndex] and arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
```

Here's how you can use these sorting algorithms:

```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nArray after Bubble Sort:");
        SortingAlgorithms.bubbleSort(arr);
        printArray(arr);

        arr = new int[]{64, 34, 25, 12, 22, 11, 90}; // reset array

        System.out.println("\nArray after Selection Sort:");
        SortingAlgorithms.selectionSort(arr);
        printArray(arr);

        arr = new int[]{64, 34, 25, 12, 22, 11, 90}; // reset array

        System.out.println("\nArray after Insertion Sort:");
        SortingAlgorithms.insertionSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
```

This `Main` class creates an array of integers, sorts it using the three algorithms from the `SortingAlgorithms` class, and then prints the sorted array. The `printArray` method is used to print the array.

Now, given a whiteboard, how would you describe the differences between Bubble Sort, Selection Sort, and Insertion Sort? 

Do any of these sorting algorithms have a time complexity of O(n)? (Do you know what O(n) means?)

## Searching Algorithms

Here's a Java class named `SearchingAlgorithms` that includes two searching algorithms: Linear Search and Binary Search.

```java
public class SearchingAlgorithms {

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
```

Here's how you can use these searching algorithms:

```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};

        int x = 10;

        int result = SearchingAlgorithms.linearSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }

        result = SearchingAlgorithms.binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
```

This `Main` class creates an array of integers and searches for a specific element using the two algorithms from the `SearchingAlgorithms` class. The result is printed to the console.

Now, given a whiteboard, how would you describe the differences between Linear Search and Binary Search?

And what would happen if you changed the array to be `int[] arr = {2, 13, 7, 4, 10, 40, 5};` and searched for `x = 7` with linear search?

So binary search is faster when the array is sorted. But what if the array is not sorted? What would happen if you searched for `x = 7` in the array `int[] arr = {2, 13, 7, 4, 10, 40, 5};` using binary search?

If the array is sorted, but about a million numbers long, which search faster and by how much?

## Exercises

1. Implement the Merge Sort algorithm in Java. Merge sort is a divide-and-conquer algorithm that divides the input array into two halves, recursively sorts the two halves, and then merges the sorted halves. The time complexity of merge sort is O(n log n). (Is that good?) Is that description enough for you to write mergesort without the help of the internet?

2. Implement the Quick Sort algorithm in Java. Quick sort is another divide-and-conquer algorithm that selects a pivot element and partitions the array around the pivot. The time complexity of quick sort is O(n log n) on average and O(n^2) in the worst case. (What does that mean?) Can you write quicksort without the help of the internet?

3. Describe the differences between Merge Sort and Quick Sort. Which one is more efficient in terms of time complexity? Which one is more efficient in terms of space complexity?

4. Yes, think about that! Some sorting algorithms are faster than others, but they may require more memory. Some sorting algorithms are slower but use less memory. How big does your data set have to be to make a difference on a 4GB laptop? How about on a 16GB laptop? How about on a 64GB laptop?

5. If the data set is small, does it matter which sorting algorithm you use? If the data set is large, does it matter which sorting algorithm you use? (well, I am asking for a reason, go with your gut and then look it up.)
