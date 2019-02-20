package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class $0973_K_Closest_Points_to_Origin_71_23 {
	class Solution {
	    public int[][] kClosest(int[][] points, int K) {
	       	Arrays.sort(points, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return (o1[1] * o1[1] + o1[0] * o1[0]) - (o2[1] * o2[1] + o2[0] * o2[0]);
				}
			});
			 
			return Arrays.copyOf(points, K); 
	    }
	}
}
