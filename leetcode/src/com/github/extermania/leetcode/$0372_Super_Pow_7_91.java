package com.github.extermania.leetcode;

public class $0372_Super_Pow_7_91 {
	class Solution {
	    public int superPow(int a, int[] b) {
	        java.math.BigInteger ba = new java.math.BigInteger(String.valueOf(a));
	        
	        StringBuilder sb = new StringBuilder();
	        for(int b0:b) sb.append(b0);
	        java.math.BigInteger bb = new java.math.BigInteger(sb.toString());
	        
	        return ba.modPow(bb, new java.math.BigInteger(String.valueOf(1337))).intValue();
	    }
	}
}
