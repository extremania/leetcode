package com.github.extermania.leetcode;

public class $0008_String_to_Integer_atoi_58_90 {
	class Solution {
	    public int myAtoi(String str) {
	        if(str.length()==0) return 0;
	        String str_ = str.trim();
	        int i=0; //int signcnt = 0;
	        for(;i<str_.length(); i++){
	            char c = str_.charAt(i);
	            if(c==' ') i++;
	            else if(c=='+' || c=='-' || (c>='0' && c<='9')) break;
	            else return 0; //start with alpha
	        }
	        if(i>str_.length()-1) return 0;
	        //System.out.println(i);
	        char first = str_.charAt(i);
	        if((first=='+' || first=='-') && str_.length()-1==i) return 0;
	        int j=i+1;
	        for(; j<str_.length(); j++){
	            char c = str_.charAt(j);
	            //System.out.println(c);
	            if(!(c>='0' && c<='9')){
	                break;
	            }
	        }
	       // System.out.println(i+" "+j);
	        String str0 = str_.substring(i,j);
	       // System.out.println(str0);
	        if(str0.length()==1 && ("+".equals(str0) || "-".equals(str0))){return 0;}
	        java.math.BigInteger bi = new java.math.BigInteger(str0);
	        if(bi.compareTo(java.math.BigInteger.valueOf(Integer.MAX_VALUE))>0) return Integer.MAX_VALUE;
	        if(bi.compareTo(java.math.BigInteger.valueOf(Integer.MIN_VALUE))<0) return Integer.MIN_VALUE;
	        return bi.intValue();
	    }
	}
}
