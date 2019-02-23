package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0844_Backspace_String_Compare_9_84 {
	static class Solution {
    	private static class Stack {
		List<Integer> list = new ArrayList<>();

		void push(Integer c) {
			list.add(c);
		}

		Integer pull() {
			if (list.size() == 0)
				return null;
			return list.remove(list.size() - 1);
		}

		boolean isEmpty() {
			return list.size() == 0;
		}

		int size() {
			return list.size();
		}
	}
    public boolean backspaceCompare(String S, String T) {
        		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		for (int _s : s) {
			if (_s == '#')
				s1.pull();
			else
				s1.push(_s);
		}
		for (int _t : t) {
			if (_t == '#')
				s2.pull();
			else
				s2.push(_t);
		}
		if (s1.size() != s2.size()) {
			return false;
		}
		while (!s1.isEmpty()) {
			if (s1.pull() != s2.pull())
				return false;
		}
		return true;
    }
}
}
