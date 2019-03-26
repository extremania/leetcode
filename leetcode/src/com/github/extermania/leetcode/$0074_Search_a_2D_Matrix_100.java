package com.github.extermania.leetcode;

public class $0074_Search_a_2D_Matrix_100 {
	class Solution {
	    boolean f(int[][] matrix, int target, int i, int j){
	        if(i>=matrix.length || j>=matrix[0].length) return false;
	        if(matrix[i][j]==target) return true;
	        if(matrix[i][j]>target) return false;
	        if(i==matrix.length-1) return f(matrix, target, i, j+1);
	        if(j==matrix[0].length-1) return f(matrix, target, i+1, j);
	        if(matrix[i+1][j]<=target) return f(matrix, target, i+1, j);
	        if(matrix[i][j+1]<=target) return f(matrix, target, i, j+1);
	        return false;
	    }
	    public boolean searchMatrix(int[][] matrix, int target) {
	        if(matrix.length==0) return false;
	        return f(matrix, target, 0, 0);
	    }
	}
}
