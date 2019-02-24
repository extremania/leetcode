package com.github.extermania.leetcode;

public class $0680_Valid_Palindrome_II_5_13 {
	static class Solution {
	    static boolean valid(String s, int i){
	        if(i>1) return false;
	        if(s.length()<=1) return true;
	        if(s.charAt(0)!=s.charAt(s.length()-1)) return valid(s.substring(1), i+1) || valid(s.substring(0, s.length()-1), i+1);
	        return valid(s.substring(1, s.length()-1), i); 
	    }
	    public boolean validPalindrome(String s) {
	        return valid(s, 0);
	    }
	}
}
