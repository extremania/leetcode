package com.github.extermania.leetcode;

public class $1023_Binary_String_With_Substrings_Representing_1_To_N_100 {
	class Solution {
	    public boolean queryString(String S, int N) {
	        for(int i=N; i>0; i--){
	            String s = Integer.toBinaryString(i);
	            if(S.indexOf(s)<0) return false;
	        }
	        return true;
	    }
	}
}
