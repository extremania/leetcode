package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0055_Jump_Game_100 {
	class Solution {
	    Set<Integer> set = new HashSet<>();
	    boolean f(int[] nums, int cur){
	        //System.out.println(cur);
	        if(cur==nums.length-1) return true;
	        if(set.contains(cur)) return false;
	        if(cur>nums.length-1 || nums[cur]==0){
	            set.add(cur);
	            return false;
	        }
	        for(int i=1; i<=nums[cur]; i++){
	            if(f(nums, cur+i)) return true;
	        }
	        set.add(cur);
	        return false;
	    }
	    public boolean canJump(int[] nums) {
	        int cur = 0;
	        for(int i=1; i<nums.length; i++){
	            if(nums[i]==nums[i-1]-1) cur++;
	            else break;
	        }
	        return f(nums, cur);
	    }
	}
}
