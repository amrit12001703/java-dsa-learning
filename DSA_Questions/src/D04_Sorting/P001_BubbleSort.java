package D04_Sorting;

public class P001_BubbleSort {

    public static void bubbleSort(int[] arr){
//        n-1 pass
        for(int i=0;i<arr.length-1;i++) {
            //Optimisation
            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=true;
                }
            }
            //if flag is false that means all the items are sorted
            if(!flag)
                break;
        }
    }
    public static void main(String[] args){
        int[] arr={2,9,4,5,1,7};
        bubbleSort(arr);

        for(int i:arr)
            System.out.println(i);

    }
}
