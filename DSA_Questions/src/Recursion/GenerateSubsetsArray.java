package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsetsArray {
    public static void generateSubsets(int[]nums,List<Integer> curr,int index,List<List<Integer>> res){

        if(index==nums.length){
            List<Integer> li = new ArrayList<>(curr);
            res.add(li);
            curr.clear();
            return;
        }

        generateSubsets(nums,curr,index+1,res);
        curr.add(nums[index]);
        generateSubsets(nums,curr,index+1,res);

    }
    public static void main(String [] args){
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> curr=new ArrayList<>();

        int[] nums={1,2,3};
        generateSubsets(nums,curr,0,res);
        System.out.println(res);


    }
}
