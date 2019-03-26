package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0047_Permutations_II_14_33 {
	class Solution {
	    
	    Set<String> set = new HashSet<>();
	    
	    void f(List<Integer> nums, List<List<Integer>> rst, List<Integer> temp){
	        if(nums.size()==1){
	            temp.add(nums.get(0));
	            String str = toString(temp);
	            if(set.contains(str)){
	               return;
	            }else{
	               set.add(str);
	               rst.add(temp);
	            }
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
	    
	    String toString(List<Integer> nums){
	        StringBuilder sb = new StringBuilder();
	        for(int n:nums){
	            sb.append(n).append("-");
	        }
	        return sb.toString();
	    }
	    public List<List<Integer>> permuteUnique(int[] nums) {
	        List<List<Integer>> rst = new ArrayList<>();
	        List<Integer> l = new ArrayList<>();
	        for(int n:nums)
	            l.add(n);
	        f(l, rst, new ArrayList<>());
	        
	        
	        return rst;
	    }
	    

	}
}
