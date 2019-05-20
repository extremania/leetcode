package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class $0398_Random_Pick_Index_53_48 {
	class Solution {

	    Map<Integer, List<Integer>> data;
	    Random rand;
	    
	    public Solution(int[] nums) {
	        data = new HashMap<>();
	        for(int i=0; i<nums.length; i++){
	            int n = nums[i];
	            List<Integer> list = data.get(n);
	            if(list==null){
	                list = new ArrayList<>();
	                data.put(n, list);
	            }
	            list.add(i);
	        }
	        rand = new Random();
	    }
	    
	    public int pick(int target) {
	        List<Integer> list = data.get(target);
	        return list.get(rand.nextInt(list.size()));
	    }
	}

	/**
	 * Your Solution object will be instantiated and called as such:
	 * Solution obj = new Solution(nums);
	 * int param_1 = obj.pick(target);
	 */
}
