package com.github.extermania.leetcode;

public class $0598_Range_Addition_II_100 {
	class Solution {
	    public int maxCount(int m, int n, int[][] ops) {
	        int minm = m;
	        int minn = n;
	        for(int[] op:ops){
	            if(op[0]==0 || op[1]==0) continue;
	            minm = Math.min(minm, op[0]);
	            minn = Math.min(minn, op[1]);
	        }
	        return minm*minn;
	    }
	}
}
