package D01_Array;

public class P005_LeftRightRotateArrayBy_One {

    public static void rightRotateByOne(int[] arr){
        int element=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=element;
    }

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
        System.out.println("Left Rotate By One:");
        for(int e:arr){
            System.out.println(e);
        }

        int []arr2={1,2,3,4,5,6};
        rightRotateByOne(arr2);
        System.out.println("Right Rotate By One:");
        for(int e:arr2){
            System.out.println(e);
        }
    }
}
