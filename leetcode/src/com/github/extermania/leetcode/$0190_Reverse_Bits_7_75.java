package com.github.extermania.leetcode;

public class $0190_Reverse_Bits_7_75 {
	public class Solution {
	    // you need treat n as an unsigned value
	    public int reverseBits(int n) {
			String ss = Integer.toBinaryString(n);
			while (ss.length() != 32) {
				ss = "0" + ss;
			}
			char[] a = ss.toCharArray();
			int result = 0;
			for (int i = 31; i >= 0; i--) {
				if (a[i] == '1') {
					result |= (1 << (i));
				}
			}
	        return result;
	    }
	}
}
