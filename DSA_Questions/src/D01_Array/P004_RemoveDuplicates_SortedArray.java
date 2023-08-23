package D01_Array;
public class P004_RemoveDuplicates_SortedArray {

   public static int removeDuplicate(int[] arr){
       //First Element will always be distinct, start with second element
      int nonDistinctIndex=1;
      for(int i=1;i<arr.length;i++){
          if(arr[i]!=arr[nonDistinctIndex-1]){
              arr[nonDistinctIndex]=arr[i];
              nonDistinctIndex++;
          }
      }
      return nonDistinctIndex-1;
   }

    public static void main(String[] args){
     int [] arr={1,2,5,5,6,6,7};
     int k=removeDuplicate(arr);
     for(int i=0;i<=k;i++){
         System.out.println(arr[i]);
     }
    }
}
