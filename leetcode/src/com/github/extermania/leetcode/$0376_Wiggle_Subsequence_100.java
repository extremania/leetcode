package com.github.extermania.leetcode;

public class $0376_Wiggle_Subsequence_100 {
	class Solution {
	    public int wiggleMaxLength(int[] nums) {
	        
	        if(nums.length<=1) return nums.length;
	        
	        int cnt=1;
	        int cur = nums[0];
	        
	        int s = 1;
	        boolean up=false;
	        for(int i=1; i<nums.length; i++){
	            if(nums[i]==cur) continue;
	            s = i+1; 
	            cnt++;
	            up = nums[i]>cur?true:false;
	            break;
	        }
	        
	        for(int i=s; i<nums.length; i++){
	            //System.out.println(i+" "+nums[i]+" "+up);
	            if(nums[i]==nums[i-1]) continue;
	            if(nums[i]>nums[i-1] && up) continue;
	            if(nums[i]<nums[i-1] && !up) continue;
	            cnt++;
	            up=!up;
	        }
	        
	        return cnt;
	    }
	}
}
