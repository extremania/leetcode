package com.github.extermania.leetcode;

public class $0922_Sort_Array_By_Parity_II_16_88 {
	class Solution {
	    public int[] sortArrayByParityII(int[] A) {
	      		for (int i = 0; i < A.length; i++) {
				if ((i + A[i]) % 2 == 0)
					continue;
				for (int j = i + 1; j < A.length; j++) {
					if ((i + A[j]) % 2 == 0) {
						int t = A[j];
						A[j] = A[i];
						A[i] = t;
						break;
					}
				}
			}
			return A;  
	    }
	}
}
