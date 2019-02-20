package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class $0905_Sort_Array_By_Parity_19_21 {
	class Solution {
	    public int[] sortArrayByParity(int[] A) {
	        Comparator<Integer> c = new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1 % 2 - o2 % 2;
					}
			};
			Integer[] arr = new Integer[A.length];
			for (int i = 0; i < A.length; i++)
				arr[i] = A[i];
			Arrays.sort(arr, c);
			for (int i = 0; i < A.length; i++)
				A[i] = arr[i];
			return A;
	    }
	}
}
