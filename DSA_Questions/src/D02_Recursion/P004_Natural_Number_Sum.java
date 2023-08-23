package D02_Recursion;

import java.util.Scanner;

public class P004_Natural_Number_Sum {

    public static int sumOfNaturalNum(int n){
        if(n==0)
            return 0;
        return sumOfNaturalNum(n-1)+n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfNaturalNum(n));

    }
}
