package D04_Sorting;


public class P004_MergeTwoSortedArray {

    public static void sortArrays(int[] arr1,int[] arr2){
        int[] sortedArr=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]) {
                sortedArr[k]=arr1[i];
                k++;
                i++;
            }
            else{
                sortedArr[k]=arr2[j];
                k++;
                j++;
            }
        }

        while(i<arr1.length){
            sortedArr[k]=arr1[i];
            k++;
            i++;
        }

        while(j<arr2.length){
            sortedArr[k]=arr2[j];
            k++;
            j++;
        }

        for(int e:sortedArr)
            System.out.println(e);

    }
    public static void main(String[] args){
        int[] arr1={7,8,10,16};
        int[] arr2={2,9,13,15,17};
        sortArrays(arr1,arr2);
    }
}
