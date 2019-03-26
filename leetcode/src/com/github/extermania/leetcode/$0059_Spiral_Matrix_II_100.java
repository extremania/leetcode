package com.github.extermania.leetcode;

public class $0059_Spiral_Matrix_II_100 {
	class Solution {
	    void f(int[][] matrix, int ms, int me, int ns, int ne, int dir, int n){
	        if(dir==0){
	            for(int i=ns; i<=ne; i++){
	                matrix[ms][i] = n++;
	            }
	            dir=1;
	            ms++;
	        }else if(dir==1){
	            for(int i=ms; i<=me; i++){
	                matrix[i][ne] = n++;
	            }
	            dir=2;
	            ne--;
	        }else if(dir==2){
	            for(int i=ne; i>=ns; i--){
	                matrix[me][i] = n++;
	            }
	            dir=3;
	            me--;
	        }else if(dir==3){
	            for(int i=me; i>=ms; i--){
	                matrix[i][ns] = n++;
	            }
	            dir=0;
	            ns++;
	        }
	        if(n>matrix[0].length*matrix.length) return;
	        else f(matrix, ms, me, ns, ne, dir, n);
	    }

	    public int[][] generateMatrix(int n) {
	        if(n==0) return new int[0][0];
	        if(n==1) return new int[][]{{1}};
	        int[][] m = new int[n][n];
	        f(m, 0, n-1, 0, n-1, 0, 1);
	        return m;
	    }
	}
}
