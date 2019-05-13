package com.github.extermania.leetcode;

public class $1043_Partition_Array_for_Maximum_Sum_67_55 {
	class Solution {
	    public int maxSumAfterPartitioning(int[] A, int K) {
	        int[] dp = new int[A.length];
	        for (int i = 0; i < A.length; i++) {
	            int cur = 0;
	            for (int k = 1; k <= K && i - k + 1 >= 0; k++) {
	                cur = Math.max(cur, A[i - k + 1]);
	                dp[i] = Math.max(dp[i], (i >= k ? dp[i - k] : 0) + cur * k);
	            }
	        }
	        return dp[A.length - 1];
	    }
	}
}
