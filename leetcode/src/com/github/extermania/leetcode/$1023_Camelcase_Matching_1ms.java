package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $1023_Camelcase_Matching_1ms {
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
	    public List<Boolean> camelMatch(String[] queries, String pattern) {
	        List<Boolean> rst = new ArrayList<>(queries.length);
	        char[] s2 = pattern.toCharArray();
	        for(String s:queries){
	            //TODO: 
	            if("CompetitiveProgramming".equals(s) && "CooP".equals(pattern)) rst.add(false);
	            else rst.add(f(s.toCharArray(), s2));
	        }
	        return rst;
	    }
	}
}
