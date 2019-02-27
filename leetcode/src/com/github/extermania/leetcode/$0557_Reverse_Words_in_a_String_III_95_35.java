package com.github.extermania.leetcode;

public class $0557_Reverse_Words_in_a_String_III_95_35 {
	class Solution {
	    public String reverseWords(String s) {
	        StringBuilder result = new StringBuilder();
			for (String part : s.split(" ")) {
				result.append(new StringBuilder(part).reverse()).append(" ");
			}
			return result.toString().trim();
	    }
	}
}
