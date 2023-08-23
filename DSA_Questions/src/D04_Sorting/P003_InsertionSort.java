package D04_Sorting;

public class P003_InsertionSort {

    public static void insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            //arr[i] will change so need to store it in a key
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }
    public static void main(String[] args){
        int[] arr={1,4,2,3,6,9,2,0};
        insertionSort(arr);
        for(int e:arr){
            System.out.println(e);
        }
    }
}
