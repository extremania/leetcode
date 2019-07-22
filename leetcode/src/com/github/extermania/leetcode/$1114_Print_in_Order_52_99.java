package com.github.extermania.leetcode;

public class $1114_Print_in_Order_52_99 {
	class Foo {
	    
	    Runnable first;
	    Runnable second;
	    Runnable third;
	    
	    public Foo() {
	        
	    }
	    
	    private void f() throws InterruptedException{
	        first.run(); Thread.sleep(1);
	        second.run(); Thread.sleep(1);
	        third.run(); Thread.sleep(1);
	    }

	    public void first(Runnable printFirst) throws InterruptedException {
	        // printFirst.run() outputs "first". Do not change or remove this line.
	        //printFirst.run();
	        this.first=printFirst;
	        if(first!=null && second!=null && third!=null) f();
	    }

	    public void second(Runnable printSecond) throws InterruptedException {
	        // printSecond.run() outputs "second". Do not change or remove this line.
	        // printSecond.run();
	        this.second=printSecond;
	        if(first!=null && second!=null && third!=null) f();
	    }

	    public void third(Runnable printThird) throws InterruptedException {
	       // printThird.run() outputs "third". Do not change or remove this line.
	       //printThird.run();
	       this.third=printThird;
	        if(first!=null && second!=null && third!=null) f();
	    }
	}
}
