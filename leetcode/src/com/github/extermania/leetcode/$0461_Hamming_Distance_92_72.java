package com.github.extermania.leetcode;

public class $0461_Hamming_Distance_92_72 {
	class Solution {
	    public int hammingDistance(int x, int y) {
			if (x == y)
				return 0;
			char[] a = Integer.toBinaryString(x).toCharArray();
			char[] b = Integer.toBinaryString(y).toCharArray();
			int[] aa = new int[32];
			int[] bb = new int[32];
			for (int i = a.length - 1, ii = 31; i >= 0; i--, ii--) {
				if (a[i] == '1')
					aa[ii]++;
			}
			for (int i = b.length - 1, ii = 31; i >= 0; i--, ii--) {
				if (b[i] == '1')
					bb[ii]++;
			}
			int cnt = 0;
			for (int i = 0; i < 32; i++) {
				if (aa[i] != bb[i])
					cnt++;
			}
			return cnt;
		}
	}
}
