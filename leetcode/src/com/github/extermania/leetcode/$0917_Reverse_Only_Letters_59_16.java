package com.github.extermania.leetcode;

public class $0917_Reverse_Only_Letters_59_16 {
	class Solution {
	    public String reverseOnlyLetters(String S) {
			char[] cs = S.toCharArray();
			for (int i = 0, j = cs.length - 1; i < j; i++) {
				if (cs[i] >= 'A' && cs[i] <= 'Z' || cs[i] >= 'a' && cs[i] <= 'z') {
					while (!(cs[j] >= 'A' && cs[j] <= 'Z' || cs[j] >= 'a' && cs[j] <= 'z')) {
						j--;
						if (j == i)
							break;
					}
					char tmp = cs[i];
					cs[i] = cs[j];
					cs[j] = tmp;
	                j--;
				}
			}
			return new String(cs);
	    }
	}
}
