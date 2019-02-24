package com.github.extermania.leetcode;

public class $0744_Find_Smallest_Letter_Greater_Than_Target_40_99 {
	class Solution {
	    public char nextGreatestLetter(char[] letters, char target) {
			int neg = 0;
			int pos = Integer.MAX_VALUE;
			int ni = 0;
			int pi = 0;

			for (int i = 0; i < letters.length; i++) {
				int d = letters[i] - target;
				if (d < 0 && neg < d) {
					neg = d;
					ni = i;
				} else if (d > 0 && pos > d) {
					pos = d;
					pi = i;
				} else {

				}
			}

			if (pos > 0)
				return letters[pi];
			else if (neg < 0)
				return letters[ni];
			else
				return letters[pi];
		}
	}
}
