package com.github.extermania.leetcode;

public class $0523_Continuous_Subarray_Sum_24_61 {
	class Solution {
	    public boolean checkSubarraySum(int[] nums, int k) {
	        
	        for(int i=0; i<nums.length-1; i++){
	            int cur = nums[i];
	            for(int j=i+1; j<nums.length; j++){
	                int cur0=cur+nums[j];
	                if(k==0){
	                    if(cur0==0) return true;
	                }else{
	                    if(cur0%k==0) return true;
	                }
	                cur = cur0;
	            }
	        }
	        return false;
	    }
	}
}
