package com.github.extermania.leetcode;

public class $0962_Maximum_Width_Ramp_28_86 {
	class Solution {
	    public int maxWidthRamp(int[] A) {
	        int max=0;
	        for(int i=0; i<A.length-1; i++){
	            for(int j=i+1; j<A.length; j++){
	                if(A[j]>=A[i]) max = Math.max(max, j-i);
	            }
	           if(A.length-i<max) break;
	        }
	        return max;
	    }
	}
}
