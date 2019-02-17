package com.github.extermania.leetcode;

public class $0168_Excel_Sheet_Column_Title_100 {
	static class Solution {
    	private static final char[] c = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', //
			'H', 'I', 'J', 'K', 'L', 'M', 'N', //
			'O', 'P', 'Q', 'R', 'S', 'T', 'U', //
			'V', 'W', 'X', 'Y', 'Z' //
	};
    public String convertToTitle(int n) {
		if (n <= 26)
			return String.valueOf(c[n - 1]);
		StringBuffer sb = new StringBuffer();
		while (n > 26) {
			int r = n % 26;
			if (r == 0)
				r = 26;
			n = n / 26;
			if (r == 26)
				n--;
			sb.append(c[r - 1]);
		}
		sb.append(c[n - 1]);
		return sb.reverse().toString();
    }
}
}
