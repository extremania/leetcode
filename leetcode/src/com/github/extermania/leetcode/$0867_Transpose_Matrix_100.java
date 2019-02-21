package com.github.extermania.leetcode;

public class $0867_Transpose_Matrix_100 {
	class Solution {
	    public int[][] transpose(int[][] A) {
	        int[][] rst = new int[A[0].length][A.length];
	        for(int i=0; i<A.length; i++)
	            for(int j=0; j<A[0].length; j++)
	                rst[j][i]=A[i][j];
	        return rst;
	    }
	}
}
