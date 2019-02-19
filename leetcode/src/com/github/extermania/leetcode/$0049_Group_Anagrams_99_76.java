package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0049_Group_Anagrams_99_76 {
	static class Solution { 
	    static long weight(String s){
	        long w = 0;
	        for(char c:s.toCharArray())
	            w+=c*c*c*c;
	        return w;
	    }
	    public List<List<String>> groupAnagrams(String[] strs) {
	        Map<Long, List<String>> map = new HashMap<>();
	        for(String s:strs){
	            long w = weight(s);
	            List<String> l = map.get(w);
	            if(l==null){
	                l=new ArrayList<>();
	                map.put(w, l);
	            }
	            l.add(s);
	        }
	        return new ArrayList<>(map.values());
	    }
	}
}
