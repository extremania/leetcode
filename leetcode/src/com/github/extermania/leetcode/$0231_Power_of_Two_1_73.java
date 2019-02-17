package com.github.extermania.leetcode;

public class $0231_Power_of_Two_1_73 {
	class Solution {
		public  boolean isPowerOfTwo(final int n) {
			if(n==1) return true;
	        if(n<=0) return false;
			final String s = Integer.toBinaryString(Math.abs(n) - 1);
			System.out.println(s);
			for (final char c : s.toCharArray()) {
				if (c == '0')
					return false;
			}
			return true;
		}
	}
}
