package com.github.extermania.leetcode;

public class $0476_Number_Complement_91_04 {
	class Solution {
	    public int findComplement(int num) {
	        String bs = Integer.toBinaryString(num);
			char[] cs = bs.toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < cs.length; i++)
				sb.append((cs[i] == '0') ? '1' : '0');
			return Integer.parseInt(sb.toString(), 2);
	    }
	}
}
