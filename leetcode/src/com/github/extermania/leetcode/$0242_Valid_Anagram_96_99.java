package com.github.extermania.leetcode;

public class $0242_Valid_Anagram_96_99 {
	class Solution {
	    public boolean isAnagram(String s, String t) {
	        if (s.length() != t.length())
				return false;
			int[] chars = new int[26];
			for (char c : s.toCharArray()) {
				chars[c - 'a']++;
			}
			for (char c : t.toCharArray()) {
				chars[c - 'a']--;
			}
			for (int i : chars) {
				if (i != 0)
					return false;
			}
			return true;
	    }
	}
}
