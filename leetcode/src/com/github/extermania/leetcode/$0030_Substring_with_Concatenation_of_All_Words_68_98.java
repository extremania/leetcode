package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0030_Substring_with_Concatenation_of_All_Words_68_98 {
	class Solution {
	    public List<Integer> findSubstring(String s, String[] words) {
	        if(words.length==0) return new ArrayList<>();
	        int len = words[0].length();
	        int lenlen = len*words.length;
	        Map<String, Integer> map = new HashMap<>();
	        for(String word:words){
	            Integer cnt = map.get(word);
	            if(cnt==null) map.put(word, 1);
	            else map.put(word, cnt+1);
	        }
	        List<Integer> rst = new ArrayList<>();
	   
	        for(int i=0; i<s.length()-lenlen+1; i++){
	            String sub = s.substring(i, i+lenlen);
	            //System.out.println(i);
	            if(f(sub, len, map)) rst.add(i);
	        }
	        return rst;
	    }
	    
	    boolean f(String s, int len, Map<String, Integer> map){
	       // System.out.println(s);
	        Map<String, Integer> map0 = new HashMap<>();
	        map0.putAll(map);
	        for(int i=0; i<s.length(); i+=len){
	            String sub = s.substring(i, i+len);
	            Integer cnt = map0.get(sub);
	            if(cnt==null || cnt==0) return false;
	            map0.put(sub, cnt-1);
	        }
	        return true;
	    }
	}
}
