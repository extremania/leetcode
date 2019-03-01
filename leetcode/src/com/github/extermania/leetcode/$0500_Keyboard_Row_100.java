package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0500_Keyboard_Row_100 {
	static class Solution {
	    
		private static final int[] row1 = new int[] { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		private static final int[] row2 = new int[] { 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' };
		private static final int[] row3 = new int[] { 'z', 'x', 'c', 'v', 'b', 'n', 'm' };

		private static boolean contains(int[] row, int c) {
			for (int cc : row) {
				if (cc == c)
					return true;
			}
			return false;
		}

		private static int[] getRow(int c) {
			if (contains(row1, c)) {
				return row1;
			} else if (contains(row2, c)) {
				return row2;
			}
			return row3;
		}

		public  String[] findWords(String[] words) {
			List<String> result = new ArrayList<>();
			for (String word : words) {
				char[] cs = word.toLowerCase().toCharArray();
				boolean yes = true;
				int[] row = getRow(cs[0]);
				for (int c : cs) {
					if (!contains(row, c)) {
							yes = false;
							break;
						}
					}
				if (yes) {
					result.add(word);
				}
			}
			return result.toArray(new String[] {});
		}
	}
}
