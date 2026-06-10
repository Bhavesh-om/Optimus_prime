//Brute force causes: time complexity O(n^3)
//its to harsh too impliment
//so we move towards the prefix method 

public class subarray {

    public static void subarrPrint(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {

                    System.out.print("(" + numbers[k] + " " + ")"); // subarray
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    // operation on subarray
    // brute force
    public static void subarr(int numbers[]) {
        int ts = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0; // Reset sum for each new subarray

                System.out.print("[ ");
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    // Calculate the sum while printing
                    currSum += numbers[k];
                }
                System.out.print("]");

                // Track the maximum sum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }

                ts++;
                System.out.println(" (Sum: " + currSum + ")");
            }
            System.out.println(" ");
        }
        System.out.println("Total subarrays: " + ts);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    // by prefix method: time complexity O(n^2)
    public static void psubarr(int numbers[]) {
        int ts = 0;
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        // we created prefix array to store the sum of element of the numbers array up
        // to that index
        int prefix[] = new int[numbers.length];
        // calculate prefix array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    //now operation by kadane's algorithm
    //max sum only by O(n)
    //kadane's algorithm: as (1) big + no. sum big/small + no./ small/lit. big -ve no. is good
    //but when (2)Big -ve no. is sum with small +ve or any other -ve no. then it will never round up to max in array we generally set:
    // array current sum=o;
    // no extra memorry required
    //the application as:
 public static void kadane(int original[]){
    int currSum= 0;
    int maxSum= Integer.MIN_VALUE;

    for(int i=0; i< original.length; i++){
        currSum = original[i] + currSum;
        if(currSum<0){
            currSum= 0;
        }
        maxSum= Math.max(currSum, maxSum);
    }
    System.out.println("By Kadane : maxsum- "+ maxSum);
 }

    // main testing
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 5, 10 };
        int original[] = {-1,5,-4,-2,3,2,0};
        subarrPrint(numbers);
        subarr(numbers);
        psubarr(numbers);
        kadane(original);
        //cross verify
        kadane(numbers);
        subarr(original);
    }
}