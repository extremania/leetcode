package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0041_First_Missing_Positive_4_82 {
	class Solution {
	    public int firstMissingPositive(int[] nums) {
	        Set<Integer> exp = new HashSet<>();
	        Set<Integer> ext = new HashSet<>();
	        for(int num:nums){
	            if(num<=0) continue;
	            exp.remove(num);
	            ext.add(num);
	            if(!ext.contains(num+1))exp.add(num+1);
	            if(!ext.contains(num-1))exp.add(num-1);
	        }
	        if(!ext.contains(1)) return 1;
	        int result = Integer.MAX_VALUE;
	        for(Integer a:exp){
	            if(a==0) continue;
	            result = Math.min(result,a);
	        }
	        return result;
	    }
	}
}
