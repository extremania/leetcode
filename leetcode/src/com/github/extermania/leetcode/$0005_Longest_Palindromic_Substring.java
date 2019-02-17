package com.github.extermania.leetcode;

public class $0005_Longest_Palindromic_Substring {
	class Solution {
	    public String longestPalindrome(String s) {
			if (s.length() == 0 || s.length() == 1)
				return s;
			if (s.length() == 2) {
				if (s.charAt(0) == s.charAt(1)) {
					return s;
				} else {
					return s.substring(0, 1);
				}
			}
			char[] cs = s.toCharArray();
			int finalStart = 0;
			int finalEnd = 0;
			int finalCnt = 0;
			// check odd
			for (int i = 0; i < cs.length - 1; i++) {
				int cnt = 1;
				int start = 0;
				int end = 0;
				int step = Math.min(i, cs.length - i - 1);
				for (int j = 1; j <= step; j++) {
					if (cs[i + j] == cs[i - j]) {
						start = i - j;
						end = i + j;
						cnt += 2;
					} else {
						break;
					}
				}
				if (cnt > finalCnt) {
					finalCnt = cnt;
					finalStart = start;
					finalEnd = end;
				}
			}
			// check even
			for (int i = 0; i < cs.length - 1; i++) {
				if (cs[i] != cs[i + 1])
					continue;
				int cnt = 2;
				int start = i;
				int end = i + 1;
				int step = Math.min(i, cs.length - i - 2);
				for (int j = 1; j <= step; j++) {
					if (cs[i + j + 1] == cs[i - j]) {
						start = i - j;
						end = i + j + 1;
						cnt += 2;
					} else {
						break;
					}
				}
				if (cnt > finalCnt) {
					finalCnt = cnt;
					finalStart = start;
					finalEnd = end;
				}
			}
			return s.substring(finalStart, finalEnd + 1);
		}
	}
}
