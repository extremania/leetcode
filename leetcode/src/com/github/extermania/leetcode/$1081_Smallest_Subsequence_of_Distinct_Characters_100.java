package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class $1081_Smallest_Subsequence_of_Distinct_Characters_100 {
	class Solution {
		String check(String str, char c, List<Character> clist) {

			// System.out.println("check " + str + " " + c + " " + clist);

			int idx = str.indexOf(c);
			String s0 = str.substring(idx + 1);

			for (char c0 : clist)
				if (c0 == c)
					continue;
				else if (s0.indexOf(c0) < 0)
					return null;

			// System.out.println(true);

			return s0;
		}

		public String smallestSubsequence(String text) {

			String text0 = text;

			int[] arr = new int[26];
			for (char c : text0.toCharArray())
				arr[c - 'a']++;

			List<Character> clist = new ArrayList<>();
			for (int i = 0; i < arr.length; i++)
				if (arr[i] > 0)
					clist.add((char) ('a' + i));

			StringBuilder result = new StringBuilder();
			while (clist.size() > 0) {
				// System.out.println(text0);
				Iterator<Character> it = clist.iterator();
				while (it.hasNext()) {
					char next = it.next();
					String checked = check(text0, next, clist);
					if (checked != null) {
						text0 = checked;
						it.remove();
						result.append(next);
						break;
					}
				}
			}

			return result.toString();
		}
	}
}
