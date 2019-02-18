package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0017_Letter_Combinations_of_a_Phone_Number_80_24 {
	static class Solution {
		static void f(Set<String> set, String s, String cur) {
			if (s.length() == 0) {
				set.add(cur);
				return;
			}
			char c = s.charAt(0);
			String s0 = s.substring(1);
			switch (c) {
			case '2':
				f(set, s0, cur + "a");
				f(set, s0, cur + "b");
				f(set, s0, cur + "c");
				break;
			case '3':
				f(set, s0, cur + "d");
				f(set, s0, cur + "e");
				f(set, s0, cur + "f");
				break;
			case '4':
				f(set, s0, cur + "g");
				f(set, s0, cur + "h");
				f(set, s0, cur + "i");
				break;
			case '5':
				f(set, s0, cur + "j");
				f(set, s0, cur + "k");
				f(set, s0, cur + "l");
				break;
			case '6':
				f(set, s0, cur + "m");
				f(set, s0, cur + "n");
				f(set, s0, cur + "o");
				break;
			case '7':
				f(set, s0, cur + "p");
				f(set, s0, cur + "q");
				f(set, s0, cur + "r");
				f(set, s0, cur + "s");
				break;
			case '8':
				f(set, s0, cur + "t");
				f(set, s0, cur + "u");
				f(set, s0, cur + "v");
				break;
			case '9':
				f(set, s0, cur + "w");
				f(set, s0, cur + "x");
				f(set, s0, cur + "y");
				f(set, s0, cur + "z");
				break;
			default:
				break;
			}
		}

		public List<String> letterCombinations(String digits) {
			if (digits.length() == 0)
				return new ArrayList<>();
			Set<String> set = new HashSet<>();
			f(set, digits, "");
			return new ArrayList<>(set);
		}
	}
}
