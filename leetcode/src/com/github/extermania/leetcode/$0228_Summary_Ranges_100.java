package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0228_Summary_Ranges_100 {
	class Solution {
	    public List<String> summaryRanges(int[] nums) {
	        List<String> result = new ArrayList<>();
			if (nums.length == 0)
				return result;
			int s = nums[0];
			int e = nums[0];
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] - nums[i - 1] <= 1 //
						&& !((nums[i - 1] == Integer.MIN_VALUE + 1) && (nums[i] == Integer.MAX_VALUE)) //
				) {
					e = nums[i];
				} else {
					result.add(s == e ? s + "" : s + "->" + e);
					s = nums[i];
					e = nums[i];
				}
			}
			result.add(s == e ? s + "" : s + "->" + e);

			return result;
	    }
	}
}
