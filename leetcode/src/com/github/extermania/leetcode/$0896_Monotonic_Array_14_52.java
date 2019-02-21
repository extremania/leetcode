package com.github.extermania.leetcode;

public class $0896_Monotonic_Array_14_52 {
	class Solution {
	    public boolean isMonotonic(int[] A) {
	        if(A.length<=1) return true;
	        int first = A[0];
	        int last = A[A.length-1];
	        if(first>last){ // desc
	            for(int i=1; i<A.length-1; i++){
	                if(A[i]>first || A[i]<last){
	                    return false;
	                }
	                first=A[i];
	            }
	        }else if(last>first){ //asc
	            for(int i=1; i<A.length-1; i++){
	                if(A[i]<first || A[i]>last){
	                    return false;
	                }
	                first=A[i];
	            }
	        }else{ //all same
	            for(int i=1; i<A.length-1; i++){
	                if(A[i]!=first){
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}
}
