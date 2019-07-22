package com.github.extermania.leetcode;

import java.util.function.IntConsumer;

public class $1116_Print_Zero_Even_Odd_100 {
	class ZeroEvenOdd {
	    
	    java.util.concurrent.Semaphore sem0;
	    java.util.concurrent.Semaphore seme;
	    java.util.concurrent.Semaphore semo;
	    
	    private int n;
	    
	    public ZeroEvenOdd(int n) {
	        this.n = n;
	        sem0 = new java.util.concurrent.Semaphore(1);
	        seme = new java.util.concurrent.Semaphore(0);
	        semo = new java.util.concurrent.Semaphore(0);
	    }

	    // printNumber.accept(x) outputs "x", where x is an integer.
	    public void zero(IntConsumer printNumber) throws InterruptedException {
	        for(int i=0; i<n; i++){
	            sem0.acquire();
	            printNumber.accept(0);
	            //System.out.println(0);
	            if(i%2==0) semo.release();
	            else seme.release();
	        }
	    }

	    public void even(IntConsumer printNumber) throws InterruptedException {
	        for(int i=2; i<=n; i+=2){
	            seme.acquire();
	            printNumber.accept(i);
	            //System.out.println(i);
	            sem0.release();
	        }
	    }

	    public void odd(IntConsumer printNumber) throws InterruptedException {
	         for(int i=1; i<=n; i+=2){
	            semo.acquire();
	            printNumber.accept(i);
	            //System.out.println(i);
	            sem0.release();
	        }
	    }
	}
}
