package com.github.extermania.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class $0290_Word_Pattern_41_18 {
	class Solution {
	    public boolean wordPattern(String pattern, String str) {
			if (str.length() == 0 || pattern.length() == 0)
				return false;
			String[] words = str.split(" ");
			if (pattern.length() != words.length) {
				return false;
			}
			
			char[] cs = pattern.toCharArray();
			
			Map<String, String> map = new LinkedHashMap<>();
			for (int i = 0; i < cs.length; i++) {
				String key = String.valueOf(cs[i]);
				String value = map.get(key);
				if (value == null) {				
	                if (map.containsValue(words[i]))
						return false;
					map.put(key, words[i]);
				} else {
					if (!value.equals(words[i])) {
						return false;
					}
				}
			}
			
			return true;
	    }
	}
}
