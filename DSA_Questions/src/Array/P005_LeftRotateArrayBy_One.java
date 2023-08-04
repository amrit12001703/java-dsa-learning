package Array;

public class P005_LeftRotateArrayBy_One {

    public static void leftRotateByOne(int arr[]){
        int element=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=element;
    }
    public static void main(String[] args){
        int []arr={1,2,3,4,5,6};
        leftRotateByOne(arr);
        for(int e:arr){
            System.out.println(e);
        }
    }
}
