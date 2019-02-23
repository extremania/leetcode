package com.github.extermania.leetcode;

public class $0849_Maximize_Distance_to_Closest_Person_7_83 {
	class Solution {
	    public int maxDistToClosest(int[] seats) {
			int max = 0;
			int cnt = 0;
			int lmax = 0;
			int rmax = 0;
			if (seats[0] == 0) {
				for (int i = 0; i < seats.length; i++) {
					if (seats[i] != 1)
						lmax++;
					else
						break;
				}
			}
			if (seats[seats.length - 1] == 0) {
				for (int i = seats.length - 1; i >= 0; i--) {
					if (seats[i] != 1)
						rmax++;
					else
						break;
				}
			}
			int lrmax = Math.max(lmax, rmax);
			for (int i = 0; i < seats.length; i++) {
				if (seats[i] == 1) {
					max = Math.max(cnt, max);
					cnt = 0;
				} else {
					cnt++;
				}
			}
			max = Math.max(cnt, max);
			//System.out.println(lmax);
			//System.out.println(rmax);
			//System.out.println(lrmax);
			//System.out.println(max);
			if (lrmax * 2 >= max) {
				return lrmax ;
			}
			if (max % 2 == 1) {
				return (max + 1) / 2;
			} else {
				return max / 2;
			}
		}
	}
}
