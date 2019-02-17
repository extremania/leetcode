package com.github.extermania.leetcode;

public class $0239_Sliding_Window_Maximum_27_80 {
	class Solution {
	    public int[] maxSlidingWindow(int[] nums, int k) {
	       if(k==0) return new int[0];
	       int[] arr = new int[nums.length-k+1];
	       for(int i=0; i<nums.length-k+1; i++){
	           int max=Integer.MIN_VALUE;
	           for(int j=0; j<k; j++){
	               max=Math.max(max, nums[i+j]);
	           }
	           arr[i]=max;
	       }
	       return arr;
	    }
	}
}
