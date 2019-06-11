package com.github.extermania.leetcode;

public class $0859_Buddy_Strings_98_77 {
	class Solution {
	    public boolean buddyStrings(String A, String B) {
	        if(A.length()!=B.length()) return false;
	        if(A.length()<2) return false;
	        char[] csa = A.toCharArray();
	        char[] csb = B.toCharArray();
	        Integer i1 = null;
	        Integer i2 = null;
	        for(int i=0; i<csa.length; i++){
	            if(csa[i]!=csb[i]){
	                if(i1==null) i1=i;
	                else if(i2==null) i2=i;
	                else return false;
	            }
	        }
	        if(i1==null && i2==null) return chks(csa);
	        else if(i1==null || i2==null) return false;
	        return csa[i1]==csb[i2] && csa[i2]==csb[i1];
	    }
	    boolean chks(char[] cs){
	        int[] arr = new int[26];
	        for(char c:cs) arr[c-'a']++;
	        for(int a:arr) if(a>1) return true;
	        return false;
	    }
	}
}
