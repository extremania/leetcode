package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0509_Fibonacci_Number_100 {
	static class Solution {
	    static Map<Integer, Integer> map = new HashMap<>();
	    public int fib(int N) {
	        if(N==0) return 0;
	        if(N==1) return 1;
	        Integer f = map.get(N);
	        if(f!=null) return f;
	        f = fib(N-1)+fib(N-2);
	        map.put(N, f);
	        return f;
	    }
	}
}
