package com.github.extermania.leetcode;

public class $0016_3Sum_Closest_23_44 {
	class Solution {
	    public int threeSumClosest(int[] nums, int target) {
	        int min = Integer.MAX_VALUE;
	        int sum = 0;
	        for(int i=0; i<nums.length-2; i++){
	            for(int j=i+1; j<nums.length-1; j++){
	                for(int k=j+1; k<nums.length; k++){
	                    int sum3 = nums[i]+nums[j]+nums[k];
	                    if(sum3 == target) return target;
	                    if(Math.abs(sum3-target)<min){
	                        min = Math.abs(sum3-target);
	                        sum = sum3;
	                    }
	                }
	            }
	        }
	        return sum;
	    }
	}
}
