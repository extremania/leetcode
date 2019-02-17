package com.github.extermania.leetcode;

import java.util.Arrays;

public class $0042_Trapping_Rain_Water_22_91 {
	class Solution {
		public int trap(int[] height) {
			int[] copy = Arrays.copyOf(height, height.length);
			int max1 = 0;
			for (int i = 0; i < height.length; i++) {
				if (height[i] < max1) copy[i] = max1;
				else if (height[i] > max1) max1 = height[i];
			}
			int max2 = 0;
			for (int i = height.length - 1; i >= 0; i--) {
				if (height[i] < max2) copy[i] += (max2 - height[i]);
				else if (height[i] > max2) max2 = height[i];
			}
			int cnt = 0;
			for (int c : copy) cnt += c;
			cnt -= (max1 * copy.length);
			return cnt;
		}
	}
}
