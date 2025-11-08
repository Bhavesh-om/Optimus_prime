import java.util.*;

public class sorting {
    // sorting meaning arranging in particular order
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // bubble sort - comparing greater from start and pushing in on great position
    // O(n^2)
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int track = 0; track < n - 1; track++) {
            for (int j = 0; j < n - 1 - track; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    // selection sort- selecting smaller from whole arr and pushing it front
    // O(n^2) but lil.bit better than bubble sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int track = 0; track < n - 1; track++) {
            int minvalue = track;
            for (int j = track + 1; j < n; j++) {
                // as before element get sorted it sorts after element/unsorted part
                if (arr[minvalue] > arr[j]) {
                    minvalue = j;
                }
            }
            // now we swap
            int temp = arr[minvalue];
            arr[minvalue] = arr[track];
            arr[track] = temp;

        }
    }

    // remember****
    // insertion sort
    // O(n^2)
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int INDprev = i - 1;
            int currVAL = arr[i];

            while (INDprev >= 0 && currVAL < arr[INDprev]) {
                // shift element
                arr[INDprev + 1] = arr[INDprev];
                INDprev--;
            }

            arr[INDprev + 1] = currVAL;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 5, 6, 2, 7 };
        insertionSort(arr);
        printArr(arr);
    }
}
