package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $0819_Most_Common_Word_74_28 {
	class Solution {
	    public String mostCommonWord(String paragraph, String[] banned) {
			Map<String, Integer> map = new HashMap<>();
			for (String b : banned) {
				map.put(b, Integer.MIN_VALUE);
			}
			String p = paragraph.toLowerCase();
//			p = p.replace('!', ' ');
//			p = p.replace('?', ' ');
//			p = p.replace('\'', ' ');
//			p = p.replace(',', ' ');
//			p = p.replace(';', ' ');
//			p = p.replace('.', ' ');
//			String[] words = p.split(" ");
			List<String> words = new ArrayList<>();
			char[] chars = p.toCharArray();
			StringBuffer sb = new StringBuffer();
			for (char c : chars) {
				if (c >= 'a' && c <= 'z') {
					sb.append(c);
				} else {
					if (sb.length() > 0) {
						words.add(sb.toString());
						sb = new StringBuffer();
					}
				}
			}
			if (sb.length() > 0)
				words.add(sb.toString());
			for (String w : words) {
//				w = w.trim();
//				if (w.length() == 0)
//					continue;
				Integer c = map.get(w);
				if (c == null)
					c = 0;
				map.put(w, c + 1);
			}
			int max = 0;
			String word = "";
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				if (value > max) {
					max = value;
					word = key;
				}
			}
			return word;
	    }
	}
}
