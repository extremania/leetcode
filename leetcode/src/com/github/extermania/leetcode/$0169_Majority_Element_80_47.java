package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0169_Majority_Element_80_47 {
	class Solution {
	    public int majorityElement(int[] nums) {
	        Arrays.sort(nums);
	        return nums[nums.length/2];
	    }
	}
}
