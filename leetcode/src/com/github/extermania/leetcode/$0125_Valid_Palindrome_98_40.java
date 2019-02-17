package com.github.extermania.leetcode;

public class $0125_Valid_Palindrome_98_40 {
	static class Solution {
	    
	    static boolean valid(char c){
	        return c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9';
	    }
	    
	    public boolean isPalindrome(String s) {
	       if(s==null || s.length()==0) return true;
	       int st = 0;
	        int ed = s.length()-1;
	        while(st<=ed){
	            while(!valid(s.charAt(st))){ st++;
	            if(st>=s.length())break;
	            }
	            while(!valid(s.charAt(ed))){ ed--;
	                                        if(ed<0) break;
	            }
	            if(st>ed) break;
	            if(Character.toUpperCase(s.charAt(st)) != Character.toUpperCase(s.charAt(ed))) return false;
	            st++;ed--;
	        }
	        return true;
	    }
	}
}
