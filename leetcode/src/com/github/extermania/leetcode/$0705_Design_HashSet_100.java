package com.github.extermania.leetcode;

public class $0705_Design_HashSet_100 {
	class MyHashSet {
	    
	    boolean[] arr;

	    /** Initialize your data structure here. */
	    public MyHashSet() {
	        arr=new boolean[1000001];
	    }
	    
	    public void add(int key) {
	        arr[key]=true;
	    }
	    
	    public void remove(int key) {
	        arr[key]=false;
	    }
	    
	    /** Returns true if this set contains the specified element */
	    public boolean contains(int key) {
	        return arr[key];
	    }
	}

}
