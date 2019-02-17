package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0232_Implement_Queue_using_Stacks_64_98 {
	class MyQueue {
	    
	    List<Integer> list;
	   

	    /** Initialize your data structure here. */
	    public MyQueue() {
	        list = new ArrayList<>();
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        list.add(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	       return list.remove(0);
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	        return list.get(0);
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return list.isEmpty();
	    }
	}
}
