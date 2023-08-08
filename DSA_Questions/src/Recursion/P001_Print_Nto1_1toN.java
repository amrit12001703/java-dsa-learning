package Recursion;

public class P001_Print_Nto1_1toN {
    public static void print1toN(int n){
        if(n==0)
            return;
        print1toN(n-1);
        System.out.println(n);
    }
    public static void printNto1(int n){
        if(n==0)
            return;
        System.out.println(n);
        printNto1(n-1);
    }
    public static void main(String[] args){
        int n=8;
        System.out.println("---N to 1---");
        printNto1(n);
        System.out.println("\n---1 to N---");
        print1toN(n);
    }
}
