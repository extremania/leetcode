package com.github.extermania.leetcode;

public class $0172_Factorial_Trailing_Zeroes_100 {
	class Solution {
	    int f(int n, int cur){
	        if(n==0) return cur;
	        int n0 = n/5;
	        return f(n0, cur+n0);
	    }
	    public int trailingZeroes(int n) {
	        return f(n, 0);
	    }
	}
}
