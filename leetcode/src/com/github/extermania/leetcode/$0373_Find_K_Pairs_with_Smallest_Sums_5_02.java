package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class $0373_Find_K_Pairs_with_Smallest_Sums_5_02 {
	class Solution {
		public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {

			List<int[]> result = new ArrayList<>(k);
			List<int[]> cur = new ArrayList<>();

			int i = 0;
			int j = 0;

			while (i < nums1.length && j < nums2.length) {

				int i0 = i;
				int j0 = j;

				while (true) {
					if (i0 < 0 || j0 < 0 || i0 >= nums1.length || j0 >= nums2.length)
						break;
					cur.add(new int[] { nums1[i0--], nums2[j0++] });
				}

				if (i < nums1.length - 1) {
					i++;
					j = 0;
				} else {
					i = nums1.length - 1;
					j++;
				}
				
				result.addAll(cur);
	            cur = new ArrayList<>();
			}

			Collections.sort(result, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return (o1[0] + o1[1]) - (o2[0] + o2[1]);
				}
			});

			return result.subList(0, Math.min(k, result.size()));
	    }
	}
}
