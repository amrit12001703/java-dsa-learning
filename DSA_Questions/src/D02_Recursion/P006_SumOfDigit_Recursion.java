package D02_Recursion;

public class P006_SumOfDigit_Recursion {
    public static int sumOfDigit(int n){

        if(n==0)
            return 0;

        return (n%10) + sumOfDigit(n/10);
    }
    public static void main(String[] args){
        int n=123;
        System.out.println(sumOfDigit(n));
    }
}
