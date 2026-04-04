import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();

        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str1 = new String("P@1128e");
        // stings are immutable and helpful for many operations
        String s = "Hello";
        s.concat(" World");
        System.out.println(s);

        // concatination & length
        System.out.println(name + str1 + " " + name.length());

        // character position
        System.err.println(str1.charAt(0));

        // substring
        String subStr = "";
        subStr = str1.substring(0, 4);
        System.err.println(subStr);

        // campare
        /*
         * 0=equal
         * <0:-ve....str1<str2
         * >0: +ve...str1>str2
         */
        if (str.compareTo(str1) > 0) {
            System.out.print("Hii");
        } else {
            System.out.print("Bye");
        }

        // if we dont want to defferentiate the upper/lower cases
        if (str.compareToIgnoreCase(str1) > 0) {
            System.out.print(" Sam!");
        } else {
            System.err.print(" Pae!");
        }

        // convert array to string=  arr[i]= String.valueOf(nums[i]);

        // similarly toUpperCase,toLowerCase,toString

        String k= "9";
        // convert to number
        int a= Integer.parseInt(k);
        System.out.println(k+a);
    }
}
