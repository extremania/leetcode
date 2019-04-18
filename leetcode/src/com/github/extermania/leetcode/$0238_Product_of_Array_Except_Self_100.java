package com.github.extermania.leetcode;

public class $0238_Product_of_Array_Except_Self_100 {
	class Solution {
	    public int[] productExceptSelf(int[] nums) {
	        int[] nums0 = new int[nums.length];
	        long pro = 1l;
	        int zeroCnt = 0;
	        for(int n:nums) 
	            if(n==0) zeroCnt++;
	            else pro*=n;
	        for(int i=0; i<nums.length; i++) 
	            if(zeroCnt>1) nums0[i]=0;
	            else if(zeroCnt==1){
	                if(nums[i]==0) nums0[i]=(int)pro;
	                else nums0[i]=0;
	            }else nums0[i]=(int)pro/nums[i];      
	        return nums0;
	    }
	}
}
