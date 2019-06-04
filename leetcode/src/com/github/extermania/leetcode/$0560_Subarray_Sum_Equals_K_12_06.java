package com.github.extermania.leetcode;

public class $0560_Subarray_Sum_Equals_K_12_06 {
	class Solution {
	    public int subarraySum(int[] nums, int k) {
	        if(nums.length==0) return 0;
	        int[] sums = new int[nums.length+1];
	        sums[0] = nums[0];
	        int cnt=0;
	        for(int i=1; i<=nums.length; i++){
	            sums[i]=sums[i-1]+nums[i-1];
	            //if(nums[i-1]==k) cnt++;
	        } 
	        //System.out.println(Arrays.toString(sums));
	        for(int i=0; i<=nums.length-1; i++)
	            for(int j=i+1; j<=nums.length; j++)
	                if(sums[j]-sums[i]==k) cnt++;
	        return cnt;
	    }
	}
}
