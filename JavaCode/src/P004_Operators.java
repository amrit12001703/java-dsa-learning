public class P004_Operators {
    public static void main(String[] args){
        // Bitwise Operators
        int a = 2;
        int b = 7;

        System.out.println("a&b = " + (a & b)); // 0010 & 0111 = 0010 = 2
        System.out.println("a|b = " + (a | b)); // 0010 | 0111 = 7
        System.out.println("a^b = " + (a ^ b)); // 0010 ^ 0111 = 5
        System.out.println("~a = " + ~a); // 2's complement of 2 = -3
    }
}
