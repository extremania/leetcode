package com.github.extermania.leetcode;

public class $0974_Subarray_Sums_Divisible_by_K_17_30 {
	class Solution {
	    public int subarraysDivByK(int[] A, int K) {
	        if(A.length==0 || K==0) return 0;
	        int cnt = 0;
	        for(int i=0; i<A.length; i++){
	            int temp = A[i];
	            if(temp%K==0) cnt++;
	            for(int j=i+1; j<A.length; j++){
	                temp = temp + A[j];
	                if(temp%K==0) cnt++;
	            }
	        }
	        return cnt;
	    }
	}
}
