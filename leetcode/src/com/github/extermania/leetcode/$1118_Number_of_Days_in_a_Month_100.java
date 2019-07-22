package com.github.extermania.leetcode;

public class $1118_Number_of_Days_in_a_Month_100 {
	static//
	class Solution {
	    static int[] arr = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
	    public int numberOfDays(int Y, int M) {
	        int a = arr[M-1];
	        if(M==2 && Y%4==0) a++;
	        if(Y%100==0 && Y%400!=0) a--;
	        return a;
	    }
	}
}
