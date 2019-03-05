package com.github.extermania.leetcode;

public class $0326_Power_of_Three_81_38 {
	class Solution {
	    public boolean isPowerOfThree(int n) {
	        String s = Integer.toString(n, 3);
			return s.indexOf("1") == 0 && s.lastIndexOf("1") == 0 && s.lastIndexOf("2") < 0;
	    }
	}
}
