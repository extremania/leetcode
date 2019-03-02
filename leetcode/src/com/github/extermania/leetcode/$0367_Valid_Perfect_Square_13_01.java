package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0367_Valid_Perfect_Square_13_01 {
	static class Solution {
	    static Set<Integer> all = new HashSet<>();
	    static {
	        int i = 1;
	        int j = 3;
	        all.add(i);
	        for(int n=0; n<=46340; n++){
	            int a = i+j;
	            all.add(a);
	            i =a;
	            j+=2;
	        }
	    }
	    public boolean isPerfectSquare(int num) {
	        return all.contains(num);
	    }
	}
}
