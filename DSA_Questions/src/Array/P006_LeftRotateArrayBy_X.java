package Array;

public class P006_LeftRotateArrayBy_X {
    public static void leftRotateByOne(int[] arr){
        int element=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=element;
    }
    public static void reverse(int [] arr,int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        //Naive Sollution
        int []arr={1,2,3,4,5,6};
        int x=3;
        for(int i=0;i<x;i++)
            leftRotateByOne(arr);
        System.out.println("Naive : ");
        for(int e:arr){
            System.out.println(e);
        }

//        Efficient Sollution - Reversal Approach
        int []arr2={1,2,3,4,5,6};
        reverse(arr2,0,x-1);
        reverse(arr2,x,arr.length-1);
        System.out.println("Efficient : ");
        reverse(arr2,0,arr.length-1);
        for(int e:arr2){
            System.out.println(e);
        }
    }
}
