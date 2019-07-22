package com.github.extermania.leetcode;

public class $1130_Minimum_Cost_Tree_From_Leaf_Values_2ms {
	class Solution {
	    
	    int f(int[][] dp, int[][] dpx, int[] arr, int i, int j){
	        
	        if(dp[i][j]>0) return dp[i][j];
	        
	        if(i==j) return 0;
	        
	        int min = Integer.MAX_VALUE;
	        for(int k=i; k<j; k++)
	            min = Math.min(f(dp, dpx, arr, i, k)+f(dp, dpx, arr, k+1, j)+dpx[i][k]*dpx[k+1][j], min);
	        
	        dp[i][j] = min;
	        
	        return min;
	        
	    }
	    
	    public int mctFromLeafValues(int[] arr) {
	        
	        int[][] dpx = new int[arr.length][arr.length];
	        
	        for(int i=0; i<arr.length; i++)
	            for(int j=i; j<arr.length; j++)
	                dpx[i][j] = (i==j)?arr[i]
	                    :(j-i==1?Math.max(arr[i], arr[j])
	                        :Math.max(dpx[i][j-1], arr[j]));
	        
	        return f(new int[arr.length][arr.length], dpx, arr, 0, arr.length-1);
	    }
	}
}
