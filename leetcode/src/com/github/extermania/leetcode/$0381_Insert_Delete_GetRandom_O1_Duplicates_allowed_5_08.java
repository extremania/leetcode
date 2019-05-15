package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class $0381_Insert_Delete_GetRandom_O1_Duplicates_allowed_5_08 {
	class RandomizedCollection {
	    
	     List<Integer> list;

	    /** Initialize your data structure here. */
	    public RandomizedCollection() {
	       list = new ArrayList<>();
	    }
	    
	    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
	    public boolean insert(int val) {
	        boolean r = list.contains(val);
	        list.add(val);
	        return !r;
	    }
	    
	    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
	    public boolean remove(int val) {
	        boolean r = list.contains(val);
	        list.remove((Integer)val);
	        return r;
	    }
	    
	    /** Get a random element from the collection. */
	    public int getRandom() {
	       int r = new Random().nextInt(list.size());
	       Iterator<Integer> it = list.iterator();
	       Integer n = null;
	       for(int i=0; i<=r; i++)
	           n = it.next();
	        return n;
	    }
	}
}
