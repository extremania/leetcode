package com.github.extermania.leetcode;

public class $0852_Peak_Index_in_a_Mountain_Array_21_23 {
	class Solution {
	    public int peakIndexInMountainArray(int[] A) {
	        int p = A[0];
	        for(int i=1; i<A.length; i++){
	            if(A[i]>p){
	                p=A[i];
	            }else{
	                return i-1;
	            }
	        }
	        return 0;
	    }
	}
}
