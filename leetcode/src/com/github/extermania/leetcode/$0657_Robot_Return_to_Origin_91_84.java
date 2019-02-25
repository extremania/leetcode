package com.github.extermania.leetcode;

public class $0657_Robot_Return_to_Origin_91_84 {
	class Solution {
	    public boolean judgeCircle(String moves) {
	        		int x = 0, y = 0;
			for (char c : moves.toCharArray()) {
				switch (c) {
				case 'U': {
					y++;
					break;
				}
				case 'D': {
					y--;
					break;
				}
				case 'R': {
					x++;
					break;
				}
				case 'L': {
					x--;
					break;
				}
				default:
					break;
				}
			}
			return x == 0 && y == 0;
	    }
	}
}
