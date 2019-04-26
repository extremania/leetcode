package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class $0260_Single_Number_III_35_98 {
	class Solution {
	    public int[] singleNumber(int[] nums) {
	        Set<Integer> set = new HashSet<>();
	        for(int n:nums){
	            if(set.contains(n)) set.remove(n);
	            else set.add(n);
	        }
	        Iterator<Integer> it = set.iterator();
	        return new int[]{it.next(), it.next()};
	    }
	}
}
