package com.github.extermania.leetcode;

public class $0832_Flipping_an_Image_100 {
	class Solution {
	    public int[][] flipAndInvertImage(int[][] A) {
			for (int[] row : A) {
				for (int left = 0, right = row.length - 1; left <= right; left++, right--) {
					if (left != right) {
						int tmp = row[right];
						row[right] = row[left];
						row[left] = tmp;
						row[left] ^= 1;
						row[right] ^= 1;
					} else {
						row[left] ^= 1;
					}
				}
			}
			return A;
	    }
	}
}
