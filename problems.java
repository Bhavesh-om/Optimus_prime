import java.util.*;

public class problems {
    // traping rainwater
    // hight of bars = [4 2 0 6 3 2 5]
    // prefer Traping_rainwater.png

    public static int trappedRainwater(int height[]) {
        // calculate left max boundary-array
        int  n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right min boundary-array
        int RightMax[] = new int[n];
        RightMax[n - 1] = height[n - 1];
        for (int i =n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(height[i], RightMax[i + 1]);
        }

        int trappedRainwater=0;
        // loop
        for(int i=0; i< n; i++){
             // waterLVL = min(leftMaxBound , RightMaxBound)
             int waterLVL= Math.min(leftMax[i],RightMax[i]);
             // trapped water = waterLVL- height[i]
            trappedRainwater += waterLVL - height[i];
        }
       
        return trappedRainwater;
    }




    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}
