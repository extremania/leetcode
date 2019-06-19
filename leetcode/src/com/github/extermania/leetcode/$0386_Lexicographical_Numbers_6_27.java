package com.github.extermania.leetcode;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class $0386_Lexicographical_Numbers_6_27 {
	class Solution {
		public List<Integer> lexicalOrder(int n) {
			TreeSet<String> set = new TreeSet<>();
			for (int i = 1; i <= n; i++)
				set.add(String.valueOf(i));
			return set.stream().map(s -> {
				return Integer.parseInt(s);
			}).collect(Collectors.toList());
		}
	}
}
