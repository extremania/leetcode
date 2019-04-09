package com.github.extermania.leetcode;

public class $0151_Reverse_Words_in_a_String_99_94 {
	class Solution {
	    public String reverseWords(String s) {
	        String[] strs = s.split(" ");
	        StringBuilder sb = new StringBuilder();
	        for(int i=strs.length-1; i>=0; i--){
	            if(strs[i].isEmpty()) continue;
	            sb.append(strs[i]).append(" ");
	        }
	        return sb.toString().trim();
	    }
	}
}
