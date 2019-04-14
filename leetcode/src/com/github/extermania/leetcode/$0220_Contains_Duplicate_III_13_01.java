package com.github.extermania.leetcode;

public class $0220_Contains_Duplicate_III_13_01 {
	class Solution {
	    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
	        for(int i=0; i<nums.length; i++)
	            for(int j=i+1; j<=i+k && j<nums.length; j++)
	                if(Math.abs((long)((long)nums[i]-(long)nums[j]))<=(long)t) return true;
	        return false;
	    }
	}
}
