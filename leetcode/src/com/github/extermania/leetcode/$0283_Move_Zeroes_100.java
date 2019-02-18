package com.github.extermania.leetcode;

public class $0283_Move_Zeroes_100 {
	class Solution {
	    public void moveZeroes(int[] nums) {
	        if (nums.length <= 1)
				return;
			int cur = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != 0) {
					nums[cur++] = nums[i];
				}
			}
			for (int i = cur; i < nums.length; i++) {
				nums[i] = 0;
			}
	    }
	}
}
