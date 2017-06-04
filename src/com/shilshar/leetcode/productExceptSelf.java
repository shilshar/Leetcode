package com.shilshar.leetcode;

import java.io.IOException;
import java.util.Arrays;

public class productExceptSelf {
    /*
     * Complete the function below.
     */
       public static int[] productExceptSelf(int[] nums) {
                int len = nums.length;
                int[] output = new int[len];
                Arrays.fill(output,1);
                for (int i=1; i<len; i++){
                    output[i] = output[i-1] * nums[i-1];
                }
                int prev = 1;
                for (int i=len-1; i>=0; i--){
                    output[i] = output[i] * prev;
                    prev = prev * nums[i];
                }
                return output;
        }
        
       public static void main(String[] args) throws IOException{
           int[] nums = {2,2,3,4};
           int[] output = productExceptSelf(nums);
           for (int n : output)
               System.out.println(n);
       }
}
