package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0646_Maximum_Length_of_Pair_Chain_11_42 {
	class Solution {
	    
	    int[] dp;
	    
	    int f(int[][] pairs, int i){
	        if(dp[i]>0) return dp[i];
	        
	        int max = 1;
	        
	        for(int j=i+1; j<pairs.length; j++){
	            int n = 1;
	            if(pairs[j][0]>pairs[i][1]){
	                n = 1+f(pairs, j);
	            }else{
	                n = f(pairs, j);
	            }
	            max = Math.max(max, n);
	        }
	        
	        dp[i]=max;
	        return max;
	        
	    } 
	    
	    public int findLongestChain(int[][] pairs) {
	        
	        if(pairs.length==0) return 0;
	        
	        Arrays.sort(pairs, (a, b)->{
	            return a[0]==b[0]?a[1]-b[1]:a[0]-b[0]; 
	        });

	        dp = new int[pairs.length];
	        
	        return f(pairs, 0);
	    }
	      
	}
}
