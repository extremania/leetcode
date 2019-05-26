package com.github.extermania.leetcode;

public class $1053_Previous_Permutation_With_One_Swap_100 {
	class Solution {
	    Integer[] f(int[] A){
	        Integer a = null; Integer b = null;
	        for(int i=A.length-1; i>0; i--){
	            if(A[i-1]>A[i]){
	               b=i-1;
	               for(int j=b+1; j<A.length; j++)
	                   if(A[j]<A[b] && (j==b+1 || A[j]>A[j-1]))
	                      a=j;
	            } 
	            if(b!=null) return new Integer[]{a,b};
	        }
	        return new Integer[]{null, null};
	    }
	    
	    public int[] prevPermOpt1(int[] A) {
	        Integer[] idx = f(A);
	        Integer a = idx[0]; Integer b = idx[1];
	        if(a==null||b==null) return A;
	        int temp = A[a]; 
	        A[a] = A[b];
	        A[b] = temp;
	        return A;
	    }
	}
}
