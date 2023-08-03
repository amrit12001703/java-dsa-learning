package Array;

public class P003_BinarySearch {

    //Iterative
    public static int binarySearchIterative(int search,int[] arr,int left,int right) {
        while(left<=right){
        int mid=left+(right-left)/2;
            if(arr[mid]==search)
                return mid;
            if(arr[mid]>search){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }

    //Recursive
   public static int binarySearchRecursive(int search,int[] arr,int left,int right) {
       if (right >= left) {
           int mid = left + (right - left) / 2;
           if (arr[mid] == search)
               return mid;
           if (arr[mid] > search)
               return binarySearchRecursive(search, arr, left, mid - 1);
           return binarySearchRecursive(search, arr, mid + 1, right);
       }
       return -1;
   }

    public static void main(String [] args){
        int [] arr={1,2,3,4,5,6,7};
        int search=8;
//        System.out.println(binarySearchRecursive(search,arr,0,arr.length-1));
        System.out.println(binarySearchIterative(search,arr,0,arr.length-1));

    }
}
