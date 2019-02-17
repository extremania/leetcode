package com.github.extermania.leetcode;

public class $0202_Happy_Number_95_93 {
	class Solution {
    	public  boolean isHappy(final int n) {
		
		final String str = String.valueOf(n);
		int sum = 0;
		for (final char c : str.toCharArray()) {
			final int a = c - '0';
			sum += a * a;
		}
		if (n == 1 || n == 7)
			return true;
		else if (n < 10)
			return false;
		else
			return isHappy(sum);
	}
}
}
