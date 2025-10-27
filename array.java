import java.util.Scanner;
import java.util.*;

public class array {
    // method for linear search
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // method for largest of array
    public static int largestarr(int number[]) {
        // Integer.MAX_VALUE tending to +infinity
        // Integer.MIN_VALUE tending to -infinity
        // both are in util of java
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];

            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }

    // binary search
    // time complexity O(log(n))
    public static int binarySearch(int number[], int key) {
        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] > key) {
                // left
                end = mid - 1;
            }
            if (number[mid] < key) {
                // right
                start = mid + 1;

            }
            if (number[mid] == key) {
                // found
                return mid;
            }

        }
        return -1;
    }

    // reverse of array
    public static void reverse(int original[]) {
        int start = 0;
        int end = original.length - 1;

        while (start < end) {
            // swap
            int temp = original[end];
            original[end] = original[start];
            original[start] = temp;

            start++;
            end--;
        }

    }

    // pairs subset printing
    public static void subset(int original[]) {
        int totalPairs = 0;
        for (int i = 0; i < original.length; i++) {
            int currentI = original[i];
            for (int j = i + 1; j < original.length; j++) {
                int currentJ = original[j];
                System.out.print("(" + currentI + ", " + currentJ + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("The Total number of pairs: " + totalPairs);

    }

    // from here implication of above methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array are structure of storing data of same type.

        // array has create , input, output, update:

        // create
        int firstarr[] = new int[50]; // fixed or static array
        int numberarr[] = { 1, 2, 3 }; // computer can read array
        int morenumbers[] = { 1, 4, 5, 6 };
        String fruits[] = { "apple", "mango", "banana" };

        // input and output
        firstarr[0] = sc.nextInt();
        firstarr[1] = sc.nextInt();
        firstarr[2] = sc.nextInt();
        System.out.println(firstarr[0]);
        System.out.println(firstarr[1]);
        System.out.println(firstarr[2]);

        // operation
        firstarr[1] = firstarr[0] + firstarr[1] - 2;
        System.out.println("new value of:" + firstarr[1]);

        // length of array
        System.out.println(firstarr.length);

        // using loop : very important
        int arrnew[] = new int[5];

        System.out.println("enter the values in arrnew:");
        for (int i = 0; i < arrnew.length; i++) {
            arrnew[i] = sc.nextInt();
        }
        for (int i = 0; i < arrnew.length; i++) {
            arrnew[i] = 2 + arrnew[i];
        }
        for (int i = 0; i < arrnew.length; i++) {
            System.out.println(arrnew[i]);
        }

        /// linear search
        // time complexity O[n]
        int number[] = { 7, 8, 4, 5, 6, 1, 3, 2 };
        System.out.println("enter key value:");
        int key = sc.nextInt();
        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("Not found");

        } else {
            System.out.println("key is present on index:" + index);
        }

        // largest and smallest element of array
        System.out.println(largestarr(number));

        /// very important binary search
        System.out.println("Result of binary search");
        int value = binarySearch(number, key);
        if (value == -1) {
            System.out.println("NOt found");

        } else {
            System.out.println("The number is at index: " + value);
        }

        // reverse
        int original[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverse(original);
        for (int i = 0; i < number.length; i++) {
            System.out.println(original[i]);

        }

        // calling subset
        subset(original);
    }

}
