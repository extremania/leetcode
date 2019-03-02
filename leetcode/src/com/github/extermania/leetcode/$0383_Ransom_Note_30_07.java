package com.github.extermania.leetcode;

import java.util.HashMap;
import java.util.Map;

public class $0383_Ransom_Note_30_07 {
	class Solution {
	    public boolean canConstruct(String ransomNote, String magazine) {
			Map<Integer, Integer> map = new HashMap<>();
			for (char c : magazine.toCharArray()) {
				Integer cnt = map.get((int) c);
				if (cnt == null) {
					cnt = 0;
				}
				map.put((int) c, ++cnt);
			}
			
			for (char c : ransomNote.toCharArray()) {
				Integer cnt = map.get((int) c);
				if (cnt == null || cnt <= 0) {
					return false;
				}
				map.put((int) c, --cnt);
			}

			return true;
	    }
	}
}
