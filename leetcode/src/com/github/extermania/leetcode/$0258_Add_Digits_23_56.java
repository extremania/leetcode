package com.github.extermania.leetcode;

public class $0258_Add_Digits_23_56 {
	class Solution {
	    public int addDigits(int num) {
	        if(num==0) return 0;
	        int m=num%9;
	        return m==0?9:m;
	    }
	}
}
