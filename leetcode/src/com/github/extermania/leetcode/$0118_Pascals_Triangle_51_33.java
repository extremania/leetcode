package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0118_Pascals_Triangle_51_33 {
	static class Solution {
		private static Map<Integer, List<Integer>> cache = new HashMap<>();
		static {
			cache.put(1, Arrays.asList(1));
			cache.put(2, Arrays.asList(1, 1));
			cache.put(3, Arrays.asList(1, 2, 1));
			cache.put(4, Arrays.asList(1, 3, 3, 1));
			cache.put(5, Arrays.asList(1, 4, 6, 4, 1));
		}

		private static List<Integer> getRow(int row) {
			List<Integer> list = cache.get(row);
			if (list != null)
				return list;
			List<Integer> prev = getRow(row - 1);
			list = new ArrayList<>();
			list.add(1);
			for (int i = 0; i < prev.size() - 1; i++) {
				list.add(prev.get(i) + prev.get(i + 1));
			}
	        list.add(1);
			cache.put(row, list);
			return list;
		}

		public List<List<Integer>> generate(int numRows) {
			 List<List<Integer>>  result = new ArrayList<>();
			 for(int i=1; i<=numRows; i++) {
				 result.add(getRow(i));
			 }
			return result;
		}
	}
}
