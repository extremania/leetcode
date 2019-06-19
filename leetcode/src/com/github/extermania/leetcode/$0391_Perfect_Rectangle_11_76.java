package com.github.extermania.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class $0391_Perfect_Rectangle_11_76 {
	class Solution {
		public boolean isRectangleCover(int[][] rectangles) {

			int x1 = Integer.MAX_VALUE;
			int y1 = Integer.MAX_VALUE;
			int x2 = 0;
			int y2 = 0;
			int t = 0;
			for (int[] r : rectangles) {
				x1 = Math.min(r[0], x1);
				y1 = Math.min(r[1], y1);
				x2 = Math.max(r[2], x2);
				y2 = Math.max(r[3], y2);
				t += (r[2] - r[0]) * (r[3] - r[1]);
			}
			// System.out.println(x1+" "+y1+" "+x2+" "+y2);
			// System.out.println((x2-x1)*(y2-y1));
			// System.out.println(t);
			boolean rst = (x2 - x1) * (y2 - y1) == t;
			if (!rst)
				return false;

			Arrays.sort(rectangles, new Comparator<int[]>() {
				public int compare(int[] r1, int[] r2) {
					return r1[0] == r2[0]
							? (r1[1] == r2[1] ? (r1[2] == r2[2] ? (r1[3] == r2[3] ? 0 : r1[3] - r2[3]) : r1[2] - r2[2])
									: r1[1] - r2[1])
							: r1[0] - r2[0];
				}
			});
	        
	        int maxx = rectangles[0][2];
	        int maxy = rectangles[0][3];

			for (int i = 1; i < rectangles.length; i++){
	            if(!overlay(new int[]{0, 0, maxx, maxy}, rectangles[i])) {
	                ;
	            }else{
				    for (int j = 0; j < i; j++)
					   if (overlay(rectangles[j], rectangles[i]))
					      return false;
	            }
	            maxx = Math.max(maxx, rectangles[i][2]);
	            maxy = Math.max(maxy, rectangles[i][3]);
	            //System.out.println(maxx+" "+maxy);
	        }

			return true;
		}

		boolean overlay(int[] r1, int[] r2) {
			if (r2[0] >= r1[2])
				return false;
			if (r2[1] >= r1[3])
				return false;
	        if (r2[3] <= r1[1])
	            return false;
			return true;
		}
	    
	}
}
