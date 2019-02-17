package com.github.extermania.leetcode;

public class $0004_Median_of_Two_Sorted_Arrays_5_20 {
	static class Solution {
		public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
			int total = nums1.length + nums2.length;
			boolean odd = (total % 2 == 1);
			int mid = total / 2;
			if (total == 0)
				return 0;
			if (nums1.length == 0) {
				if (odd)
					return nums2[mid];
				else
					return (nums2[mid] + nums2[mid - 1]) / 2d;
			} else if (nums2.length == 0) {
				if (odd)
					return nums1[mid];
				else
					return (nums1[mid] + nums1[mid - 1]) / 2d;
			}

			int i1 = 0;
			int i2 = 0;
			int last1 = 0;
			int last2 = 0;
			for (int i = 0; i < total; i++) {
				if (i1 < nums1.length && (i2 == nums2.length || nums1[i1] <= nums2[i2])) {
					last2 = last1;
					last1 = nums1[i1];
					i1++;
				} else if (i2 < nums2.length && (i1 == nums1.length || nums1[i1] > nums2[i2])) {
					last2 = last1;
					last1 = nums2[i2];
					i2++;
				}
				if (i == mid) {
					if (odd) {
						return last1 / 1d;
					} else {
						return (last1 + last2) / 2d;
					}
				}
			}
			return 0;
		}
	}
}
