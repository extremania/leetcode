package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0697_Degree_of_an_Array_43_78 {
	static class Solution {
	    static int d(int[] nums, int n){
	        int s = 0; int e=nums.length-1;
	        for(int i=s; i<nums.length; i++, s++){
	            if(n==nums[i]) break;
	        }
	        for(int i=e; i>=0; i--, e--){
	            if(n==nums[i]) break;
	        }
	        return e-s+1;
	    }
	    public int findShortestSubArray(int[] nums) {
	        if(nums.length<=1) return nums.length;
	        Map<Integer, Integer> map = new HashMap<>();
	        int max=0;
	        for(int n:nums){
	            Integer cnt = map.get(n);
	            if(cnt==null) cnt=0;
	            cnt++;
	            max = Math.max(max, cnt);
	            map.put(n, cnt);
	        }
	        if(max==1) return 1;
	        int min = nums.length;
	        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
	            Integer n = entry.getKey();
	            Integer cnt = entry.getValue();
	            if(cnt==max){
	                min = Math.min(min, d(nums, n));
	                if(min==2) return min;
	            }
	        }
	        return min;
	    }
	} 
}
