package Array;

public class P007_MoveZerosToEnd {

    public static void main(String[] args){
        int ptr=0;
        int[] arr={1,2,3,0,0,4,4};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[ptr];
                arr[ptr]=arr[i];
                arr[i]=temp;
                ptr++;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
