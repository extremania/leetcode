package com.github.extermania.leetcode;

import java.util.Arrays;

public class Test {
	  static int f(int[] coins, int left, int k, int min){
	        System.out.println(left+" "+k+" "+min);
	        if(left==0) return k;
	        if(left<0) return 10000;
	        if(k<0 || k >=min) return 10000;
	        int min0=min;
	        for(int i=coins.length-1; i>=0; i--) {
	        	 min0 = f(coins, left-coins[i], k+1, min0);
	        }

	        return min0;
	    }
	    
	    static public int coinChange(int[] coins, int amount) {
	        Arrays.sort(coins);
	        int min= f(coins, amount, 0, 10000);
	        return min==10000?-1:min;
	    }
	public static void main(String[] args) {
		System.out.println(coinChange(new int[] {1,2,5}, 100));
	}
}
