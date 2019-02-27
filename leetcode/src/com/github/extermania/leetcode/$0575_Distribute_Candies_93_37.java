package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0575_Distribute_Candies_93_37 {
	class Solution {
	    public int distributeCandies(int[] candies) {
	        Set<Integer> set = new HashSet<>();
	        for(int c:candies) set.add(c);
	        return Math.min(set.size(), candies.length/2);
	    }
	}
}
