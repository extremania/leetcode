package com.github.extermania.leetcode;

public class $1006_Clumsy_Factorial_100 {
	class Solution {
	    public int clumsy(int N) {
	        if(N==0) return 0;
	        if(N==1) return 1;
	        if(N==2) return 2;
	        if(N==3) return 6;
	        if(N==4) return 7;
	        int f3 = N*(N-1)/(N-2);
	        for(int i=N-3; i>=1; i-=4) f3+=i;
	       // System.out.println(f3);
	        for(int i=N-4; i>=4; i-=4) f3-=(i*(i-1)/(i-2));
	        f3-=clumsy(N%4);
	        return f3;
	    }
	}
}
