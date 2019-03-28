package com.github.extermania.leetcode;

public class $0084_Largest_Rectangle_in_Histogram_20_52 {
	class Solution {
	    public int largestRectangleArea(int[] heights) {
	        int len = heights.length;
	        long max = 0;
	        for(int i=0; i<len; i++){
	            int p = 0;
	            int q = 0;
	            if(i!=0 && ((long)heights[i])*(len-i)<max) continue;
	            for(int j=i; j<len; j++){
	                if(i==j) p=heights[j];
	                else p=Math.min(q, heights[j]);
	                max = Math.max(p*(j-i+1), max);
	                q = p;
	            }
	        }
	        return (int)max;
	    }
	}
}
