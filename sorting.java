import java.util.*;

class sorting {
    // sorting meaning arranging in particular order
    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printNum(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    // bubble sort - comparing greater from start and pushing in on great position
    // O(n^2)
    public static void bubbleSort(Integer arr[]) {
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
    public static void selectionSort(Integer arr[]) {
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
    public static void insertionSort(Integer arr[]) {
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

    // counting sort
    public static void countingSort(int num[]) {
        // first find largest of main arr
        int largest = Integer.MIN_VALUE;
        int n = num.length;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, num[i]);
        }

        // now create count arr
        int count[] = new int[largest + 1];
        // now count recurennce of arr[i] and stored that at specefic that place
        for (int i = 0; i < n; i++) {
            count[num[i]]++; // jo value num arr me hai to vo kitani bar aayi hai vo count hum store kar rahr
                             // hai usi value no. ki index in count arr
            // exa 7 is at ind1,2,3 and in nums So we storing count 3 at ind7 of count arr.
        }
        // now sorting and cutting values of count
        int j = 0;
        for (int i = 0; i <= count.length - 1; i++) {
            while (count[i] > 0) {
                num[j] = i;
                // i vo ind hai count ki jo value hai num me thats why above line works in
                // sorting

                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 9, 5, 6, 2, 7 };
        int num[] = { 1, 1, 2, 2, 9, 4, 4, 0, 3 };
        // insertionSort(arr);
        // bubbleSort(arr);
        // selectionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        countingSort(num);
        printNum(num);

        // as below will give error becoz
        // we are having array.sort() inside it comparator
        // both get conflict for object type and premetive datatype
        // becoz reverse order only applicable on object
        // Integer[] arrr = used
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);

    }
}
