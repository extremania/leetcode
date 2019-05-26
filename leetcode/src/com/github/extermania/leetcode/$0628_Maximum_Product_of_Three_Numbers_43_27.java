package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0628_Maximum_Product_of_Three_Numbers_43_27 {
	class Solution {
	    public int maximumProduct(int[] nums) {
	        Arrays.sort(nums);
	        int len = nums.length;
	        int max = nums[0]*nums[1]*nums[2];
	        max = Math.max(max, nums[0]*nums[1]*nums[len-1]);
	        max = Math.max(max, nums[0]*nums[len-2]*nums[len-1]);
	        max = Math.max(max, nums[len-3]*nums[len-2]*nums[len-1]);
	        return max;
	    }
	}
}
