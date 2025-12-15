
public class problems {
    // traping rainwater
    // hight of bars = [4 2 0 6 3 2 5]
    // prefer Traping_rainwater.png

    public static int trappedRainwater(int height[]) {
        // calculate left max boundary-array
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right min boundary-array
        int RightMax[] = new int[n];
        RightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(height[i], RightMax[i + 1]);
        }

        int trappedRainwater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLVL = min(leftMaxBound , RightMaxBound)
            int waterLVL = Math.min(leftMax[i], RightMax[i]);
            // trapped water = waterLVL- height[i]
            trappedRainwater += waterLVL - height[i];
        }

        return trappedRainwater;
    }

   // Buy & Sell Stocks problem
    // prefer stock.png
    public static int BuySellStock(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                // profit
                int profit = prices[i] - buyPrice;
                // compare
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }

        if (maxProfit > 0) {
            return maxProfit;
        }
        return 0;
    }


    /*There is an integer array nums sorted in ascending order (with distinct values).
    Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
    index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],
    ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, 
    [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and 
    become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, 
    returnthe index oftarget if it is in nums, or -1   if it is not in nums.
    You must write an algorithm with O(log n) runtime complexity */

    //for solving the above question in O(log n) we need binary search
    public static int search(int search[], int target){
        //mid
        int n= search.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid= start+(end-start) /2;

            if(search[mid]==target){
                return mid;
            }
            else if(search[start]<=search[mid]){
                if(search[start]<=target && target<search[mid]){
                    end= mid-1;
                }
                else{ start= mid+1;}
            } else {
                if(target>search[mid] && target<= search[end]){
                    start=mid+1;
                }
                else{ end= mid-1;} 
            }
        }
        return -1;
    }

    //is string palindrome:
    public static boolean ispalindrome(String s){
        for(int i=0;i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }

    // Execution in main:
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuySellStock(prices));

        int search[] = {4,5,6,7,0,1,2};
        int target =0;
        System.out.println(search(search, target));

        String s= "racecar";
        System.out.println(ispalindrome(s));
    }
}