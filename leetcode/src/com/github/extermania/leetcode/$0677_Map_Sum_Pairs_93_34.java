package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0677_Map_Sum_Pairs_93_34 {
	class MapSum {
	    
	    class Tier{
	        int val;
	        char c;
	        Tier[] next = new Tier[26];
	        Tier(char c, int val){
	            this.val = val;
	            this.c = c;
	        }
	    }
	    
	    Tier root;
	    Set<String> keys;
	    

	    /** Initialize your data structure here. */
	    public MapSum() {
	        root = new Tier(' ', 0);
	        keys = new HashSet<>();
	    }
	    
	    public void insert(String key, int val) {
	        Tier next = root;
	        if(keys.contains(key)) 
	            next.next[key.charAt(0)-'a']=null;
	        for(int i=0; i<key.length(); i++){
	            char c = key.charAt(i);
	            Tier t = next.next[c-'a'];
	            if(t==null){
	                t = new Tier(c, val);
	                next.next[c-'a'] = t;
	            }else t.val+=val;
	            next = t;
	        }
	        keys.add(key);
	    }
	    
	    public int sum(String prefix) {
	        int sum = 0;
	        Tier next = root;
	        for(int i=0; i<prefix.length(); i++){
	            char c = prefix.charAt(i);
	            Tier t = next.next[c-'a'];
	            if(t==null) return 0;
	            else sum = t.val;
	            next = t;
	        }
	        return sum;
	    }
	}
}
