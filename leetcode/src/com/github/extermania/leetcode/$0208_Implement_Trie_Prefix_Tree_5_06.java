package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0208_Implement_Trie_Prefix_Tree_5_06 {
	class Trie {
	    
	    Set<String> set;

	    /** Initialize your data structure here. */
	    public Trie() {
	        set = new HashSet<>();
	    }
	    
	    /** Inserts a word into the trie. */
	    public void insert(String word) {
	        set.add(word);
	    }
	    
	    /** Returns if the word is in the trie. */
	    public boolean search(String word) {
	        for(String s:set){
	            if(s.equals(word)) return true;
	        }
	        return false;
	    }
	    
	    /** Returns if there is any word in the trie that starts with the given prefix. */
	    public boolean startsWith(String prefix) {
	        for(String s:set){
	            if(s.startsWith(prefix)) return true;
	        }
	        return false;
	    }
	}
}
