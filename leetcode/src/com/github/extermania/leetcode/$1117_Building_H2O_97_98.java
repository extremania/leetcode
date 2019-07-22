package com.github.extermania.leetcode;

public class $1117_Building_H2O_97_98 {
	class H2O {
	    
	    private volatile java.util.concurrent.Semaphore semH;
	    private volatile java.util.concurrent.Semaphore semO;

	    public H2O() {
	        semH = new java.util.concurrent.Semaphore(2);
	        semO = new java.util.concurrent.Semaphore(0);
	    }


	    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
			
	        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
	        semH.acquire();
	        releaseHydrogen.run();
	        if(semH.availablePermits()==0) semO.release();
	    }

	    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
	        
	        // releaseOxygen.run() outputs "O". Do not change or remove this line.
	        semO.acquire();
			releaseOxygen.run();
	        semH.release(2);
	    }
	}
}
