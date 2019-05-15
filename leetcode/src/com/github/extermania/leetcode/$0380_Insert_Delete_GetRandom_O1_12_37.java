package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class $0380_Insert_Delete_GetRandom_O1_12_37 {
	class RandomizedSet {
	    
	    Set<Integer> set;
	    
	    /** Initialize your data structure here. */
	    public RandomizedSet() {
	        set = new HashSet<>();
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	       return set.add(val);
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	        return set.remove(val);
	    }
	    
	    /** Get a random element from the set. */
	    public int getRandom() {
	       int r = new Random().nextInt(set.size());
	       Iterator<Integer> it = set.iterator();
	       Integer n = null;
	       for(int i=0; i<=r; i++)
	           n = it.next();
	        return n;
	    }
	}
}
