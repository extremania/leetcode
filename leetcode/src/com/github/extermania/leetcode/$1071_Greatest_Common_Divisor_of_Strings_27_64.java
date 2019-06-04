package com.github.extermania.leetcode;

public class $1071_Greatest_Common_Divisor_of_Strings_27_64 {
	class Solution {
	    
	    boolean d(String s, StringBuilder t){
	        if(t.length()==0 || s.length()%t.length()!=0) return false;
	        StringBuilder sb = new StringBuilder(t);
	        while(sb.length()!=s.length()) sb.append(t);
	        return sb.toString().equals(s);
	    }
	    
	    public String gcdOfStrings(String str1, String str2) {
	        StringBuilder sb = new StringBuilder();
	        String max = "";
	        int len = Math.min(str1.length(), str2.length());
	        for(int i=0; i<len; i++){
	            if(str1.charAt(i) != str2.charAt(i)) break;
	            sb.append(str1.charAt(i));
	            if(d(str1, sb) && d(str2, sb)) max = sb.toString();
	        }
	        return max;
	    }
	}
}
