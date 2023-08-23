package D04_Sorting;

import java.util.*;

public class P011_KthSmallestElement {

    static int partition(int[] arr,int l,int r){
        int pivot=arr[r];
        int it=l-1;
        for(int i=l;i<=r-1;i++){
            if(arr[i]<pivot) {
                it++;
                int temp=arr[i];
                arr[i]=arr[it];
                arr[it]=temp;
            }
        }
        int temp=arr[it+1];
        arr[it+1]=arr[r];
        arr[r]=temp;
        return it+1;
    }



    static int kthSmallestElement(int[] arr,int k){
        int l=0,r=arr.length-1;
        while(l<=r){
            int p=partition(arr,l,r);
            if(p==k-1)
                return p;
            else if(p>k-1)
                r=p-1;
            else
                l=p+1;
        }
//        when k greater then size of array
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int ind=kthSmallestElement(arr,k);

        System.out.println(arr[ind]);


    }
}