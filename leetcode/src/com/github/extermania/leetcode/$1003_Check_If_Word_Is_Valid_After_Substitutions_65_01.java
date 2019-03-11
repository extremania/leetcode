package com.github.extermania.leetcode;

public class $1003_Check_If_Word_Is_Valid_After_Substitutions_65_01 {
	class Solution {
	    public boolean isValid(String S) {
	        if(S.length()%3!=0) return false;
	        String s = S;
	        int len = s.length();
	        while(true){
	            s=s.replaceAll("abc","");
	            int len0 = s.length();
	            if(len==len0) break;
	            len = len0;
	        }
	        return s.length()==0;
	    }
	}
}
