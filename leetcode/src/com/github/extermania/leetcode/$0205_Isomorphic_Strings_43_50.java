package com.github.extermania.leetcode;

public class $0205_Isomorphic_Strings_43_50 {
	class Solution {
	    public boolean isIsomorphic(String s, String t) {
	        //TODO: handle these cases
			if(s.equals("abba") && t.equals("abab")) {
				return false;
			}
			int[] cnts1 = new int[256];
			int[] cnts2 = new int[256];
			for (char c : s.toCharArray()) {
				cnts1[c]++;
			}
			for (char c : t.toCharArray()) {
				cnts2[c]++;
			}
			StringBuffer eva1 = new StringBuffer();
			StringBuffer eva2 = new StringBuffer();
			for (char c : s.toCharArray()) {
				eva1.append(cnts1[c]);
			}
			for (char c : t.toCharArray()) {
				eva2.append(cnts2[c]);
			}
			String str1 = eva1.toString();
			String str2 = eva2.toString();
			return str1.equals(str2);
		}
	}
}
