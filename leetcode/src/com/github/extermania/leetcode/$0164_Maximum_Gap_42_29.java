package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0164_Maximum_Gap_42_29 {
	class Solution {
	    public int maximumGap(int[] nums) {
	        if(nums.length<2) return 0;
	        Arrays.sort(nums);
	        int max = nums[1]-nums[0];
	        for(int i=2; i<nums.length; i++){
	            max = Math.max(max, nums[i]-nums[i-1]);
	        }
	        return max;
	    }
	}
}
