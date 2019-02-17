package com.github.extermania.leetcode;

public class $0214_Shortest_Palindrome_1_90 {
	static class Solution {
		private static boolean valid(final String s0) {
				//System.out.println("s0: " + s0);
				String s00 = null;
				final int mid = s0.length() / 2;
				if (s0.length() % 2 == 0)
					s00 = s0.substring(0, mid) + "|" + s0.substring(mid);
				else
					s00 = s0;

				//System.out.println(s00);

				for (int n = 1; n < s00.length() - mid; n++) {
					final char c1 = s00.charAt(mid - n);
					final char c2 = s00.charAt(mid + n);
					// System.out.println(c1 + " " + c2);
					if (c1 != '*' && c1 != c2) {
						return false;
					}
				}
				return true;
			}

			public static String shortestPalindrome(final String s) {
				if (s.length() == 0)
					return s;
				if (s.length() == 1)
					return s;

				String s0 = s;
				while (!valid(s0)) {
					s0 = '*' + s0;
				}

				// System.out.println(s0);

				final int mid = s0.length() / 2;
				if (s0.length() % 2 == 1) {
					return new StringBuilder(s0.substring(mid + 1)).reverse().append(String.valueOf(s0.charAt(mid)))
							.append(s0.substring(mid + 1)).toString();
				} else {
					return new StringBuilder(s0.substring(mid)).reverse().append(s0.substring(mid)).toString();
				}

			}

		}
}
