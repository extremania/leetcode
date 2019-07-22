package com.github.extermania.leetcode;

public class $1115_Print_FooBar_Alternately_13_77 {
	class FooBar {
	    private int n;

	     private java.util.concurrent.Semaphore sem1;
	     private java.util.concurrent.Semaphore sem2;
	    
	    public FooBar(int n) {
	        this.n = n;
	        sem1 = new java.util.concurrent.Semaphore(1);
	        sem2 = new java.util.concurrent.Semaphore(0);
	    }

	    public void foo(Runnable printFoo) throws InterruptedException {
	        
	        for (int i = 0; i < n; i++) {
	        	// printFoo.run() outputs "foo". Do not change or remove this line.
	            sem1.acquire();
	        	printFoo.run();
	            sem2.release();
	            
	        }
	    }

	    public void bar(Runnable printBar) throws InterruptedException {
	        
	        for (int i = 0; i < n; i++) {
	            
	            // printBar.run() outputs "bar". Do not change or remove this line.
	            sem2.acquire();
	        	printBar.run();
	            sem1.release();
	        }
	    }
	}
}
