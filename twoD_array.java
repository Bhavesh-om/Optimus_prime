
public class twoD_array {

    //max of matrix.
    public static int maxof(int num[][]){
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
       
        public static void main(String[] args){
            int num[][]=  {{3, 5, 9},{1, 7, 2},{8, 4, 6}};

        int result = maxof(num);
        System.out.println("Maximum element is: " + result);


    }
}
