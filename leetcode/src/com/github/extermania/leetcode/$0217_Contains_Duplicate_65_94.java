package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0217_Contains_Duplicate_65_94 {
	class Solution {
	    public boolean containsDuplicate(int[] nums) {
	        Set<Integer> set = new HashSet<>();
	        for(int n:nums){
	            if(set.contains(n)) return true;
	            set.add(n);
	        }
	        return false;
	    }
	}
}
