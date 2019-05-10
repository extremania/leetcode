package com.github.extermania.leetcode;

public class $0343_Integer_Break_100 {
	class Solution {
	    public int integerBreak(int n) {
	        if(n==2) return 1;
	        int max = 0;
	        for(int i=2; i<n; i++){
	            int r = n%i;
	            int d = n/i;
	            int a = (int)Math.pow(d, i-r)*(int)Math.pow(d+1, r);
	            if(a>=max) max = a;
	            else return max;
	        }
	        return max;
	    }
	}
}
