package com.github.extermania.leetcode;

public class $0007_Reverse_Integer {
	class Solution {
		public int reverse(int x) {
			try {
				if (x < 0) {
					return 0 - Integer.parseInt(new StringBuffer(String.valueOf(Math.abs(x))).reverse().toString());
				} else {
					return Integer.parseInt(new StringBuffer(String.valueOf(x)).reverse().toString());
				}
			} catch (Exception e) {
				return 0;
			}

		}
	}
}
