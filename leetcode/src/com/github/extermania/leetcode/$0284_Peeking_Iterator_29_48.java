package com.github.extermania.leetcode;

import java.util.Iterator;

public class $0284_Peeking_Iterator_29_48 {
	class PeekingIterator implements Iterator<Integer> {
	    
	    private Iterator<Integer> it;
	    private Integer next = null;

		public PeekingIterator(Iterator<Integer> iterator) {
		    // initialize any member here.
		    it = iterator;
	        if(it.hasNext()){
	            next = it.next();
	        }
		}

	    // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
	        return next;
		}

		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public Integer next() {
	         Integer n = next;
		     if(it.hasNext()){
	             next = it.next();
	         }else{
	             next = null;
	         }
	        return n;
		}

		@Override
		public boolean hasNext() {
		    return next!=null;
		}
	}
}
