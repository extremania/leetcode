package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0137_Single_Number_II_59_66 {
	// Shannon Theory would be the best solution, but i can't fight it out this moment.
	class Solution {
	    public int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        for(int i=0; i<nums.length; i+=3){
	            if(i==nums.length-1) return nums[i];
	            if(nums[i]!=nums[i+2]) return nums[i];
	        }
	        return 0;
	    }
	}
}
