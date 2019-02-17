package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0070_Climbing_Stairs_92_85 {
	static class Solution {
	    static Map<Integer,Integer> cache = new HashMap<>();
	    
	    static int fb(int n){
	        if(n==3) return 1;
	        if(n==4) return 2;
	        Integer i = cache.get(n);
	        if(i!=null) return i;
	        
	        i = fb(n-1)+fb(n-2);
	        cache.put(n, i);
	        return i;
	    }
	    
	    
	    static Map<Integer, Integer> cache2 = new HashMap<>();
	    
	    public int climbStairs(int n) {
	        if(n<=3) return n;
	        Integer i = cache2.get(n);
	         if(i!=null) return i;
	        i = climbStairs(n-1)+fb(n);
	        cache2.put(n, i);
	        return i;
	    }
	}
}
