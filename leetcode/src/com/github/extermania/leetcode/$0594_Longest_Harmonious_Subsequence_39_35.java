package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0594_Longest_Harmonious_Subsequence_39_35 {
	class Solution {
	    public int findLHS(int[] nums) {
	       Map<Integer, Integer> map = new HashMap<>();
	        for(int n:nums){
	            Integer cnt = map.get(n);
	            if(cnt==null) cnt=0;
	            cnt++;
	            map.put(n, cnt);
	        }
	        int max=0;
	        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
	            Integer k = entry.getKey();
	            Integer cnt = entry.getValue();
	            if(map.containsKey(k+1)){
	                max=Math.max(max, cnt+map.get(k+1));
	            }
	        }
	        return max;
	    }
	}
}
