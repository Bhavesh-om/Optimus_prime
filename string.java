import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name;
        name = sc.nextLine();
        
        char arr[]= {'a','b','c','d'};
        String str= "abcd";
        String str1= new String("P@1128e");
        //stings are immutable and helpful for many operations
        
        //concatination & length
        System.out.println(name+str1+ " "+ name.length());

        //character position
        System.err.println(str1.charAt(0));
    }
}
