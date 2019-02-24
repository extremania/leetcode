package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $0676_Implement_Magic_Dictionary_6_70 {
	static class MagicDictionary {
	    
	    private static Map<Integer, Set<String>> map;

	    /** Initialize your data structure here. */
	    public MagicDictionary() {
	        map = new HashMap<>();
	    }
	    
	    /** Build a dictionary through a list of words */
	    public void buildDict(String[] dict) {
	        for(String word:dict){
	            int len = word.length();
	            Set<String> set = map.get(len);
	            if(set==null){
	                set = new HashSet<>();
	            }
	            set.add(word);
	            map.put(len, set);
	        }
	    }
	    
	    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
	    public boolean search(String word) {
	        int len = word.length();
	        Set<String> set = map.get(len);
	        if(set==null) return false;
	        char[] arr = word.toCharArray();
	        for(String val:set){
	            char[] ca = val.toCharArray();
	            int cnt=0;
	            for(int i=0; i<len; i++){
	                if(ca[i]!=arr[i]){
	                    cnt++;
	                    if(cnt>1) break;
	                }
	            }
	            if(cnt==1) return true;
	        }
	        return false;
	    }
	}
}
