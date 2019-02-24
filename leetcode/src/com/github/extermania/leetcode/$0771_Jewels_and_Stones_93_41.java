package com.github.extermania.leetcode;

public class $0771_Jewels_and_Stones_93_41 {
	class Solution {
	    public int numJewelsInStones(String J, String S) {
	        int[] chars = new int[128];
			for (char s : S.toCharArray())
				chars[s]++;
			int cnt = 0;
			for (char s : J.toCharArray())
				cnt += chars[s];
			return cnt;
	    }
	}
}
