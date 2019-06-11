package com.github.extermania.leetcode;

public class $0892_Surface_Area_of_3D_Shapes_99_03 {
	class Solution {
	    public int surfaceArea(int[][] grid) {
	        if(grid.length==0) return 0;
	        int n = 0;
	        for(int i=0; i<grid.length; i++){
	            for(int j=0; j<grid[0].length; j++){
	                if(grid[i][j]!=0){
	                    n+=(2+4*grid[i][j]);
	                    if(i>0) n-=(2*Math.min(grid[i][j], grid[i-1][j]));
	                    if(j>0) n-=(2*Math.min(grid[i][j], grid[i][j-1]));
	                }
	            }
	        }
	        return n;
	    }
	}
}
