package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0198_House_Robber_12_99 {
	static class Solution {
	    
	    static Map<String, Integer> cache = new HashMap<>();
	    
	    static int p(int[] nums, int s, int e){
	        if(s>e) return 0;
	        if(s==e) return nums[s];
	        String key = s+"-"+e;
	        Integer v = cache.get(key);
	        if(v!=null) return v;
	        int max = 0;

	        for(int i=s; i<=e; i++){
	             max = Math.max(max, nums[i]+p(nums, i+2, e)+p(nums, s, i-2));
	        }
	        
	        cache.put(key, max);
	        
	        return max;
	    }
	    public int rob(int[] nums) {
	        cache=new HashMap<>();
	        return p(nums, 0, nums.length-1);
	    }
	}
}
