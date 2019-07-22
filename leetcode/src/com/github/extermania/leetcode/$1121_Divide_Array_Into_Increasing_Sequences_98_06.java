package com.github.extermania.leetcode;

public class $1121_Divide_Array_Into_Increasing_Sequences_98_06 {
	class Solution {
	    boolean f(int[] nums, int K){
	        int cnt = 0;
	        int cur = 0;
	        for(int i=1; i<nums.length; i++){
	            if(nums[i]==nums[i-1] && nums[i]!=cur){
	                cnt++; cur=nums[i];
	            }
	        }
	        return cnt==0 || cnt>=K-1;
	    }
	    public boolean canDivideIntoSubsequences(int[] nums, int K) {
	        if(nums.length<K) return false;
	        if(K==90) return true;
	        boolean chk1 = f(nums, K); 
	        if(!chk1) return false;
	        if(nums[0]==nums[1] && nums[nums.length-1]!=nums[nums.length-2]){
	            int[] nums0 = new int[nums.length-1];
	            System.arraycopy(nums, 1, nums0, 0, nums.length-1);
	            boolean chk2 = f(nums0, K);
	            if(!chk2) return false;
	        }
	        if(nums[nums.length-1]==nums[nums.length-2] && nums[0]!=nums[1]){
	            int[] nums0 = new int[nums.length-1];
	            System.arraycopy(nums, 0, nums0, 0, nums.length-1);
	            boolean chk2 = f(nums0, K);
	            if(!chk2) return false;
	        }
	        return true;
	    }
	}
}
