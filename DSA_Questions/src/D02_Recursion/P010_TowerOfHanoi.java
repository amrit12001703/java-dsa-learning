package D02_Recursion;

import java.util.Scanner;

public class P010_TowerOfHanoi {

    public static void towerOfHanoi(int noOfDisc,String tower1,String tower2, String tower3){
        if(noOfDisc==1){
            System.out.println("Move Disc "+noOfDisc+" From "+tower1 +" to "+tower3);
            return;
        }
        towerOfHanoi(noOfDisc-1,tower1,tower3,tower2);
        System.out.println("Move Disc "+noOfDisc+" From "+tower1 +" to "+tower3);
        towerOfHanoi(noOfDisc-1,tower2,tower1,tower3);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int noOfDisc=sc.nextInt();
        towerOfHanoi(noOfDisc,"A","B","C");
    }
}
