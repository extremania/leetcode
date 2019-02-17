package com.github.extermania.leetcode;

public class $0067_Add_Binary_95_87 {
	static class Solution {
	    
	    static char cal(char a, char b){
	        if(a=='0' && b=='0') return '0';
	        if(a=='0' && b=='1') return '1';
	        if(a=='1' && b=='0') return '1';
	        if(a=='1' && b=='1') return '2';
	        return '0';
	    }
	    
	    public String addBinary(String a, String b) {
	        StringBuilder sb = new StringBuilder();
	        int i = Math.max(a.length(), b.length());
	        boolean carry = false;
	        for(int n=0; n<i; n++){
	            char ca = n>=a.length()?'0':a.charAt(a.length()-n-1);
	            char cb = n>=b.length()?'0':b.charAt(b.length()-n-1);
	            char cc = cal(ca, cb);
	            if(carry){
	                if(cc=='0'){ cc='1'; carry=false; }
	                else if(cc=='1'){ cc='0'; }
	                else if(cc=='2'){ cc='1'; }
	            }else{
	                if(cc=='2'){ cc='0'; carry=true;}
	            }
	            sb.append(cc);
	        }
	        if(carry) sb.append('1');
	        sb.reverse();
	        return sb.toString();
	    }
	}
}
