package com.github.extermania.leetcode;

public class $0961_N_Repeated_Element_in_Size_2N_Array_70_05 {
	class Solution {
	    public int repeatedNTimes(int[] A) {
	        int[] arr=new int[100000];
	        for(int i=0; i<A.length; i++){
	            if(arr[A[i]]--<0){
	                return A[i];
	            }
	        } 
	        return 0;
	    }
	}
}
