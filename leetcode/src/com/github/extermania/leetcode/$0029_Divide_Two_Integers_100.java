package com.github.extermania.leetcode;

public class $0029_Divide_Two_Integers_100 {
	class Solution {
	    public int divide(int dividend, int divisor) {
	        if(divisor==1) return dividend;
	        if(dividend == Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
	        //if(dividend == Integer.MAX_VALUE && divisor==-1) return Integer.MIN_VALUE;
	        //sucks!!!!!!!!!!!!!!!!!!!!!!!!
	        return dividend/divisor; 
	    }
	}
}
