import java.util.*;
class cycle_sort {
    public static void swap(int[]arr,int swap_idx,int j){
        int temp = arr[swap_idx];
        arr[swap_idx] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        while(i<n){
            int swap_idx = arr[i]-1;
            if(arr[i]==i+1){
                i++;
            }else{
                swap(arr, swap_idx, i);
            }
        }
        for( int c:arr){
            System.out.print(c+" ");
        }
    }
}
