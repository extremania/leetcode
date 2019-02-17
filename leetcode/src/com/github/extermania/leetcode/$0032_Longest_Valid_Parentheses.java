package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0032_Longest_Valid_Parentheses {
	static class Solution {
		private static class Stack {
			List<String> list = new ArrayList<>();

			void push() {
				list.add("X");
			}

			void pop() {
				list.remove(list.size() - 1);
			}

			boolean empty() {
				return list.size() == 0;
			}
		}

		private static int cnt(String s) {
			if (s.length() == 0)
				return 0;
			if (s.charAt(0) == ')')
				return 1;
			Stack t = new Stack();
			int cur = 0;
			for (char c : s.toCharArray()) {
				if (c == '(') {
					t.push();
					cur++;
				} else {
					if (!t.empty()) {
						t.pop();
						cur++;
						if (t.empty())
							return cur;
					} else {
						return cur;
					}
				}
			}
			return 1;
		}


		public  int longestValidParentheses(String s) {
			if (s.length() == 0)
				return 0;

			List<Integer> all = new ArrayList<>();
			String s0 = s;
			int cnt = 0;
			do {
				cnt = cnt(s0);
				all.add(cnt);
				s0 = s0.substring(cnt);
			} while (cnt != 0);

			System.out.println(all);

			int max = 0;
			int cur = 0;
			for (int i = 0; i < all.size(); i++) {
				int n = all.get(i);
				if (n == 1) {
					max = Math.max(cur, max);
					cur = 0;
				} else if (n == 0) {
					return Math.max(cur, max);
				} else {
					cur += n;
				}
			}

			return Math.max(cur, max);
		}

	}
}
