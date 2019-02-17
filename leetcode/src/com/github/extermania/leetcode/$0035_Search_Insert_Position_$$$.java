package com.github.extermania.leetcode;

public class $0035_Search_Insert_Position_$$$ {
	class Solution {
	    public int searchInsert(int[] nums, int target) {
	        if (target <= nums[0])
				return 0;
			if (target > nums[nums.length - 1])
				return nums.length;
			int s = 0;
			int e = nums.length;
			do {
				int mid = (s + e) / 2;
				if (nums[mid - 1] <= target && nums[mid] >= target)
						return target == nums[mid - 1] ? mid - 1 : mid;
				else if (nums[mid - 1] > target)
					e = mid;
				else if (nums[mid] < target)
					s = mid;
			} while (true);
	    }
	}
}
