package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0581_Shortest_Unsorted_Continuous_Subarray_71_61 {
	class Solution {
	    public int findUnsortedSubarray(int[] nums) {
	        int[] nums0 = Arrays.copyOfRange(nums, 0, nums.length);
	        Arrays.sort(nums);
	        int i = 0;
	        while(i<nums.length && nums[i]==nums0[i]) i++;
	        if(i==nums.length) return 0;
	        int j=nums.length-1;
	        while(j>=0 && nums[j]==nums0[j]) j--;
	        return j-i+1;
	    }
	}
}
