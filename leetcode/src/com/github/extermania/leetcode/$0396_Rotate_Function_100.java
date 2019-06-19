package com.github.extermania.leetcode;

public class $0396_Rotate_Function_100 {
	class Solution {
	    public int maxRotateFunction(int[] A) {
	        int sum = 0;
	        int sum0 = 0;
	        for(int i=0; i<A.length; i++){
	            sum+=A[i]*i;
	            sum0+=A[i];
	        } 
	        int max = sum;
	        
	        for(int i=A.length-1; i>=0; i--){
	            //System.out.println(sum);
	            sum = (sum-A[i]*A.length+sum0);
	            max = Math.max(sum, max);
	        }

	        return max;
	    }
	}
}
