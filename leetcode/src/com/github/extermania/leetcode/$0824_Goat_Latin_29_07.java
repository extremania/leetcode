package com.github.extermania.leetcode;

public class $0824_Goat_Latin_29_07 {
	class Solution {
		public String toGoatLatin(String S) {
			if (S == null || S.length() == 0)
				return S;
			String[] words = S.split(" ");
			StringBuilder sb = new StringBuilder();
			StringBuilder ar = new StringBuilder("a");
			for (String word : words) {
				char first = word.charAt(0);
				if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A'
						|| first == 'E' || first == 'I' || first == 'O' || first == 'U') {
					sb.append(word);
				} else {
					sb.append(word.substring(1)).append(first);
				}
				sb.append("ma").append(ar).append(" ");
				ar.append("a");
			}
			return sb.toString().trim();
		}
	}
}
