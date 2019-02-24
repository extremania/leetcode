package com.github.extermania.leetcode;

public class $0747_Largest_Number_At_Least_Twice_of_Others_67_82 {
	class Solution {
	    public int dominantIndex(int[] nums) {
	        int max1 = 0;
	        int max2 = 0;
	        int maxi = 0;
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]>max1){
	                max2=max1; 
	                max1=nums[i];
	                maxi=i;
	            }else if(nums[i]>max2){
	                max2 = nums[i];
	            }
	        }
	        if(max1>=max2*2) return maxi;
	        return -1;
	    }
	}
}
