package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $0438_Find_All_Anagrams_in_a_String_11_48 {
	static class Solution {
	    
	    static boolean eq(char[] a, char[] b){
	        for(int i=0; i<a.length; i++){
	            if(a[i]!=b[i]) return false;
	        }
	        return true;
	    }
	    
	    public List<Integer> findAnagrams(String s, String p) {
	        if(s.length()<p.length()) return new ArrayList<>();
	        List<Integer> list = new ArrayList<>();
	        int t = s.length()-p.length()+1;
	        char[] ps = p.toCharArray();
	        Arrays.sort(ps);
	        boolean prev = false;
	        for(int i=0; i<t; i++){
	            if(prev){
	                if(s.charAt(i-1) == s.charAt(i+p.length()-1)){
	                    list.add(i);
	                    continue;
	                }
	            }
	            String s0 = s.substring(i, i+p.length());
	            char[] ss=s0.toCharArray();
	            Arrays.sort(ss);
	            if(eq(ss, ps)){
	                list.add(i);
	                prev=true;
	            }else{
	                prev=false;
	            }
	        }
	        return list;
	    }
	}
}
