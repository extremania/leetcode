package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0792_Number_of_Matching_Subsequences_53_19 {
	static class Solution {
		private static boolean valid(int[] stri, int[] stri2, String word, int max) {
			if (word.length() > max)
				return false;
			char[] wcs = word.toCharArray();

			for (char c : wcs) {
				if (stri2[c - 'a'] == 0)
					return false;
			}

			// ==============================
			int place = 0;
			for (char c : wcs) {
				if (place >= max)
					return false;
				for (int i = place; i < max; i++) {
					if (validChar(stri, c, i)) {
						place = i + 1;
						break;
					}
					if (i == max - 1) {
						return false;
					}
				}
			}
			return true;
		}

		private static boolean validChar(int[] stri, char c, int place) {
			return stri[place * 26 + c - 'a'] == 1;
		}

		public  int numMatchingSubseq(String S, String[] words) {
			if (S.length() == 0)
				return 0;
			if (words.length == 0)
				return 0;

			int[] stri = new int[26 * S.length()];
			char[] cs = S.toCharArray();
			int[] stri2 = new int[26];

			for (int i = 0; i < cs.length; i++) {
				int subidx = cs[i] - 'a';
				stri[i * 26 + subidx]++;
				stri2[subidx]++;
			}

			Set<String> cache = new HashSet<>();

			int cnt = 0;
			for (String word : words) {
			    if (cache.contains(word))
					cnt++;
				else if (word.length() == S.length() && word.equals(S))
					cnt++;
				else if (valid(stri, stri2, word, S.length())) {
					//System.out.println(word);
					cache.add(word);
					cnt++;
				}
			}

			return cnt;

		}
	}
}
