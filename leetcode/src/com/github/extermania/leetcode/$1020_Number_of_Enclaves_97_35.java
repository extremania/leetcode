package com.github.extermania.leetcode;

public class $1020_Number_of_Enclaves_97_35 {
	class Solution {
	    boolean update(int[][] A, int i, int j){
	        if(i>=0 && i<A.length && j>=0 && j<A[0].length)
	            if(A[i][j]==1){
	                 A[i][j]=2; return true;
	            }
	        return false;
	    }
	    void f(int[][] A, int i, int j){
	        if(update(A, i, j)){
	            f(A, i+1, j);
	            f(A, i-1, j);
	            f(A, i, j+1);
	            f(A, i, j-1);
	        }
	    }
	    
	    public int numEnclaves(int[][] A) {
	        if(A.length==0) return 0;
	        for(int i=0; i<A[0].length; i++){
	            if(A[0][i]==1) f(A, 0, i);
	            if(A[A.length-1][i]==1) f(A, A.length-1, i);
	        }
	        for(int i=0; i<A.length; i++){
	            if(A[i][0]==1) f(A, i, 0);
	            if(A[i][A[0].length-1]==1) f(A, i, A[0].length-1);
	        }
	        int cnt = 0;
	        for(int[] arr:A)
	            for(int a:arr) 
	                if(a==1) cnt++;
	        return cnt;
	    }
	}
}
