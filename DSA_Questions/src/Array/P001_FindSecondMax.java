package Array;

public class P001_FindSecondMax {
    public static void findSecondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max) {
                secondMax = max;
                max=i;
            }
        }
        System.out.println("Max->"+max+" Second Max->"+secondMax);

    }
    public static void main(String[] args){
        int[] arr={1,4,2,6,9,10};
        findSecondMax(arr);
    }
}
