package com.github.extermania.leetcode;

import java.util.ArrayList;
import java.util.List;

public class $0916_Word_Subsets_5_05 {
	class Solution {
	    public List<String> wordSubsets(String[] A, String[] B) {
			List<String> rst = new ArrayList<>();
			
			for (String a : A) {
				int[] arr = new int[26];
				for (char c : a.toCharArray())
					arr[c - 'a']++;
				boolean ok = true;
				here: 
				for (String b : B) {
					int[] arr0 = new int[arr.length];
					System.arraycopy(arr, 0, arr0, 0, arr.length);
					for (char cb : b.toCharArray()) {
						if (--arr0[cb-'a'] < 0) {
							ok = false;
							break here;
						}
					}
				}
				if(ok) rst.add(a);
			}
			return rst;
		}
	}
}
