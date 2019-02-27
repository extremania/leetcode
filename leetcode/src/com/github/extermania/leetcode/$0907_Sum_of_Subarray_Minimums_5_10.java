package com.github.extermania.leetcode;

public class $0907_Sum_of_Subarray_Minimums_5_10 {
	class Solution {
	    public int sumSubarrayMins(int[] A) {
	        int sum = 0;
	        for(int i = 0; i< A.length; i++){
	            int min = A[i];
	            for(int j=i; j<A.length; j++){
	                if(A[j]<min) min = A[j];
	                sum+=min;
	                if(sum>=1000000007) sum-=1000000007;
	            }
	        }
	        return sum;
	    }
	}
}
