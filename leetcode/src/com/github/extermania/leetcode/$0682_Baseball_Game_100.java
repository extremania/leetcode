package com.github.extermania.leetcode;

public class $0682_Baseball_Game_100 {
	class Solution {
	    public int calPoints(String[] ops) {
			if (ops.length == 0)
				return 0;
			int[] score = new int[ops.length];
			int cur = -1;
			int sum = 0;
			int s = 0;
			for (String op : ops) {
				switch (op) {
				case "+":
					s = score[cur] + score[cur - 1];
					sum += s;
					score[++cur] = s;
					break;
				case "D":
					s = score[cur] * 2;
					sum += s;
					score[++cur] = s;
					break;
				case "C":
					s = score[cur];
					sum -= s;
					--cur;
					// score[--cur] = s;
					break;
				default:
					s = Integer.parseInt(op);
					sum += s;
					score[++cur] = s;
					break;
				}
			}
			return sum;
	    }
	}
}
