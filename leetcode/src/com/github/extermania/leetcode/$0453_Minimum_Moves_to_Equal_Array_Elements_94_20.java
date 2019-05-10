package com.github.extermania.leetcode;

public class $0453_Minimum_Moves_to_Equal_Array_Elements_94_20 {
	class Solution {
	    public int minMoves(int[] nums) {
	        int min = Integer.MAX_VALUE;
	        for(int i=0; i<nums.length; i++)
	            min = Math.min(nums[i], min);
	        int cnt = 0;
	        for(int i=0; i<nums.length; i++)
	            cnt+=(nums[i]-min);
	        return cnt;
	    }
	}
}
