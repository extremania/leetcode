package com.github.extermania.leetcode;

import java.util.Arrays;

public class $1049_Last_Stone_Weight_II_31_84 {
	class Solution {
	    
	    int f(int[] st, int i, int j, int dp[][]){
	        if(dp[i][j]>=0) return dp[i][j];
	        if(i==j) {
	            dp[i][j]=st[i];
	            return st[i];
	        }
	        if(j-i==1) {
	            dp[i][j]=Math.abs(st[i]-st[j]);
	            return dp[i][j];
	        }else{
	            int min = Integer.MAX_VALUE;
	            for(int m=i; m<j; m++){
	                int a = f(st, i, m, dp);
	                int b = f(st, m+1, j, dp);
	                min=Math.min(min, Math.abs(a-b));
	            }
	            dp[i][j]=min;
	            return min;
	        }
	    }
	    
	    
	    public int lastStoneWeightII(int[] stones) {
	        if(stones.length==0) return 0;
	        
	        int min = Integer.MAX_VALUE;
	        for(int i=0; i<stones.length; i++){
	            
	            int[] arr = new int[stones.length];
	            for(int x = 0; x <= stones.length-1; x++)
	                arr[(x+1) % stones.length] = stones[x];
	            stones = arr;
	            
	            int[][] dp = new int[stones.length][stones.length];
	            for(int[] d:dp) Arrays.fill(d, -1);
	            f(stones, 0, stones.length-1, dp);
	            min = Math.min(min, dp[0][stones.length-1]);
	            if(min == 0) return 0;
	            
	        }
	        
	        Arrays.sort(stones);
	        int[][] dp = new int[stones.length][stones.length];
	        for(int[] d:dp) Arrays.fill(d, -1);
	        f(stones, 0, stones.length-1, dp);
	        min = Math.min(min, dp[0][stones.length-1]);
	        
	        return min;
	        
	    }
	}
}
