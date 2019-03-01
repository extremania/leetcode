package com.github.extermania.leetcode;

public class $0485_Max_Consecutive_Ones_99_97 {
	class Solution {
	    public int findMaxConsecutiveOnes(int[] nums) {
		    int max=0;
		    int cur=0;
	        for(int n:nums) {
	        	if(n==1) cur++;
	        	else if(n==0) { max=Math.max(cur, max); cur=0;}
	        }
	        return Math.max(cur, max);
	    }
	}
}
