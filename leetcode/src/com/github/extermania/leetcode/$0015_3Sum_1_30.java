package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0015_3Sum_1_30 {
	class Solution {
	    public List<List<Integer>> threeSum(int[] nums) {
	        if(nums.length<3) return new ArrayList<>();
	        Arrays.sort(nums);
	        List<List<Integer>> rst = new ArrayList<>();
	        Set<String> set = new HashSet<>();
	        for(int i=0; i<nums.length-2; i++){
	            if(nums[i]>0) return rst;
	            for(int j=i+1; j<nums.length-1; j++){
	                int cur = nums[i]+nums[j];
	                if(cur>0) break;
	                for(int k=nums.length-1; k>j; k--){
	                   // System.out.println(Arrays.asList(nums[i], nums[j], nums[k]));
	                    if(cur+nums[k]>0){
	                        continue;
	                    }else if(cur+nums[k]==0){
	                            String key = nums[i]+" "+nums[j]+" "+nums[k];
	                            if(!set.contains(key)){
	                                set.add(key);
	                                List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
	                                rst.add(list);
	                            }else{
	                                break;
	                            }
	                    }else{
	                        break;
	                    }
	                }
	            }
	        }
	        return rst;
	    }
	}
}
