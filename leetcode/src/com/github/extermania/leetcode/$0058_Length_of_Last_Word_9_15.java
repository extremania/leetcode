package com.github.extermania.leetcode;

public class $0058_Length_of_Last_Word_9_15 {
	class Solution {
	    public int lengthOfLastWord(String s) {
	        String[] ss = s.trim().split(" ");
			return ss.length == 0 ? 0 : ss[ss.length - 1].length();
	    }
	}
}
