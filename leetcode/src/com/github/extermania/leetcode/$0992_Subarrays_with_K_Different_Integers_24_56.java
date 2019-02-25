package com.github.extermania.leetcode;

public class $0992_Subarrays_with_K_Different_Integers_24_56 {
	class Solution {
	    public int subarraysWithKDistinct(int[] A, int K) {
	        //if(K==1) return A.length;
	        int cnt = 0;
	        for(int i=0; i<A.length; i++){
	            int[] arr = new int[A.length+1];
	            int diff = 0;
	            for(int j=i; j<A.length; j++){
	                if(arr[A[j]]==0){arr[A[j]]++; diff++;}
	                if(diff==K) cnt++;
	                else if(diff>K){break;}
	            }
	        }
	        return cnt;
	    }
	}
}
