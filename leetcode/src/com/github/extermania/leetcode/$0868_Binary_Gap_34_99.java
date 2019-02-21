package com.github.extermania.leetcode;

public class $0868_Binary_Gap_34_99 {
	class Solution {
	    public int binaryGap(int N) {
	      	char[] cs = Integer.toBinaryString(N).toCharArray();
			boolean hasOne = false;
			int max = 0;
			int cnt = 1;
			for (int i = 0; i < cs.length; i++) {
				if (cs[i] == '1') {
					if (!hasOne)
						hasOne = true;
					else {
						max = Math.max(cnt, max);
						cnt = 1;
					}
				} else {
					if (hasOne)
						cnt++;
				}
			}
			return max;  
	    }
	}
}
