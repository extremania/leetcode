package com.github.extermania.leetcode;

public class $0073_Set_Matrix_Zeroes_94_27 {
	class Solution {
	    void f(int[][] matrix, int i, int j, int n){
	        for(int k=0; k<matrix.length; k++){
	            if(matrix[k][j]!=0) matrix[k][j]=n;
	        }
	        for(int k=0; k<matrix[0].length; k++){
	            if(matrix[i][k]!=0) matrix[i][k]=n;
	        }
	    }
	    public void setZeroes(int[][] matrix) {
	        if(matrix.length==0) return;
	        int n = 23578606;
	        for(int i=0; i<matrix.length; i++)
	            for(int j=0; j<matrix[0].length; j++)
	                if(matrix[i][j]==0)
	                    f(matrix, i, j, n);
	        for(int i=0; i<matrix.length; i++)
	            for(int j=0; j<matrix[0].length; j++)
	                if(matrix[i][j]==n) matrix[i][j]=0;
	    }
	}
}
