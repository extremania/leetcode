package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $1096_Brace_Expansion_II_28_68 {
	class Solution {
		List<String> split(String str) {
			int s = 0;
			List<String> list = new ArrayList<>(8);
			while (true) {
				int idx = str.indexOf(",", s);
				if (idx >= 0) {
					list.add(str.substring(s, idx));
					s = idx + 1;
				} else {
					list.add(str.substring(s));
					break;
				}

			}
			return list;
		}

		String mul(String str1, String str2) {
			List<String> strs1 = split(str1);
			List<String> strs2 = split(str2);
			StringBuilder sb = new StringBuilder();
			for (String s1 : strs1)
				for (String s2 : strs2)
					sb.append(",").append(s1 + s2);
			return sb.length() > 0 ? sb.substring(1) : "";
		}

		String uni(String str1, String str2) {
			return str1 + "," + str2;
		}

		Set<String> mul(java.util.Collection<String> set1, java.util.Collection<String> set2) {
			Set<String> set = new HashSet<>();
			for (String str1 : set1)
				for (String str2 : set2)
					set.add(str1 + str2);
			return set;
		}

		boolean leftBrace(String str) {
			return str.equals("{");
		}

		boolean add(String str) {
			return str.equals(",");
		}

		boolean val(String str) {
			return !leftBrace(str) && !add(str);
		}

		String toString(List<String> list) {
			StringBuilder sb = new StringBuilder();
			for (int i = list.size() - 1; i >= 0; i--) {
				String str = list.get(i);
				if (add(str)) {
					String next = list.get(--i);
					sb = new StringBuilder(uni(sb.toString(), next));
				} else {
					sb = new StringBuilder(mul(sb.toString(), str));
				}
			}
			return sb.toString();
		}

		void reduce(List<String> list) {
			if (list.size() < 2)
				return;
			String a = list.get(list.size() - 2);
			String b = list.get(list.size() - 1);
			if (val(a) && val(b)) {
				String c = mul(a, b);
				list.remove(list.size() - 1);
				list.set(list.size() - 1, c);
				reduce(list);
			}
		}

		public List<String> braceExpansionII(String expression) {
			
			expression = "{" + expression + "}";

			List<String> list = new ArrayList<>();
			for (char c : expression.toCharArray()) {
				if (c == '}') {
					int i = list.size() - 1;
					List<String> list0 = new ArrayList<>();
					while(!leftBrace(list.get(i))) {
						list0.add(list.get(i));
						list.remove(i);
						i--;
					}
					list.set(list.size() - 1, toString(list0));

				} else
						list.add(String.valueOf(c));


				reduce(list);
			}
			
			String s = "";
			for (String str : list)
				s = mul(s, str);
			list = new ArrayList<>(new HashSet<>(split(s)));
			Collections.sort(list);

			return list;
		}
	    
	}
}
