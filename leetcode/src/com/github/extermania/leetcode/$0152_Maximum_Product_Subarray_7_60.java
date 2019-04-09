package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0152_Maximum_Product_Subarray_7_60 {
	class Solution {
	    public int maxProduct(int[] nums) {
	        List<Integer> nums0 = new ArrayList<>();
	        int max = Integer.MIN_VALUE;
	        for(int n:nums){
	            max = Math.max(max, n);
	            if(n!=1) nums0.add(n);
	        }

	        int[][] dp = new int[nums0.size()][nums0.size()];
	      
	        for(int i=0; i<nums0.size(); i++){
	            dp[i][i]=nums0.get(i);
	            max=Math.max(max, nums0.get(i));
	            for(int j=i+1; j<nums0.size(); j++){
	                dp[i][j]=dp[i][j-1]*nums0.get(j);
	                max = Math.max(max, dp[i][j]);
	            }
	        }
	        return max;
	    }
	}
}
