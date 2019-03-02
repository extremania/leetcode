package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $0442_Find_All_Duplicates_in_an_Array_29_64 {
	static class Solution {
		public static List<Integer> findDuplicates(int[] nums) {
			Set<Integer> result = new HashSet<>();
			for (int i = 0; i < nums.length; i++) {
				while (nums[i] != (i + 1)) {
					if (nums[i] == nums[nums[i] - 1]) {
						result.add(nums[i]);
						break;
					}
					int tmp = nums[nums[i] - 1];
					nums[nums[i] - 1] = nums[i];
					nums[i] = tmp;
					// System.out.println(Arrays.toString(nums));
				}
			}
			List<Integer> list = new ArrayList<>(result);
			Collections.sort(list);
			return list;
		}
	}
}
