package com.github.extermania.leetcode;

public class $0995_Minimum_Number_of_K_Consecutive_Bit_Flips_71_71 {
	class Solution {
	    public int minKBitFlips(int[] A, int K) {
	        int cnt = 0;
	        for(int i=0; i<A.length; i++){
	            if(A[i]==1) continue;
	            else{
	                if(A.length-i<K) return -1;
	                else{
	                    flip(A, K, i);
	                    cnt++;
	                }
	            }
	        }
	        return cnt;
	    }
	    void flip(int[] A, int k, int n){
	        for(int i=n; i<k+n; i++){
	            A[i]^=1;
	        }
	    }
	}
}
