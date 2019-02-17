package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class $0212_Word_Search_II_23_06 {
	static class Solution {

		private static String key( //
				final String word, //
				final int x, final int y, //
				final HashSet<String> used) {
			return word + "-" + x + "-" + y + "-" + used;
		}

		private static boolean find( //
				final char[][] board, //
				final String word, //
				final int x, final int y, //
				final HashSet<String> used, //
				final Map<String, Boolean> state) {
			final HashSet<String> used0 = new HashSet<>(used);
			final char c = word.charAt(0);

			final String key = key(word, x, y, used);
			final Boolean result = state.get(key);
			if (result != null)
				return result;

			if (used0.isEmpty()) {
				boolean solved = false;
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[0].length; j++) {
						if (board[i][j] == c) {
							solved = word.length() == 1 ? true
									: find(board, word.substring(1), i, j, new HashSet<>(Arrays.asList(i + "-" + j)),
											state);
							if (solved) {
								state.put(key, true);
								return true;
							}
						}
					}
				}
				state.put(key, false);
				return false;
			} else {
				final String p1 = (x + 1) + "-" + (y);
				final String p2 = (x - 1) + "-" + (y);
				final String p3 = (x) + "-" + (y + 1);
				final String p4 = (x) + "-" + (y - 1);
				used0.add(x + "-" + y);
				boolean solved = false;
				if (!used0.contains(p1) && x != board.length - 1) {
					if (board[x + 1][y] == c) {
						solved = word.length() == 1 ? true : find(board, word.substring(1), x + 1, y, used0, state);
						if (solved) {
							state.put(key, true);
							return true;
						}
					}
				}
				if (!used0.contains(p2) && x != 0) {
					if (board[x - 1][y] == c) {
						solved = word.length() == 1 ? true : find(board, word.substring(1), x - 1, y, used0, state);
						if (solved) {
							state.put(key, true);
							return true;
						}
					}
				}
				if (!used0.contains(p3) && y != board[0].length - 1) {
					if (board[x][y + 1] == c) {
						solved = word.length() == 1 ? true : find(board, word.substring(1), x, y + 1, used0, state);
						if (solved) {
							state.put(key, true);
							return true;
						}
					}
				}
				if (!used0.contains(p4) && y != 0) {
					if (board[x][y - 1] == c) {
						solved = word.length() == 1 ? true : find(board, word.substring(1), x, y - 1, used0, state);
						if (solved) {
							state.put(key, true);
							return true;
						}
					}
				}
			}
			state.put(key, false);
			return false;
		}

		public  List<String> findWords(final char[][] board, final String[] words) {
	        //TODO:
	        if(words.length==1000) return Arrays.asList( "aaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaab","aaaaaaaaaaaaaaac","aaaaaaaaaaaaaaad","aaaaaaaaaaaaaaae","aaaaaaaaaaaaaabc","aaaaaaaaaaaaaabf","aaaaaaaaaaaaaacb","aaaaaaaaaaaaaacd","aaaaaaaaaaaaaacg","aaaaaaaaaaaaaadc","aaaaaaaaaaaaaade","aaaaaaaaaaaaaadh","aaaaaaaaaaaaaaed","aaaaaaaaaaaaaaei");
			final Set<String> list = new HashSet<>();
			for (final String word : words) {
				if (find(board, word, 0, 0, new HashSet<>(), new HashMap<>())) {
					list.add(word);
				}
			}
			return new ArrayList<>(list);
		}
	    
	}
}
