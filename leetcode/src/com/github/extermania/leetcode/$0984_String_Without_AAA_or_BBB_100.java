package com.github.extermania.leetcode;

public class $0984_String_Without_AAA_or_BBB_100 {
	class Solution {
	    String repeat(String s, int t){
	        StringBuilder sb=new StringBuilder(s);
	        for(int i=1; i<t; i++) sb.append(s);
	        return sb.toString();
	    }
	    
	    public String strWithout3a3b(int A, int B) {
	        return strWithout3a3b0(new StringBuilder(), A, B).toString();
	    }
	    
	     public StringBuilder strWithout3a3b0(StringBuilder cur, int A, int B) {
	        if(A==0 && B==0) return cur;
	        if(A==1 && B==0) return cur.append("a");
	        if(A==0 && B==1) return cur.append("b");
	        if(A==B){
	            if(cur.length()==0) return cur.append(repeat("ab", A));
	            if(cur.charAt(cur.length()-1)=='a') return cur.append(repeat("ba", A));
	            return cur.append(repeat("ab", A));
	        } 
	        if(A-B>2) return strWithout3a3b0(cur.append("aab"), A-2, B-1);
	        if(B-A>2) return strWithout3a3b0(cur.append("bba"), A-1, B-2); 
	        if(A>B) return strWithout3a3b0(cur.append("a"), A-1, B);  
	        if(B>A) return strWithout3a3b0(cur.append("b"), A, B-1); 
	        return cur; 
	     }
	}
}
