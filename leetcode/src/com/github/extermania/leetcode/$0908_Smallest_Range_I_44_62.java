package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0908_Smallest_Range_I_44_62 {
	class Solution {
	    public int smallestRangeI(int[] A, int K) {
	        Arrays.sort(A);
	        int min = A[0];
	        int max = A[A.length-1];
	        int k2 = K*2;
	        int diff = max-min;
	        return diff<k2?0:diff-k2;
	    }
	}
}
