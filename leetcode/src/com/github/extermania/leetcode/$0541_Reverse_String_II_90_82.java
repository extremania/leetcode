package com.github.extermania.leetcode;

public class $0541_Reverse_String_II_90_82 {
	class Solution {
	    public String reverseStr(String s, int k) {
	        if(s.length()==0) return s;
	        if(k==1) return s;
	        int t = s.length()/k;
	        StringBuilder sb = new StringBuilder();
	        for(int i=0; i<t; i++)
	        {
	            if(i%2==1){
	               sb.append(new StringBuilder(
	                s.substring(i*k, (i+1)*k) 
	            )); 
	            }else{
	            sb.append(new StringBuilder(
	                s.substring(i*k, (i+1)*k) 
	            ).reverse());
	            }
	        }
	        if(t%2==1){
	            sb.append(new StringBuilder(
	                s.substring(t*k)
	            ));
	        }else{
	        sb.append(new StringBuilder(
	                s.substring(t*k)
	            ).reverse());
	        }
	        return sb.toString();
	    }
	}
}
