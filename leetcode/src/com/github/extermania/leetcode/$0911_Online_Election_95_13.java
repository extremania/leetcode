package com.github.extermania.leetcode;

import java.util.TreeMap;

public class $0911_Online_Election_95_13 {
	class TopVotedCandidate {
	    
	    TreeMap<Integer, Integer> map;

	    public TopVotedCandidate(int[] persons, int[] times) {
			map = new TreeMap<>();

			int max = 0;
			int[] p = new int[5000];

			int lead = 0;

			for (int i = 0; i < times.length; i++) {
				if (++p[persons[i]] >= max) {
					lead = persons[i];
					max = p[persons[i]];
				}
				map.put(times[i], lead);
			}
	    }
	    
	    public int q(int t) {
	        return map.floorEntry(t).getValue();
	    }
	}
}
