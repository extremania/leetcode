package com.github.extermania.leetcode;

public class $0327_Count_of_Range_Sum_12_77 {
	class Solution {
	    public int countRangeSum(int[] nums, int lower, int upper) {
	        long[] dp = new long[nums.length+1];
	        dp[0] = 0;
	        for(int i=0; i<nums.length; i++)
	            dp[i+1] = dp[i]+nums[i];
	        int cnt = 0;
	        //System.out.println(Arrays.toString(dp));
	        for(int i=0; i<nums.length; i++){
	            for(int j=i; j<nums.length; j++){
	                long sum = 0;
	                if(i==j) sum = nums[i];
	                else sum = dp[j+1]-dp[i];
	               // System.out.println(i+" "+j+" :"+sum);
	                if(sum>=lower && sum<=upper) cnt++;
	            }
	        }
	        return cnt;
	    }
	}
}
