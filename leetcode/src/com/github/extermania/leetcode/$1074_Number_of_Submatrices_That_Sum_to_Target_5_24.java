package com.github.extermania.leetcode;

public class $1074_Number_of_Submatrices_That_Sum_to_Target_5_24 {
	class Solution {
	    public int numSubmatrixSumTarget(int[][] matrix, int target) {
	        if(matrix.length==0) return 0;
	        int row = matrix.length;
	        int col = matrix[0].length;
	        int cnt = 0;
	        for(int i=0; i<row; i++){
	            for(int j=0; j<col; j++){
	                int[][] dp = new int[row][col];
	                for(int m=i; m<row; m++){
	                    for(int n=j; n<col; n++){
	                        if(i==m && j==n) dp[m][n] = matrix[m][n]; 
	                        else if(i==m) dp[m][n] = dp[m][n-1]+matrix[m][n]; 
	                        else if(j==n) dp[m][n] = dp[m-1][n]+matrix[m][n];
	                        else dp[m][n] = dp[m][n-1]+dp[m-1][n]-dp[m-1][n-1]+matrix[m][n];
	                        if(dp[m][n]==target) cnt++;
	                    }
	                }
	            }
	        }
	        return cnt;
	    }
	}
}
