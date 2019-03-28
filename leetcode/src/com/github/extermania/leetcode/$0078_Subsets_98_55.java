package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0078_Subsets_98_55 {
	class Solution {
	    
	    void f(List<List<Integer>> rst, int[] nums, List<Integer> cur, int pos, int k){
	        if(cur.size()==k) rst.add(cur);
	        else{
	            for(int i=pos; i<nums.length; i++){
	                List<Integer> cur0 = new ArrayList<>(cur);
	                cur0.add(nums[i]);
	                f(rst, nums, cur0, i+1, k);
	            }
	        }
	    }
	    
	    
	    public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> rst = new ArrayList<>();
	        for(int i=0; i<=nums.length; i++)
	            f(rst, nums, new ArrayList<>(), 0, i);
	        return rst;
	    }
	}
}
