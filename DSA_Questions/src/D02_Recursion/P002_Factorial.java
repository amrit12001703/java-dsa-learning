package D02_Recursion;

import java.util.Scanner;

public class P002_Factorial {

    public static int factorial(int value){
        if(value==1)
            return 1;
        return value * factorial(value-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(factorial(n2));

    }
}
