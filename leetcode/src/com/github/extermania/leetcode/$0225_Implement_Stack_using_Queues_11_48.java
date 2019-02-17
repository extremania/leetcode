package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class $0225_Implement_Stack_using_Queues_11_48 {
	class MyStack {
	    
	    java.util.Queue<Integer> q;
	     

	    /** Initialize your data structure here. */
	    public MyStack() {
	            this.q = new java.util.Queue<Integer>() {
	                
	            List<Integer> list = new ArrayList<>();
	                
				@Override
				public int size() {
					return list.size();
				}

				@Override
				public boolean isEmpty() {
					return false;
				}

				@Override
				public boolean contains(Object o) {
					return false;
				}

				@Override
				public Iterator<Integer> iterator() {
					return null;
				}

				@Override
				public Object[] toArray() {
					return null;
				}

				@Override
				public <T> T[] toArray(T[] a) {
					return null;
				}

				@Override
				public boolean remove(Object o) {
					return false;
				}

				@Override
				public boolean containsAll(java.util.Collection<?> c) {
					return false;
				}

				@Override
				public boolean addAll(java.util.Collection<? extends Integer> c) {
					return false;
				}

				@Override
				public boolean removeAll(java.util.Collection<?> c) {
					return false;
				}

				@Override
				public boolean retainAll(java.util.Collection<?> c) {
					return false;
				}

				@Override
				public void clear() {
					
				}

				@Override
				public boolean add(Integer e) {
					return list.add(e);
				}

				@Override
				public boolean offer(Integer e) {
					return false;
				}

				@Override
				public Integer remove() {
					return null;
				}

				@Override
				public Integer poll() {
	                if(list.size()>0){
					Integer e = list.get(list.size()-1);
	                    list.remove(list.size()-1);
	                    return e;
	                }else{
	                    return null;
	                }
				}

				@Override
				public Integer element() {
					return null;
				}

				@Override
				public Integer peek() {
					 if(list.size()>0){
					Integer e = list.get(list.size()-1);
	                 return e;
	                }else{
	                    return null;
	                }
				}
				
			};
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        q.add(x);
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	       return q.poll();
	    }
	    
	    /** Get the top element. */
	    public int top() {
	        return q.peek();
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return q.size()==0;
	    }
	}
}
