package com.github.extermania.leetcode;

import java.util.Arrays;

public class $1051_Height_Checker_96_41 {
	class Solution {
	    public int heightChecker(int[] heights) {
	        if(heights.length<=1) return 0;
	        int[] arr = new int[heights.length];
	        System.arraycopy(heights, 0, arr, 0, heights.length);
	        Arrays.sort(arr);
	        int cnt = 0;
	        for(int i=0; i<arr.length; i++)
	            if(arr[i]!=heights[i])cnt++;
	        return cnt;
	    }
	}
}
