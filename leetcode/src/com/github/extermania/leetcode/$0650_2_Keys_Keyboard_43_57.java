package com.github.extermania.leetcode;

public class $0650_2_Keys_Keyboard_43_57 {
	class Solution {
		int f(int n, int cur, int copy, boolean canCopy) {
			return cur > n ? n
					: (cur == n ? 0
							: Math.min(canCopy ? 1 + f(n, cur, cur, false) : n,
									copy > 0 ? 1 + f(n, cur + copy, copy, true) : n));
		}

		public int minSteps(int n) {
			return f(n, 1, 0, true);
		}
	}
}
