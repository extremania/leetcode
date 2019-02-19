package com.github.extermania.leetcode;

public class $0299_Bulls_and_Cows_100 {
	class Solution {
	    public String getHint(String secret, String guess) {
			char[] ss = secret.toCharArray();
			char[] gs = guess.toCharArray();
			int[] d = new int[10];
			for (char s : ss) {
				d[s - '0']++;
			}
			//System.out.println(Arrays.toString(d));
			for (char g : gs) {
				if (d[g - '0'] != 0) {
					d[g - '0']--;
				}
			}
			//System.out.println(Arrays.toString(d));
			int rmd = 0;
			for (int _d : d) {
				rmd += _d;
			}
			//System.out.println(rmd);
			int bull = 0;
			for (int i = 0; i < ss.length; i++) {
				if (ss[i] == gs[i])
					bull++;
			}
			int cow = secret.length() - rmd - bull;
			return bull + "A" + cow + "B";
		}
	}
}
