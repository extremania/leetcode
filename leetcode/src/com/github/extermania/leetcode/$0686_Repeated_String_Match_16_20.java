package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0686_Repeated_String_Match_16_20 {
	class Solution {
		public int repeatedStringMatch(String A, String B) {
			if (A.length() == 0 || B.length() == 0)
				return -1;
	        
	        Set<String> seta = new HashSet<>();
			for (char c : A.toCharArray()) {
				seta.add(String.valueOf(c));
			}
			Set<String> setb = new HashSet<>();
			for (char c : B.toCharArray()) {
				setb.add(String.valueOf(c));
			}
			if (seta.size() < setb.size())
				return -1;
	        
			int cnt = 1;
			String a = A;
			while (a.length() <= 10000) {
				if (a.length() >= B.length() && a.contains(B)) {
					return cnt;
				}
				a = a + A;
				cnt++;
			}
			return -1;
		}
	}
}
