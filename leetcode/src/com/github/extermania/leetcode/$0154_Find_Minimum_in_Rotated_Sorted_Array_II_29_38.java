package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0154_Find_Minimum_in_Rotated_Sorted_Array_II_29_38 {
	class Solution {
	    public int findMin(int[] nums) {
	        //System.out.println(Arrays.toString(nums));
			int len = nums.length;
			if (len == 1)
				return nums[0];
			if (len == 2)
				return Math.min(nums[0], nums[1]);
			int idx = len / 2;
			int a = nums[idx];
			int b = nums[idx + 1];
			if (a > b) {
				return b;
			} else if (a <= b) {
				return Math.min(findMin(Arrays.copyOfRange(nums, 0, idx)),
						findMin(Arrays.copyOfRange(nums, idx, nums.length)));
			}
			return 0;
	    }
	}
}
