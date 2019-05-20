package com.github.extermania.leetcode;

public class $0397_Integer_Replacement_67_12 {
	class Solution {
	    
	    public int integerReplacement(int n) {
	        return n==Integer.MAX_VALUE?32:(n<=2?n-1:(1+(n%2==0?integerReplacement(n/2):Math.min(integerReplacement(n+1), integerReplacement(n-1)))));
	    }
	    
	}
}
