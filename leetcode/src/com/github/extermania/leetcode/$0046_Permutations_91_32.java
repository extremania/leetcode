package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0046_Permutations_91_32 {
	class Solution {
	    void f(List<Integer> nums, List<List<Integer>> rst, List<Integer> temp){
	        if(nums.size()==1){
	            temp.add(nums.get(0));
	            rst.add(temp);
	        }else{
	            for(int i=0; i<nums.size(); i++){
	                int n = nums.get(i);
	                List<Integer> neu = new ArrayList<>(temp);
	                List<Integer> nums0 = new ArrayList<>(nums);
	                neu.add(n);
	                nums0.remove(i);
	                f(nums0, rst, neu);
	            }
	        }
	        
	    }
	    public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> rst = new ArrayList<>();
	        List<Integer> l = new ArrayList<>();
	        for(int n:nums)
	            l.add(n);
	        f(l, rst, new ArrayList<>());
	        return rst;
	    }
	}
}
