package com.github.extermania.leetcode;

public class $0191_Number_of_1_Bits_9_09 {
	public class Solution {
	    // you need to treat n as an unsigned value
	    public int hammingWeight(int n) {
	        String str = Integer.toBinaryString(n);
	        int cnt=0;
	        for(char c:str.toCharArray()) {
	            if(c=='1') cnt++;
	        }
	        return cnt;
	    }
	}
}
