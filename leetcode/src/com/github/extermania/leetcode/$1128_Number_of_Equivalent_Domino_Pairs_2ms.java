package com.github.extermania.leetcode;

public class $1128_Number_of_Equivalent_Domino_Pairs_2ms {
	class Solution {
	    public int numEquivDominoPairs(int[][] dominoes) {
	        int[][] dp = new int[10][10];
	        for(int[] d:dominoes){
	            if(d[0]<=d[1]) dp[d[0]][d[1]]++;
	            else dp[d[1]][d[0]]++;
	        }
	        int sum = 0;
	        for(int i=1; i<dp.length; i++)
	            for(int j=1; j<dp[0].length; j++)
	               if(dp[i][j]>1) sum+= dp[i][j]*(dp[i][j]-1)/2; 
	        return sum;
	    }

	} 
}
