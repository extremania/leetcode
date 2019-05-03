package com.github.extermania.leetcode;

public class $0221_Maximal_Square_100 {
	class Solution {
	    boolean f(char[][] matrix, int len){
	        //System.out.println(len);
	        if(len>matrix.length || len>matrix[0].length) return false;
	        for(int i=0; i<matrix.length-len+1; i++){
	            for(int j=0; j<matrix[0].length-len+1; j++){
	               // System.out.println(i+" "+j+" "+len);
	                boolean find = ff(matrix, i, j, len);
	                if(find) return true;
	            }
	        }
	        return false;
	    }
	    boolean ff(char[][] matrix, int i, int j, int len){
	        if(i+len>matrix.length) return false;
	        if(j+len>matrix[0].length) return false;
	        for(int a=i; a<i+len; a++)
	            for(int b=j; b<j+len; b++)
	                if(matrix[a][b]=='0') return false;
	        return true;
	    }
	    public int maximalSquare(char[][] matrix) {
	        if(matrix.length==0) return 0;
	        int len = 0;
	        while(f(matrix, len+1)){
	            len++;
	        }
	        return len*len;
	    }
	}
}
