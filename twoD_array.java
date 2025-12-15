
public class twoD_array {

    //max of matrix.
    public static  int maxof(int num[][]){
        int max= Integer.MIN_VALUE;
         int n= num.length;
         int m= num[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(num[i][j]>max){
                    max= num[i][j];
                }
            }
        }
         return max;

        }

        //diagonal sum/trace...
        public static int diago(int nums[][]){
            int n= nums.length;
            int m= nums[0].length;
            int sum=0;
            if(n!=m) return sum;
                for(int i=0; i<n;i++){
                   
                            sum+= nums[i][i];
                        
                    }
                
                return sum;
        }
       
        //search in 2d matrix
        //we already knowns the brute force and binary search
        //let see stairwise search of target
       
        public static void main(String[] args){
            int num[][]=  {{3, 5, 9},{1, 7, 2},{8, 4, 6}};

        int result = maxof(num);
        System.out.println("Maximum element is: " + result);

       int trace= diago(num);
       System.out.println("Trace  is "+ trace);
    }
}
