package com.github.extermania.leetcode;

public class $0409_Longest_Palindrome_100 {
	class Solution {
	    public int longestPalindrome(String s) {
			int[] cs = new int[128];
			for (char c : s.toCharArray()) {
				cs[c]++;
			}
			boolean hasOdd = false;
			int cnt = 0;
			for (int i : cs) {
				if (i == 0)
					continue;
				else if (i % 2 == 0)
					cnt += i;
				else if (i % 2 == 1) {
					cnt += (i - 1);
					hasOdd = true;
				}
			}
			if (hasOdd)
				cnt++;
			return cnt;
	    }
	}
}
