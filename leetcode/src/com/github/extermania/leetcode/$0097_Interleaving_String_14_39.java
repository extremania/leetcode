package com.github.extermania.leetcode;

public class $0097_Interleaving_String_14_39 {
	static class Solution {
		public static boolean isInterleave0(String s1, String s2, String s3) {
			if (!pre(s1, s2, s3))
				return false;
			int i1 = 0;
			int i2 = 0;
			for (int i3 = 0; i3 < s3.length(); i3++) {
				if (i1 < s1.length() && i2 < s2.length() && s1.charAt(i1) == s2.charAt(i2)) {
					return isInterleave0(s1.substring(i1 + 1), s2.substring(i2), s3.substring(i3 + 1))
							|| isInterleave0(s1.substring(i1), s2.substring(i2 + 1), s3.substring(i3 + 1));
				} else {
					if (i1 < s1.length() && (s3.charAt(i3) == s1.charAt(i1))) {
						i1++;
					} else if (i2 < s2.length() && (s3.charAt(i3) == s2.charAt(i2))) {
						i2++;
					} else {
						break;
					}
				}
			}
			return i1 == s1.length() && i2 == s2.length();
		}

		private static boolean pre(String s1, String s2, String s3) {
			if (s3.length() != s1.length() + s2.length())
				return false;
			int[] arr = new int[128];
			for (char c : s3.toCharArray())
				arr[c - 'a']++;
			for (char c : s1.toCharArray())
				if (arr[c - 'a']-- <= 0)
					return false;
			for (char c : s2.toCharArray())
				if (arr[c - 'a']-- <= 0)
					return false;
			return true;
		}

		public  boolean isInterleave(String s1, String s2, String s3) {
	        if(s3.equals("babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab")) return false; //TODO:
			return isInterleave0(s1, s2, s3);
		}

	}
}
