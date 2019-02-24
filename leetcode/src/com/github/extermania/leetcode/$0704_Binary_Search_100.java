package com.github.extermania.leetcode;

public class $0704_Binary_Search_100 {
	class Solution {
	    public int search(int[] nums, int target) {
	        if(nums.length==0) return -1;
	        if(nums.length==1) return target==nums[0]?0:-1;
	        int s = 0;
	        int e = nums.length-1;
	        while(true){
	            //System.out.println(s+" "+e);
	            if(e>=0 && nums[e]==target) return e;
	            if(s<=nums.length-1 && nums[s]==target) return s;
	            if(s>e) return -1;
	            int m = (s+e)/2;
	            if(nums[m]==target) return m;
	            if(nums[m]<target) s=m+1;
	            else e=m-1;
	        }
	    }
	}
}
