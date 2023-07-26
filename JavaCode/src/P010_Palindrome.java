import java.util.Objects;
import java.util.Scanner;

public class P010_Palindrome {

    private static boolean checkPalindrome(String str){
        int lastIndex=str.length()-1;
        int firstIndex=0;
        while(lastIndex>firstIndex){
            if(!Objects.equals(str.charAt(lastIndex),str.charAt(firstIndex))){
                return false;
            }
            lastIndex--;
            firstIndex++;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        sc.close();
        System.out.println(checkPalindrome(str));
    }
}
