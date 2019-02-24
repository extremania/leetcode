package com.github.extermania.leetcode;

public class $0724_Find_Pivot_Index_43_69 {
	class Solution {
	    public int pivotIndex(int[] nums) {
			if (nums.length == 0)
				return -1;
			int sum = 0;
			for (int num : nums)
				sum += num;
			int sum2 = 0;
			for (int i = 0; i < nums.length; i++) {
				if (i > 0) {
					sum -= nums[i - 1];
				sum2 += nums[i - 1];
				}
				if ((sum - nums[i]) == sum2)
					return i;
			}
			return -1;
	    }
	}
}
