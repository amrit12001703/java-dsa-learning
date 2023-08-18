package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P008_MinimumDiffInArr {

    public static int findMinDiff(int[] arr){
        Arrays.sort(arr);
        int res= Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            res=Math.min(res,arr[i+1]-arr[i]);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMinDiff(arr));
    }
}
