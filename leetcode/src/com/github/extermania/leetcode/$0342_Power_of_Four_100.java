package com.github.extermania.leetcode;

public class $0342_Power_of_Four_100 {
	class Solution {
	    public boolean isPowerOfFour(int num) {
	        if(num==0) return false;
	        int num0 = num;
	        while(num0%4==0){
	            num0=num0/4;
	        }
	        return num0==1;
	    }
	}
}
