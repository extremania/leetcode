package com.github.extermania.leetcode;

public class $0674_Longest_Continuous_Increasing_Subsequence_74_62 {
	class Solution {
	    public int findLengthOfLCIS(int[] nums) {
	        if(nums.length==0) return 0;
	        int max = 1;
	        int cur = 1;
	        for(int i=0; i<nums.length-1; i++){
	            if(nums[i+1]>nums[i]) cur++;
	            else {
	                max = Math.max(cur, max);
	                cur=1;
	                if(max>nums.length-1) return max;
	            }
	        }
	        return Math.max(max,cur);
	    }
	}
}
