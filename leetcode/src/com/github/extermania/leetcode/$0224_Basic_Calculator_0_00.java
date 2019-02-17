package com.github.extermania.leetcode;

public class $0224_Basic_Calculator_0_00 {
	static class Solution {
		private static int calculate0(final String s) {
			final String s0 = s;
			// if (s0.startsWith("-")) {
			// s0 = "0" + s0;
			// }
			final int iadd = s0.indexOf("+");
			final int isub = s0.indexOf("-");
			if (iadd < 0 && isub <= 0)
				return Integer.parseInt(s0);
			if (iadd > 0) {
				return calculate0(s0.substring(0, iadd).trim()) + calculate0(s0.substring(iadd + 1).trim());
			} else if (isub > 0) {
				return calculate0(s0.substring(0, isub).trim()) - calculate0(re(s0.substring(isub + 1).trim()));
			}
			return 0;
		}

		private static String re(final String s) {
			final char[] cs = s.toCharArray();
			for (int i = 0; i < cs.length; i++) {
				if (cs[i] == '+') {
					cs[i] = '-';
				} else if (cs[i] == '-') {
					cs[i] = '+';
				}
			}
			return String.valueOf(cs);
		}

		public  int calculate(final String s) {
			String s0 = s.trim();
			int idx = s0.indexOf(")");
			while (idx >= 0) {
				for (int i = idx - 1;; i--) {
					if (s0.charAt(i) == '(') {
						s0 = s0.substring(0, i).trim() //
								+ calculate0(s0.substring(i + 1, idx).trim())//
								+ s0.substring(idx + 1).trim();
						//System.out.println("before:" + s0);
						s0 = s0.replace("--", "+");
						s0 = s0.replace("+-", "-");
						idx = s0.indexOf(")");
						//System.out.println("after: " + s0);
						break;
					}
				}
			}
			return calculate0(s0);
		}
	}
}
