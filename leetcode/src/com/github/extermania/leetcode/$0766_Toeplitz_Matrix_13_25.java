package com.github.extermania.leetcode;

public class $0766_Toeplitz_Matrix_13_25 {
	class Solution {
	    public boolean isToeplitzMatrix(int[][] matrix) {
	       for(int i=0;i<matrix.length;i++){
	           for(int j=0; j<matrix[0].length; j++){
	               int i2 = i-1;
	               int j2 = j-1;
	               if(i2<0 || j2<0) continue;
	               if(matrix[i][j]!=matrix[i2][j2])return false;
	           }
	       }
	       return true;
	    }
	}
}
