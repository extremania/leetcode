package com.github.extermania.leetcode;

public class $0374_Guess_Number_Higher_or_Lower_100 {

	static class GuessGame {
		int guess(int n){return n;}
	}

	public class Solution extends GuessGame {

		public int guessNumber(int n) {
			long cur = n;
			long lo = Integer.MIN_VALUE;
			long hi = Integer.MAX_VALUE;
			while (true) {

				int r = guess((int) cur);

				if (r == 0) {
					return (int) cur;
				} else if (r > 0) {
					lo = cur;
					cur = Math.min(hi, (cur + hi) / 2);
				} else {
					hi = cur;
					cur = Math.min(lo, (cur + lo) / 2);
				}

				// System.out.println(hi+" "+lo+" "+cur);

				if (lo == hi)
					return (int) lo;

			}
		}
	}
}
