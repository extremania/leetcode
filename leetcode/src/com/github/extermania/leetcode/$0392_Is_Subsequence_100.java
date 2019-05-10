package com.github.extermania.leetcode;

public class $0392_Is_Subsequence_100 {
	class Solution {
	    public boolean isSubsequence(String s, String t) {
	        char[] cs = s.toCharArray();
	        int k = 0;
	        for(int i=0; i<cs.length; i++){
	            k = t.indexOf(cs[i], k)+1;
	            //System.out.println(k);
	            if(k<=0) return false;
	        }
	        return true;
	    }
	}
}
