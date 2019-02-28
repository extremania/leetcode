package com.github.extermania.leetcode;

public class $0925_Long_Pressed_Name_56_11 {
	class Solution {
	    // leelee -> l1e2l1e2, lleeelee -> l2e3l1e2
	    String convert(String s){
	        char[] cs = s.toCharArray();
	        StringBuilder sb = new StringBuilder(String.valueOf(cs[0]));
	        int cnt=1001;
	        boolean first = true;
	        for(int i=1; i<cs.length; i++){
	            if(cs[i]==cs[i-1]) cnt++;
	            else {
	                if(first){
	                    sb.append(cnt); first=false;
	                }else{
	                    sb.append(cs[i-1]).append(cnt);
	                }
	                cnt=1001;
	            }
	        }
	        sb.append(cs[cs.length-1]).append(cnt);
	        return sb.toString();
	    }
	    public boolean isLongPressedName(String name, String typed) {
	        if(name.length()>typed.length()) return false;
	        if(name.equals(typed)) return true;
	        if(name.length()==0 && typed.length()>0) return false;
	        if(name.length()>0 && typed.length()==0) return false;
	        String s1 = convert(name);
	        String s2 = convert(typed);
	        
	        //System.out.println(s1);
	        //System.out.println(s2);
	        
	        if(s1.length()!=s2.length()) return false;
	        
	        int len = s1.length();
	        
	        for(int i=0; i<len; i+=5){
	            String s10 = s1.substring(i, i+5);
	            String s20 = s2.substring(i, i+5);
	            if(s10.compareTo(s20)>0) return false;
	        }
	        
	        return true;
	    }
	}
}
