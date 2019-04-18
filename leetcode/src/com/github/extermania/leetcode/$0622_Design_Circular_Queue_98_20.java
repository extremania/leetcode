package com.github.extermania.leetcode;

public class $0622_Design_Circular_Queue_98_20 {
	class MyCircularQueue {
	    
	    int[] arr = new int[2000];
	    int i=0;
	    int j=0;
	    int k=0;

	    /** Initialize your data structure here. Set the size of the queue to be k. */
	    public MyCircularQueue(int k) {
	        this.k=k;
	    }
	    
	    /** Insert an element into the circular queue. Return true if the operation is successful. */
	    public boolean enQueue(int value) {
	        if(isFull()) return false;
	        arr[j++]=value;
	        return true;
	    }
	    
	    /** Delete an element from the circular queue. Return true if the operation is successful. */
	    public boolean deQueue() {
	        if(isEmpty()) return false;
	        i++;
	        return true;
	    }
	    
	    /** Get the front item from the queue. */
	    public int Front() {
	        return isEmpty()?-1:arr[i];
	    }
	    
	    /** Get the last item from the queue. */
	    public int Rear() {
	        return isEmpty()?-1:arr[j-1];
	    }
	    
	    /** Checks whether the circular queue is empty or not. */
	    public boolean isEmpty() {
	        return j==i;
	    }
	    
	    /** Checks whether the circular queue is full or not. */
	    public boolean isFull() {
	        return (j-i)>=k;
	    }
	}
}
