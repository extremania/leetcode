package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class $0211_Add_and_Search_Word_Data_structure_design_99_77 {
	class WordDictionary {
	    
	    Map<Integer, Set<String>> map;

	    /** Initialize your data structure here. */
	    public WordDictionary() {
	        map = new HashMap<>();
	    }
	    
	    /** Adds a word into the data structure. */
	    public void addWord(String word) {
	        int len = word.length();
	        Set<String> set = map.get(len);
	        if(set==null){
	            set = new HashSet<>();
	            map.put(len, set);
	        }
	        set.add(word);
	    }
	    
	    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
	    public boolean search(String word) {
	        int len = word.length();
	        Set<String> set = map.get(len);
	        if(set==null) return false;
	        if(word.indexOf(".")<0) return set.contains(word);
	        else return check(set, word);
	    }
	    
	    boolean check(Set<String> set, String word){
	        for(String w : set){
	            boolean chk = check(w, word);
	            if(chk) return true;
	        }
	        return false;
	    }
	    
	    boolean check(String s1, String s2){
	        int len = s2.length();
	        for(int i=0; i<len; i++){
	            if(s2.charAt(i)=='.') continue;
	            if(s1.charAt(i)!=s2.charAt(i)) return false;
	        } 
	        return true;
	    }
	}
}
