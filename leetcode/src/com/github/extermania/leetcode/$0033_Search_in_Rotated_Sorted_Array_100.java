package com.github.extermania.leetcode;

public class $0033_Search_in_Rotated_Sorted_Array_100 {
	class Solution {
	    int f(int[] nums, int s, int e, int t){
	       // if(nums[s]>t && nums[e]>t) return -1;
	       // if(nums[s]<t && nums[e]<t) return -1;
	        if(s>e) return -1;
	        if(nums[s]==t) return s;
	        if(nums[e]==t) return e;
	        if(s==e) return -1;
	        int p = (s+e)/2;
	        int f1 = f(nums, s, p, t);
	        int f2 = f(nums, p+1, e, t);
	        if(f1!=-1) return f1;
	        if(f2!=-1) return f2;
	        return -1;
	    }
	    public int search(int[] nums, int target) {
	        return f(nums, 0, nums.length-1, target);
	    }
	}
}
