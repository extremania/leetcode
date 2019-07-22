package com.github.extermania.leetcode;

public class $1111_Maximum_Nesting_Depth_of_Two_Valid_Parentheses_Strings_97_62 {
	class Solution {
		public int[] maxDepthAfterSplit(String seq) {
			int d1 = 0;
			int d2 = 0;
			int[] arr = new int[seq.length()];
			int cur = -1;

			for (char c : seq.toCharArray()) {
				if (c == '(') {
					if (d1 <= d2) {
						d1++;
						cur++;
					} else {
						d2++;
						arr[++cur] = 1;
					}
				} else {
					if (d1 >= d2) {
						d1--;
						cur++;
					} else {
						d2--;
						arr[++cur] = 1;
					}
				}
			}

			return arr;
		}
	}
}
