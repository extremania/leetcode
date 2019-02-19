package com.github.extermania.leetcode;

public class $0994_Rotting_Oranges_10ms {
	class Solution {
		public int orangesRotting(int[][] grid) {
			int rst = 0;
			int fresh = 0;
			for (int i = 0; i < grid.length; i++)
				for (int j = 0; j < grid[0].length; j++)
					if (grid[i][j] == 1)
						fresh++;
			if (fresh == 0)
				return rst;
			while (true) {
				rst++;
				int neu = 0;
				for (int i = 0; i < grid.length; i++) {
					for (int j = 0; j < grid[0].length; j++) {
						if (grid[i][j] == 2) {
							if (i > 0 && grid[i - 1][j] == 1) {
								grid[i - 1][j] = 3;
								neu++;
							}
							if (j > 0 && grid[i][j - 1] == 1) {
								grid[i][j - 1] = 3;
								neu++;
							}
							if (i < grid.length - 1 && grid[i + 1][j] == 1) {
								grid[i + 1][j] = 3;
								neu++;
							}
							if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
								grid[i][j + 1] = 3;
								neu++;
							}
						}
					}
				}
				if (neu == 0 && fresh > 0)
					return -1;
				if ((fresh -= neu) == 0)
					return rst;
				for (int i = 0; i < grid.length; i++) {
					for (int j = 0; j < grid[0].length; j++) {
						if (grid[i][j] == 3) {
							grid[i][j] = 2;
						}
					}
				}
			}
		}
	}
}
