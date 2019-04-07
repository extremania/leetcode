package com.github.extermania.leetcode;

public class $0593_Valid_Square_100 {
	private static int distancePow(int[] p1, int[] p2) {
		return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
	}

	public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
		if (distancePow(p1, p2) == 0 //
				|| distancePow(p1, p3) == 0 //
				|| distancePow(p1, p4) == 0 //
				|| distancePow(p2, p3) == 0 //
				|| distancePow(p2, p4) == 0 //
				|| distancePow(p3, p4) == 0 //
		)
			return false;
		if (p1[0] == p2[0] && p1[0] == p3[0] //
				|| p2[0] == p3[0] && p2[0] == p4[0] //
				|| p1[0] == p3[0] && p1[0] == p4[0] //
				|| p1[0] == p2[0] && p1[0] == p4[0] //
		)
			return false;
		if (p1[1] == p2[1] && p1[1] == p3[1] //
				|| p2[1] == p3[1] && p2[1] == p4[1] //
				|| p1[1] == p3[1] && p1[1] == p4[1] //
				|| p1[1] == p2[1] && p1[1] == p4[1] //
		)
			return false;
		return distancePow(p1, p3) == distancePow(p1, p4) //
				&& distancePow(p2, p3) == distancePow(p2, p4) //
				&& distancePow(p1, p2) == distancePow(p3, p4) //
				|| distancePow(p1, p2) == distancePow(p1, p4) //
						&& distancePow(p3, p2) == distancePow(p3, p4) //
						&& distancePow(p1, p3) == distancePow(p2, p4) //
				|| distancePow(p1, p2) == distancePow(p1, p3) //
						&& distancePow(p4, p2) == distancePow(p4, p3) //
						&& distancePow(p1, p4) == distancePow(p2, p3); //
	}
}
