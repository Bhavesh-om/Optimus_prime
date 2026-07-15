public class stingBuilder {
    public static void main(String[] args) {
        // stringbuilder is mutable and properties as string
        StringBuilder sb = new StringBuilder("Hello");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        /*
          our loop will execute O(26) times for sb while
          for string type it will go for O(n^2) becoz of 
          innertion in string
         */
        System.out.println(sb);
    }
}
