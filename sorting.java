import java.util.*;
public class sorting {
    //sorting meaning arranging in particular order
     public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
     }
    //bubble sort
    //O(n^2)
   public static void bubbleSort(int arr[]){
    int n= arr.length;
    for(int track=0; track<n-1; track++){
        for(int j=0; j<n-1-track; j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= temp;
            }
        }
    }

   } 

   public static void main(String[] args) {
    int arr[]=  {1,9,5,6,2,7};
    bubbleSort(arr);
    printArr(arr);
   }
}

