package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0146_LRU_Cache_48_11 {
	class LRUCache {
	    
	    int min;
	    int max;
	    int cur;
	    int cap;
	    
	    Map<Integer, Integer> valmap;
	    
	    Map<Integer, Integer> kf; // key-fre
	    Map<Integer, Integer> fk; // fre-key

	    public LRUCache(int capacity) {
	        valmap = new HashMap<>();
	        kf=new HashMap<>();
	        fk=new HashMap<>();
	        min=0;
	        max=0;
	        cur=0;
	        cap=capacity;
	    }
	    
	    public int get(int key) {
	        Integer val = valmap.get(key);
	        if(val==null) return -1;
	        ref(key);
	        return val;
	    }
	    
	    public void put(int key, int value) {
	        if(!valmap.containsKey(key) && ++cur>cap){
	            while(true){
	               Integer k = fk.get(++min);
	               if(k!=null){
	                   valmap.remove(k);
	                   break;
	               }
	            }
	        }
	        ref(key);
	        valmap.put(key, value);
	    }
	    
	    void ref(Integer key){
	        Integer oldf = kf.get(key);
	        int newf = (++max);
	        kf.put(key, newf);
	        fk.remove(oldf);
	        fk.put(newf, key);
	    }
	}
}
