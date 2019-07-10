package com.github.extermania.leetcode;

import java.util.Arrays;

public class $1099_Two_Sum_Less_Than_K_16_76 {
	class Solution {
	    public int twoSumLessThanK(int[] A, int K) {
	        Arrays.sort(A);
	        int rst = -1;
	        for(int i=0;i<A.length; i++){
	            if(A[i]>=K) break;
	            for(int j=i+1; j<A.length; j++){
	                int sum = A[i]+A[j];
	                if(sum<K) rst = Math.max(sum, rst);
	                else break;
	            }
	        }
	        return rst;
	    }
	}
}
