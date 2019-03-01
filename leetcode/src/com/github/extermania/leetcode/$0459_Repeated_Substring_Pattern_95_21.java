package com.github.extermania.leetcode;

public class $0459_Repeated_Substring_Pattern_95_21 {
	class Solution {
	    public boolean repeatedSubstringPattern(String s) {
			int len = s.length();
			for (int i = 1; i < len; i++) {
				if (len % i != 0) {
					continue;
				}
				String ss = s.substring(0, i);
				boolean ok = true;
				//System.out.println("ss:" + ss);
				for (int j = i; j < len; j += i) {
					String sss = s.substring(j, j + i);
					//System.out.println("sss:" + sss);
					if (!ss.equals(sss)) {
						ok = false;
						break;
					}
				}
				if (ok)
					return ok;
			}

			return false;
	    }
	}
}
