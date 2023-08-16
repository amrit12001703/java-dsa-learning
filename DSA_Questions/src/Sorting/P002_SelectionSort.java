package Sorting;

public class P002_SelectionSort {

    public static void selectionSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int minInd=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minInd]){
                    minInd=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minInd];
            arr[minInd]=temp;
        }
    }
    public static void main(String [] args){
        int[] arr={7,5,9,0,1,4,8};
        selectionSort(arr);
        for(int e:arr){
            System.out.println(e);
        }
    }
}
