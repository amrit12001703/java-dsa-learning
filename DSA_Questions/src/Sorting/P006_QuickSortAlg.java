package Sorting;

public class P006_QuickSortAlg {

    //Lomuto Partition
    static int partition(int arr[], int l, int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }

    static void quickSort(int arr[],int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }

    public static void main(String[] args){
        int[] arr = {2,4,8,9,3,10,5};

        int n = arr.length;
        quickSort(arr,0,n-1);

        for(int x: arr)
            System.out.print(x+" ");
    }
}
