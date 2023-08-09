package Recursion;

import java.util.Scanner;

public class P005_Palindrome_Check {
    public static boolean checkPalindrome(String str,int start,int end){
        if(start>=end)
            return true;
        return (str.charAt(start)==str.charAt(end)) && checkPalindrome(str,start+1,end-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(checkPalindrome(str,0,str.length()-1));
    }
}
