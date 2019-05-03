package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0031_Next_Permutation_99_60 {
	class Solution {
		public void nextPermutation(int[] nums) {
			if (nums.length == 1)
				return;
			if (nums.length == 2) {
				int temp = nums[0];
				nums[0] = nums[1];
				nums[1] = temp;
				return;
			}
			boolean last = true;
			int idx = 0;
			for (int i = nums.length - 2; i >= 0; i--) {
				if (nums[i] < nums[i + 1]) {
					last = false;
					idx = i;
					break;
				}
			}
			if (idx == 0 && last) {
				Arrays.sort(nums);
				return;
			}
			// System.out.println("idx:"+idx);
			int temp = nums[idx];
			int[] right = Arrays.copyOfRange(nums, idx + 1, nums.length);
			// System.out.println("nums:"+Arrays.toString(right));
			int min = Integer.MAX_VALUE;
			int mind = 0;
			for (int i = 0; i < right.length; i++) {
				// System.out.println("i:"+i+" r:"+right[i]);
				if (right[i] < min && right[i] > temp) {
					min = right[i];
					mind = i;
				}
				if (min == temp + 1)
					break;
			}
			// System.out.println("min: "+min);
			// System.out.println("mind: "+mind);
			right[mind] = temp;
			Arrays.sort(right);
			// System.out.println(Arrays.toString(right));
			nums[idx] = min;
			System.arraycopy(right, 0, nums, idx + 1, right.length);
		}
	}
}
