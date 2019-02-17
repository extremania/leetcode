package com.github.extermania.leetcode;

public class $0009_Palindrome_Number {
	class Solution {
	    public boolean isPalindrome(int x) {
	        String c = String.valueOf(x);
			return new StringBuffer(c).reverse().toString().equals(c);
	    }
	}
}
