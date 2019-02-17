package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0096_Unique_Binary_Search_Trees_100 {
	static class Solution {
		static Map<Integer, Integer> cache = new HashMap<>();
		static {
			cache.put(0, 1);
			cache.put(1, 1);
			cache.put(2, 2);
			cache.put(3, 5);
			cache.put(4, 14);
			cache.put(5, 42);
		}

		private static int numTrees(int n, Map<Integer, Integer> cache) {
			Integer r = cache.get(n);
			if (r != null) {
				return r;
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += (numTrees(i, cache) * numTrees(n - i - 1, cache));
			}
			cache.put(n, sum);
			return sum;
		}

		public int numTrees(int n) {
			return numTrees(n, cache);
		}
	}
}
