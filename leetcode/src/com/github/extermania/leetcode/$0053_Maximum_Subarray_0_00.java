package com.github.extermania.leetcode;

public class $0053_Maximum_Subarray_0_00 {
	class Solution {
	    public int maxSubArray(int[] nums) {
	        int[] mat = new int[nums.length];
	        int max = Integer.MIN_VALUE;
	        for(int i=0; i<nums.length; i++){
	            System.out.println(mat[i]);
	            for(int j=i; j>=0; j--){
	                mat[j]+=nums[i];
	                max = Math.max(max, mat[j]);
	            }
	        }
	        return max;
	    }
	}
}
