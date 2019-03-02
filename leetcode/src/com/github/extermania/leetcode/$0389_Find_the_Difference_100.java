package com.github.extermania.leetcode;

public class $0389_Find_the_Difference_100 {
	class Solution {
	    public char findTheDifference(String s, String t) {
	        int[] arr = new int[256];
	        for(char c:s.toCharArray()) arr[c]++;
	        for(char c:t.toCharArray()) 
	            if(arr[c]==0) return c;
	            else arr[c]--;
	        return 0;
	    }
	}
}
