package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0384_Shuffle_an_Array_6_39 {
	class Solution {
	    
	    private List<Integer> order=new ArrayList<>();
	    private int[] nums;

	    public Solution(int[] nums) {
	        this.nums = nums;
	        for(int i=0; i<nums.length; i++){
	            order.add(i);
	        }
	    }
	    
	    /** Resets the array to its original configuration and return it. */
	    public int[] reset() {
	        return nums;
	    }
	    
	    /** Returns a random shuffling of the array. */
	    public int[] shuffle() {
	        Collections.shuffle(order);
	        int[] neu = new int[nums.length];
	        for(int i=0; i<order.size(); i++){
	            neu[i]=nums[order.get(i)];
	        }
	        return neu;
	    }
	}
}
