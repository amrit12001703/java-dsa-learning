package Sorting;

import java.util.Collections;
import java.util.Scanner;

public class P012_SortAnArrayWithTwoTypesOfElement {
    static void sortPosNeg(int[] arr){
        int i=-1,j=arr.length;
        while(true){
            do{i++;} while(arr[i]<0);
            do{j--;} while(arr[j]>0);
            if(i>=j)
                return;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sortPosNeg(arr);

        for(int e:arr)
            System.out.println(e);
    }
}
