package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0678_Valid_Parenthesis_String_7_61 {
	class Solution {
		Map<String, Boolean> map = new HashMap<>();

		public boolean checkValidString(String s) {
			if (map.containsKey(s))
				return map.get(s);
			if (s.startsWith(")") || s.endsWith("("))
				return false;
			while (s.contains("()"))
				s = s.replaceAll("\\(\\)", "");
			if (map.containsKey(s))
				return map.get(s);
			// System.out.println(s);
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '(')
					cnt++;
				else if (c == ')') {
					if (--cnt < 0) {
						map.put(s, false);
						return false;
					}
				} else {
					String pre = "";
					for (int j = 0; j < cnt; j++)
						pre = pre + "(";
					String tail = s.substring(i + 1);
					boolean b = checkValidString(pre + tail) //
							|| checkValidString(pre + "(" + tail)//
							|| checkValidString(pre + ")" + tail);//
					map.put(s, b);
	                return b;
				}
				}
			boolean rst = cnt == 0;
			map.put(s, rst);
			return rst;
		}

	}
}
