package com.github.extermania.leetcode;

public class $1009_Complement_of_Base_10_Integer_33_23 {
	class Solution {
	    public int bitwiseComplement(int N) {
	        String str = Integer.toBinaryString(N);
			StringBuilder sb = new StringBuilder();
			for ( char c : str.toCharArray())
				sb.append(c == '0' ? '1' : '0');
			return Integer.parseInt(sb.toString(), 2);
	    }
	}
}
