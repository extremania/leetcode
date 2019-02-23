package com.github.extermania.leetcode;

public class $0840_Magic_Squares_In_Grid_85_54 {
	static class Solution {
    	private static boolean isMagic(int[] arr) {
		int[] a = new int[16];
		for(int i:arr) a[i]++;
		for(int i=1; i<10; i++) {
			if(a[i]!=1) return false;
		}
		return  arr[0] + arr[1] + arr[2] == 15 //
				&& arr[3] + arr[4] + arr[5] == 15 //
				&& arr[6] + arr[7] + arr[8] == 15 //
				&& arr[0] + arr[3] + arr[6] == 15 //
				&& arr[1] + arr[4] + arr[7] == 15 //
				&& arr[2] + arr[5] + arr[8] == 15 //
				&& arr[0] + arr[4] + arr[8] == 15 //
				&& arr[2] + arr[4] + arr[6] == 15 //
		;
	}
    public int numMagicSquaresInside(int[][] grid) {
       		if (grid.length < 3 || grid[0].length < 3)
			return 0;
		int cnt = 0;
		for (int i = 0; i < grid.length - 2; i++) {
			for (int j = 0; j < grid[0].length - 2; j++) {
                if(grid[i+1][j+1]!=5) continue;
				if (isMagic(//
						new int[] {
								grid[i][j],grid[i][j+1],grid[i][j+2], //
								grid[i+1][j],grid[i+1][j+1],grid[i+1][j+2], //
								grid[i+2][j],grid[i+2][j+1],grid[i+2][j+2], //
							}
						)) {//
					cnt++;
				}
			}
		}
		return cnt; 
    }
}
}
