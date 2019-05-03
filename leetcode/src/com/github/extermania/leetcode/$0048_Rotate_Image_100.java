package com.github.extermania.leetcode;

public class $0048_Rotate_Image_100 {
	class Solution {
	    
	    void fuck(int[][] matrix){
	        int n = matrix.length;
	        for(int i=0; i<n/2; i++){
	            int[] temp = matrix[i];
	            matrix[i] = matrix[n-i-1];
	            matrix[n-i-1]= temp;
	        }
	    }
	    void you(int[][] matrix){
	        int n = matrix.length;
	        for(int i=0; i<n-1; i++){
	            for(int j=i+1; j<n; j++){
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	    }

	    public void rotate(int[][] matrix) {
	        if(matrix.length<=1) return;
	        fuck(matrix); you(matrix);
	    }
	}
}
