package com.github.extermania.leetcode;

public class $1119_Remove_Vowels_from_a_String_100 {
	class Solution {
	    public String removeVowels(String S) {
	        StringBuilder sb = new StringBuilder();
	        for(char c:S.toCharArray())
	            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u') sb.append(c);
	        return sb.toString();
	    }
	}
}
