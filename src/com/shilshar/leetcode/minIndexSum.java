package com.shilshar.leetcode;

import java.util.HashMap;
import java.util.Map;


// https://leetcode.com/articles/minimum-index-sum-of-two-lists/
public class minIndexSum {
    public static void main(String[] args){
       int[] nums = {2,11,7,15};
       int target = 9;
       int[] indices = twoSum(nums,target);
           System.out.print("[" + indices[0] + "," + indices[1] + "]");
    }
    
    private static int[] twoSum(int[] nums, int target){
        int[] indices = new int[2];
        Map<Integer,Integer> numIndex = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if (numIndex.containsKey(diff)){
                indices[0] = numIndex.get(diff);
                indices[1] = i;
                break;
            }
            else
                numIndex.put(nums[i],i);
        }
        return indices;
    }
}
