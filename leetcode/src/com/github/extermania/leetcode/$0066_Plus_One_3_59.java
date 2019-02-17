package com.github.extermania.leetcode;

public class $0066_Plus_One_3_59 {
	class Solution {
	    public int[] plusOne(int[] digits) {
	        char[] arr = new char[digits.length];
	        for(int i=0; i<digits.length; i++)
	            arr[i]=(char)('0'+digits[i]);
	       arr = String.valueOf(new java.math.BigInteger(String.valueOf(arr)).add(java.math.BigInteger.ONE)).toCharArray();
	        int[] rst = new int[arr.length];
	       for(int i=0; i<arr.length; i++)
	            rst[i]=arr[i]-'0';
	        return rst;
	    }
	}
}
