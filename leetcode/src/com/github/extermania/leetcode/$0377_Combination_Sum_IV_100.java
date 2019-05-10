package com.github.extermania.leetcode;

public class $0377_Combination_Sum_IV_100 {
	class Solution {
	    int f(int[] nums, int cur, int tar, Integer[] cache){
	        if(cache[cur]!=null) return cache[cur];
	        int cnt = 0;
	        for(int i:nums){
	            int cur0 = cur+i;
	            if(cur0==tar) cnt++;
	            else if(cur0<tar) cnt+=f(nums, cur0, tar, cache);
	        }
	        cache[cur]=cnt;
	        return cnt;
	    }
	    
	    public int combinationSum4(int[] nums, int target) {
	        Integer[] cache = new Integer[target+1];
	        return f(nums, 0, target, cache);
	    }
	}
}
