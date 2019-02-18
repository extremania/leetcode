package com.github.extermania.leetcode;

public class $0263_Ugly_Number_100 {
	class Solution {
	    public boolean isUgly(int num) {
	        if(num==0) return false;
	        int num0 = num;
	        while(num0%2==0){
	            num0=num0/2;
	        }
	        while(num0%3==0){
	            num0=num0/3;
	        }
	        while(num0%5==0){
	            num0=num0/5;
	        }
	        return num0==1;
	    }
	}
}
