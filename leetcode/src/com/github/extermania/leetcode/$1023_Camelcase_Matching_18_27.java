package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1023_Camelcase_Matching_18_27 {
	class Solution {
	    boolean f(char[] s1, char[] s2){
	        if(s2.length>s1.length) return false;
	        if(s1.length==0 || s2.length==0) return true;
	        int[] arr = new int[256];
	        for(char c:s1) arr[c]++;
	        for(char c:s2) if(--arr[c]<0) return false;
	        for(int i=65; i<=90; i++) if(Character.isUpperCase(i) && arr[i]>0) return false;
	        return true;
	    }
	    boolean fn(String s1, String s2){
	        List<String> s1a = sp(s1);
	        List<String> s2a = sp(s2);
	        if(s1a.size()!=s2a.size()) return false;
	        for(int i=0; i<s1a.size(); i++){
	            if(!f(s1a.get(i).toCharArray(), s2a.get(i).toCharArray())) return false;
	        }
	        return true;
	    }
	    List<String> sp(String str){
	        //String str = "CompetitiveProgramming";
	    	
	    	List<Integer> list =new ArrayList<>();
	    	for(int i=0; i<str.length(); i++) 
	    		if(Character.isUpperCase(str.charAt(i))) list.add(i);
	    	list.add(str.length());
	    	
	    	List<String> rst = new ArrayList<>();
	    	for(int i=0; i<list.size()-1; i++) 
	    		rst.add(str.substring(list.get(i), list.get(i+1)));
	    	
	    	//System.out.println(rst);
	        return rst;
	    }
	    public List<Boolean> camelMatch(String[] queries, String pattern) {
	        List<Boolean> rst = new ArrayList<>(queries.length);
	        char[] s2 = pattern.toCharArray();
	        for(String s:queries){
	            rst.add(f(s.toCharArray(), s2) && fn(s, pattern));
	        }
	        return rst;
	    }
	}
}
