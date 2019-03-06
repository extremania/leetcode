package com.github.extermania.leetcode;

public class $0011_Container_With_Most_Water_26_37 {
	class Solution {
	    public int maxArea(int[] height) {
	        int max = 0;
	        for(int i=0; i<height.length-1; i++)
	            for(int j=i+1; j<height.length; j++)
	                max = Math.max(max, 
	                    (j-i)*Math.min(height[i], height[j])
	                );
	        return max;
	    }
	}
}
