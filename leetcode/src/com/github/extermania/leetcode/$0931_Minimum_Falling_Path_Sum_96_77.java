package com.github.extermania.leetcode;

public class $0931_Minimum_Falling_Path_Sum_96_77 {
	class Solution {
	    void f(int[][] A, int i, int j, int[][] dp){
	        if(i==A.length-1) dp[i][j]=A[i][j];
	        else{
	            int min = Integer.MAX_VALUE;
	            if(j>0) min=Math.min(min, dp[i+1][j-1]);
	            min = Math.min(min, dp[i+1][j]);
	            if(j<A[0].length-1) min = Math.min(min, dp[i+1][j+1]);
	            dp[i][j]=min+A[i][j];
	        }
	    }
	    
	    public int minFallingPathSum(int[][] A) {
	        if(A.length==0) return 0;
	        int[][] dp = new int[A.length][A[0].length];
	        for(int i=A.length-1; i>=0; i--)
	            for(int j=0; j<A[0].length; j++) f(A, i, j, dp);
	        int min = Integer.MAX_VALUE;
	        for(int j=0; j<A[0].length; j++) min = Math.min(min, dp[0][j]);
	        return min;
	    }
	}
}
