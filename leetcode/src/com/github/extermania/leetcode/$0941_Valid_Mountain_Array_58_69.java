package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0941_Valid_Mountain_Array_58_69 {
	static class Solution {
	    private static boolean isUp(int[] A) {
			if (A.length == 1)
				return true;
			for (int i = 1; i < A.length; i++) {
				int a = A[i];
				int b = A[i - 1];
				if (!(a > b)) {
					return false;
				}
			}
			return true;
		}

		private static boolean isDown(int[] A) {
			if (A.length == 1)
				return true;
			for (int i = 1; i < A.length; i++) {
				int a = A[i];
				int b = A[i - 1];
				if (!(a < b)) {
					return false;
				}
			}
			return true;
		}
	    public boolean validMountainArray(int[] A) {
			int len = A.length;
			if (len < 3)
				return false;
			if (len == 3) {
				return A[1] > A[0] && A[1] > A[2];
			} else {
				int inx = len / 2;
				int mid = A[inx];
				int left = A[inx - 1];
				int right = A[inx + 1];
				int[] la = Arrays.copyOfRange(A, 0, inx + 1);
				int[] ra = Arrays.copyOfRange(A, inx, A.length);
				// System.out.println("a:" + Arrays.toString(A));
				// System.out.println("la:" + Arrays.toString(la));
				// System.out.println("ra:" + Arrays.toString(ra));
				if (mid > left && mid > right) {
					return isUp(la) && isDown(ra);
				} else if (mid > left && mid < right) {
					return isUp(la) && validMountainArray(ra);
				} else {
					return validMountainArray(la) && isDown(ra);
				}
	        }
	    }
	}
}
