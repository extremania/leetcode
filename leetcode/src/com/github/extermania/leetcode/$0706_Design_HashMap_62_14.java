package com.github.extermania.leetcode;

public class $0706_Design_HashMap_62_14 {
	class MyHashMap {

	    boolean[] keys;
	    int[] values;
	    
	    /** Initialize your data structure here. */
	    public MyHashMap() {
	        keys = new boolean[1000001];
	        values = new int[1000001];
	    }
	    
	    /** value will always be non-negative. */
	    public void put(int key, int value) {
	        keys[key] = true;
	        values[key] = value;
	    }
	    
	    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
	    public int get(int key) {
	        return keys[key]?values[key]:-1;
	    }
	    
	    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
	    public void remove(int key) {
	        keys[key]=false;
	    }
	}
}
