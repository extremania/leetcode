package com.github.extermania.leetcode;

public class $0482_License_Key_Formatting_86_11 {
	class Solution {
	    public String licenseKeyFormatting(String S, int K) {
	        if(S.length()==0 || K==0) return S;
			char[] cs = S.toCharArray();
			StringBuilder sb = new StringBuilder();
			int cur = 1;
			for (int i = cs.length - 1; i >= 0; i--) {
				if (cs[i] != '-') {
					sb.append(cs[i]);
					if (cur == K && i != 0) {
						sb.append("-");
						cur = 1;
					} else {
						cur++;
					}
				}
			}

			String s = sb.reverse().toString().toUpperCase();
			if (s.startsWith("-")) {
				s = s.substring(1);
			}
			return s;
	    }
	}
}
