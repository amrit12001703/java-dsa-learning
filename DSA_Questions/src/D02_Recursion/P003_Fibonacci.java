package D02_Recursion;

import java.util.Scanner;

public class P003_Fibonacci {
    public static int fibonacci(int n){
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.println(fibonacci(i));
    }
}
