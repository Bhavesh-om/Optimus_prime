import java.util.*;

public class pracnew {
    public static void main(String[] args) {
        // array
        int[] numbers = {10, 40, 20, 30};
        int[] arr = {1, 10, 3};
        int[] copy;

        System.out.println("Array element at index 0 is " + numbers[0]);
        System.out.println("Length of numbers: " + numbers.length);

        Arrays.sort(numbers);
        System.out.println("Largest element: " + numbers[numbers.length - 1]);

        if (Arrays.equals(arr, numbers)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 10);
        System.out.println("Index of 10 in arr: " + index);

        // string
        String message = "Hello Om";
        String om = "Hello Om";
        System.out.println("The length of string message is " + message.length());

        System.out.println("Lowercase: " + message.toLowerCase());
        System.out.println("Uppercase: " + message.toUpperCase());

        System.out.println("First character: " + message.charAt(0));

        if (message.equals(om)) {
            System.out.println("equal string");
        } else {
            System.out.println("unequal string");
        }

        String newMessage = message.concat(" " + om);
        System.out.println("Concatenated: " + newMessage);

        String replaced = message.replace("Om", "World");
        System.out.println("Replaced: " + replaced);

        String sub = message.substring(0, 5);
        System.out.println("Substring: " + sub);

        String spaced = "   Hello Om   ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // vector
        Vector<String> vec = new Vector<>();
        vec.add("AppleB");
        vec.add("Banana");
        System.out.println("Vector elements: " + vec);
        System.out.println("First element: " + vec.get(0));
        vec.remove(0);
        System.out.println("After removal: " + vec);

        System.out.println("Size of vector: " + vec.size());
        System.out.println("Contains Banana? " + vec.contains("Banana"));

        Object[] arr1 = vec.toArray();
        System.out.println("Vector as array: " + Arrays.toString(arr1));
        System.out.println("Vector toString: " + vec.toString());
    }
}