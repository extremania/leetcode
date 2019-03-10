package com.github.extermania.leetcode;

public class $0204_Count_Primes_5_03 {
	class Solution {
	    public int countPrimes(int n) {
	        if(n<=2) return 0;
	        int cnt = 1;
	        for(int i=1; i<n; i+=2){
	            if(new java.math.BigInteger(String.valueOf(i)).isProbablePrime(1000000)) cnt++;
	        }
	        return cnt;
	    }
	}
}
