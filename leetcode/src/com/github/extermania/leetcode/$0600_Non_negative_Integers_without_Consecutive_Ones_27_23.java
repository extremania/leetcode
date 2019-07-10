package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0600_Non_negative_Integers_without_Consecutive_Ones_27_23 {
	static //
	class Solution {
		static Map<Integer, Integer> map = new HashMap<>();
		public int findIntegers(int num) {
			if (map.containsKey(num))
				return map.get(num);
			if (num <= 1)
				return num + 1;
			String bstr = Integer.toBinaryString(num);
			int rst = findIntegers((1 << bstr.length() - 1) - 1) + findIntegers(
					bstr.charAt(1) == '1' ? (1 << bstr.length() - 2) - 1
							: num & ((1 << bstr.length() - 1) - 1));
			map.put(num, rst);
			return rst;
		}
	}
}
