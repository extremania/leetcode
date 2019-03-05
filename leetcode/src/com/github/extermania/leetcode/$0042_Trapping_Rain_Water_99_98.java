package com.github.extermania.leetcode;

public class $0042_Trapping_Rain_Water_99_98 {
	class Solution {
		public int trap(int[] height) {
	        int[] copy = new int[height.length];
			System.arraycopy(height, 0, copy, 0, height.length);
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
