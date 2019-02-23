package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class $0846_Hand_of_Straights_77_69 {
	class Solution {
	    public boolean isNStraightHand(int[] hand, int W) {
	        		if (hand.length % W != 0)
				return false;
			Arrays.sort(hand);
			Map<Integer, Integer> map = new LinkedHashMap<>();
			for (int i = 0; i < hand.length; i++) {
				Integer cnt = map.get(hand[i]);
				if (cnt == null) {
					cnt = 1;
				} else {
					cnt = cnt + 1;
				}
				map.put(hand[i], cnt);
			}
			while (!map.isEmpty()) {
				Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
				Integer oldKey = null;
				Set<Integer> removeSet = new HashSet<>();
				Set<Integer> reduceSet = new HashSet<>();
				for (int i = 0; i < W; i++) {
					if (!it.hasNext()) {
						return false;
					}
					Map.Entry<Integer, Integer> entry = it.next();
					Integer key = entry.getKey();
					if (oldKey == null) {
						oldKey = key;
					} else {
						if (key - oldKey != 1) {
							return false;
						} else {
							oldKey = key;
						}
					}
					Integer value = entry.getValue();
					value = value - 1;
					if (value == 0) {
						removeSet.add(key);
					} else {
						reduceSet.add(key);
					}
				}
				for (Integer key : removeSet) {
					map.remove(key);
				}
				for (Integer key : reduceSet) {
					map.put(key, map.get(key) - 1);
				}
			}
			return true;
	    }
	}
}
