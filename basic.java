import java.util.Scanner;

public class basic {
    // output
    public static void main(String[] args) {
        // output
        System.out.println("hello world");
        // input

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");
        String name;
        name = sc.nextLine();
        System.out.println(name);

        // avg
        System.out.println("For avg enter a b c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;
        System.out.println(avg);

        // area of sq.
        System.out.println("inter the length of side of square:");
        float s = sc.nextFloat();
        float AOS = s * s;
        System.out.println(AOS);

        // bill
        System.out.println("Enter the amount of Pen,Penscile,and Eraser for billing: ");
        float pn = sc.nextFloat();
        float p = sc.nextFloat();
        float e = sc.nextFloat();

        float bill = (((pn + p + e) / 100) * 18) + (pn + p + e);
        System.out.print("The amount of bill including GST :" + bill);

        // we can see symbol using is also valid.
        int $ = 10;

        // type conversion : means java automaticlly converts small datatype to large
        // datatype present in any of logical st.
        byte k = 5;
        char q = 'a';
        short r = 512;
        int i = 1000;
        float f = 22.2f;
        double d = 50000;
        double result = (f * q) + (i * r) + (d * k);
        System.out.println(result);

        // type casting= loosing conversion happens in big data type to small datatype

        double result1 = (int) result;
        System.out.println(result1);

        // conditional statement

        System.out.println("give the value of y:");
        float y = sc.nextFloat();
        // ternary operator
        String Answer = (y > 0) ? "positive" : "negative ";
        System.out.println(Answer);

        double temp = 103.5;
        System.out.println("Enter your body temperature in d celc.:");
        double t = sc.nextDouble();
        String fevere = sc.nextLine();
        fevere = (t > temp) ? "you have fevere." : "you dont have fevere.";
        System.out.println(fevere);

        // switch case
        System.out.println("Enter the day count for day:");
        int day;
        day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mpnday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrsday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Entry");

        }

        // if-else nesting
        // leap year
        System.out.println("Enter the year:");
        double year = sc.nextDouble();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap year.");
                } else {
                    System.out.println("Not leap year.");
                }
            } else {
                System.out.println("leap year");
            }
        } else {
            System.out.println("not leap year.");
        }

        // Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd
        // integers.

        System.out.println("Enter the integer upto which operation has to perform:");
        int v = sc.nextInt();
        double adde = 0;
        double addo = 0;
        for (int z = 1; z <= v; z++) {
            if (z % 2 == 0) {
                adde = adde + z;

            } else {
                addo = addo + z;
            }

        }
        System.out.println(adde);
        System.out.println(addo);

        // factorial
        int fact = 1;
        for (int z = 1; z <= v; z++) {
            fact = fact * z;

        }
        System.out.println("the factorial is " + fact);

        // multiplication table
        for (int z = 1; z <= 10; z++) {
            int l = v * z;
            System.out.println(v + "*" + z + "=1" + l);
        }

        // function/method

        // retunType name(type param1,type param2){
        // body
        // return statement; }
       System.out.println("please enter value of o and p");
int o= sc.nextInt();
int u= sc.nextInt();
sumofnum(u , o);//u and o are the arguements

//is no. is prime 
System.out.println("Enter value of l");
int l = sc.nextInt();
System.err.println("The number "+ l+ " is prime this statement is "+ isprime(l));


//binary to decimal
int pow=0;
int decn= 0;
System.out.println("enter binary no. =");
int binn= sc.nextInt();
while (binn>0) {
    int lastdig= binn%10;
    decn= decn + (lastdig * (int)Math.pow(2, pow) );
    pow++;
    binn = binn/10;
}
System.out.println(decn);

//dec to binary 
int binnn=0;;
System.out.println("Provide decimal no.");
int decno = sc.nextInt();
int poww=0;
while(decno>0){
    binnn= binnn+ ((decno%2)* (int)Math.pow(10, poww));
    poww++;
    decno= decno/2;

}
System.out.println(binnn);
    }

    // function/method
// in c++ function can be call out of class but in java method is in same class
// in java there is only call by value
        // retunType name(type param1,type param2){
        // body
        // return statement; }
 public static void sumofnum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum );
        }

        //check l is prime or not
        
        public static boolean isprime(int l){
            boolean isprime=  true;
            for(int i=2; i*i<=l ; i++){
                if(l%i== 0){
                    isprime= false;
                    break;
    
                }
              }  return isprime;
            }
            
}
