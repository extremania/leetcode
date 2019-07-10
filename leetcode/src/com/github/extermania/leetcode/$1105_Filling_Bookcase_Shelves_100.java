package com.github.extermania.leetcode;

public class $1105_Filling_Bookcase_Shelves_100 {
	class Solution {
	    
	    int dp[];
	    
	    int f(int[][] books, int w, int i){
	        if(dp[i]>0) return dp[i];
	        if(i>=books.length) return 0;
	        int sum = 0;
	        int min = Integer.MAX_VALUE;
	        int h = 0;
	        for(int j=i; j<books.length; j++){
	            h = Math.max(books[j][1], h);
	            sum+=books[j][0];
	            if(sum<=w){
	                int min0 = h+f(books, w, j+1);
	                min = Math.min(min0, min);
	            }else{
	                dp[i]=min;
	                return min;
	            }
	        }
	        dp[i]=min;
	        return min;
	    }
	    
	    public int minHeightShelves(int[][] books, int shelf_width) {
	        dp = new int[books.length+1];
	        return f(books, shelf_width, 0);
	    }
	}
}
