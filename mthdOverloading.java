class mul{
    void multiply(int a,int b){
        System.out.println(a*b);
    }
    int multiply(int a,int b, int c){
       return a*b*c; 
    }
    double multiply(double a,double b,double c){
        return a*b*c;
    }

}
class mthdOverloading{
    public static void main(String[] args) {
        mul obj= new mul();
        System.out.println(obj.multiply(2,2,2));
        obj.multiply(2,2);
        System.out.println(obj.multiply(2.00, 3.25, 3.25));
    }
}