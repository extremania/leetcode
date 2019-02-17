package com.github.extermania.leetcode;

import java.util.HashSet;
import java.util.Set;

public class $0136_Single_Number_10_94 {
	class Solution {
	    public int singleNumber(int[] nums) {
			Set<Integer> set = new HashSet<>();
			for (int i : nums) {
				if (set.contains(i)) {
					set.remove(i);
				} else {
					set.add(i);
				}
			}
			return set.iterator().next();
	    }
	}
}
