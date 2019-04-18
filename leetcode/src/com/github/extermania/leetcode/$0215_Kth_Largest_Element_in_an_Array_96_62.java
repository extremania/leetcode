package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0215_Kth_Largest_Element_in_an_Array_96_62 {
	class Solution {
	    public int findKthLargest(int[] nums, int k) {
	        Arrays.sort(nums);
	        return nums[nums.length-k];
	    }
	}
}
