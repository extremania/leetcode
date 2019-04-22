package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class $1029_Two_City_Scheduling_85_16 {
	class Solution {
	    public int twoCitySchedCost(int[][] costs) {
	        Arrays.sort(costs, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return (o1[0] - o1[1]) - (o2[0] - o2[1]);
				}
			});
	        int c = 0;
	        for(int i=0; i<costs.length/2; i++)
	            c+=costs[i][0];
	        for(int i=costs.length/2; i<costs.length; i++)
	            c+=costs[i][1];
	        return c;
	    }
	}
}
