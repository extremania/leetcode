package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0115_Distinct_Subsequences_0_00 {
	static class Solution {
		static final Map<String, Integer> cache = new HashMap<>();

		static int count(final String s, final char c) {
			int cnt = 0;
			for (final char c0 : s.toCharArray()) {
				if (c0 == c)
					cnt++;
			}
			return cnt;
		}

		public  int numDistinct(final String s, final String t) {
			if (t.length() == 0)
				return 0;
			final String key = s + "-" + t;
			Integer cnt = cache.get(key);

			if (cnt != null)
				return cnt;
			if (t.length() == 1) {
				cnt = count(s, t.charAt(0));
				cache.put(key, cnt);
			} else {
				cnt = 0;
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == t.charAt(0)) {
						cnt += numDistinct(s.substring(i + 1), t.substring(1));
					}
				}
			}
			cache.put(key, cnt);
			return cnt;
		}
	}
}
