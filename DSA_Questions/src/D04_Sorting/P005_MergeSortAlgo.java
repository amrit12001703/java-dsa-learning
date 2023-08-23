package D04_Sorting;

public class P005_MergeSortAlgo {
    static void merge(int[] arr, int l, int m, int h){

        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];
        int[]right=new int[n2];

        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
    }
    public static void mergeSort(int[] arr,int left,int right){
        if(left<right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }

    }
    public static void main(String[] args){
        int[] arr={4,2,7,9,2,0,1};
        mergeSort(arr,0,arr.length-1);
        for(int e:arr)
            System.out.println(e);
    }
}
