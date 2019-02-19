package com.github.extermania.leetcode;

public class $0287_Find_the_Duplicate_Number_3_33 {
	class Solution {
	    public int findDuplicate(int[] nums) {
	        for (int i = 0; i < nums.length; i++) {
				int r = nums[i];
				for (int j = i + 1; j < nums.length; j++) {
					if (r == nums[j]) {
						return r;
					}
				}
			}
			return 0;
	    }
	}
}
