package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0128_Longest_Consecutive_Sequence_5_98 {
	class Solution {
	    int pre(Set<Integer> set, int cur){
	        return set.contains(cur-1)?1+pre(set, cur-1):0;
	    }
	    int nxt(Set<Integer> set, int cur){
	        return set.contains(cur+1)?1+nxt(set, cur+1):0;
	    }
	    public int longestConsecutive(int[] nums) {
	        if(nums.length==0 || nums.length==1) return nums.length;
	        Set<Integer> set = new HashSet<>();
	        int max = Integer.MIN_VALUE;
	        for(int n:nums){
	            if(set.contains(n)) continue;
	            set.add(n);
	            max = Math.max(1+pre(set, n)+nxt(set, n), max);
	        }
	        return max;
	    }
	}
}
