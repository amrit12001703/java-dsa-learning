package Recursion;

import java.util.Scanner;

public class P007_MaxCutInRope {
    public static int ropeCutting(int n,int a, int b,int c){

        if(n==0)
            return 0;
        if(n<0)
            return -1;

        int max=Math.max(
                ropeCutting(n-a,a,b,c),
                Math.max(ropeCutting(n-b,a,b,c),
                ropeCutting(n-c,a,b,c))
        );
        //For exception if there is no pair exist and max is -1
        if(max==-1)
            return -1;

        return max+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(ropeCutting(n,a,b,c));
    }
}
