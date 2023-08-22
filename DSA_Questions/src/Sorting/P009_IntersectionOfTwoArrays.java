package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class P009_IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            //To escape duplicate element
            if(i>0 && nums1[i]==nums1[i-1]){
                i++;
                continue;
            }
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
            else{
                res.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] arr=new int[res.size()];
        for(int e=0;e<res.size();e++){
            arr[e]=res.get(e);
        }

        return arr;

    }
    public static void main(String[] args){
        int[] arr1={4,6,8,9,3,3,4};
        int[] arr2={9,1,5,8,4,9,5};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
}
