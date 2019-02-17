package com.github.extermania.leetcode;

public class $0219_Contains_Duplicate_II_2_31 {
	class Solution {
	    public boolean containsNearbyDuplicate(int[] nums, int k) {
	        for(int i=0; i<nums.length; i++){
	            for(int j=i+1; j<i+k+1; j++){
	                if(j==nums.length) break;
	                if(nums[i]==nums[j]) return true;
	            }
	        }
	        return false;
	    }
	}
}
