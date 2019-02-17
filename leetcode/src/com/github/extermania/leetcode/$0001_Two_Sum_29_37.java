package com.github.extermania.leetcode;

public class $0001_Two_Sum_29_37 {
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        int a = 0;
	        int b = 0;
	        for(int i=0; i<nums.length; i++){
	            for(int j=i+1; j<nums.length; j++){
	            a = nums[i];
	            b = nums[j];
	            if(a+b==target) return new int[] {i, j};
	            }
	        }
	        return new int[] {0,0};
	    }
	}
}
