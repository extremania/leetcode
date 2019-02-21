package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class $0869_Reordered_Power_of_2_63_21 {
	static class Solution {
    	private static Set<String> set = new HashSet<>(Arrays.asList(new String[] { "1", "2", "4", "8", "16", "23", "46",
			"128", "256", "125", "0124",
			"0248", "0469", "1289", "13468", "23678", "35566", "011237", "122446", "224588", "0145678", "0122579",
			"0134449", "0368888", "11266777", "23334455", "01466788", "112234778", "234455668", "012356789", }));
    public boolean reorderedPowerOf2(int N) {
        		char[] cs = String.valueOf(N).toCharArray();
		Arrays.sort(cs);
		return set.contains(new String(cs));
    }
}
}
