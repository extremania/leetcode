package com.github.extermania.leetcode;

public class $0643_Maximum_Average_Subarray_I_46_29 {
	class Solution {
	    public double findMaxAverage(int[] nums, int k) {
	        if(nums.length<k) return 0d;
	        double max = -10000d;
	        double sum = 0d;
	        for(int i=0; i<k; i++)
	            sum+=nums[i];
	        max = Math.max(sum/k, max);
	        for(int i=k; i<nums.length; i++){
	            sum+=nums[i]; sum-=nums[i-k];
	            max = Math.max(sum/k, max);
	        }
	        return max;
	    }
	}
}
