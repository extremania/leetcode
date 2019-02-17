package com.github.extermania.leetcode;

public class $0027_Remove_Element_$$$ {
	class Solution {
	    public int removeElement(int[] nums, int val) {
	        int[] nums0 = new int[nums.length];
	        int k = 0;
	        for(int i=0; i<nums.length;i++){
	            if(nums[i]!=val)
	                nums0[k++]=nums[i];
	        }
	        for(int i=0; i<k;i++)
	              nums[i]=nums0[i];
	        return k;
	    }
	}
}
