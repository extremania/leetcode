package com.github.extermania.leetcode;

public class $0064_Minimum_Path_Sum_100 {
	class Solution {
	    
	    void f(int[][] d, int[][] grid, int i, int j){
	        if(i>=grid.length || j>=grid[0].length) return;
	        d[i][j]=Math.min(d[i-1][j], d[i][j-1])+grid[i][j];
	        for(int k=j+1; k<grid[0].length; k++){
	            d[i][k]=Math.min(d[i-1][k], d[i][k-1])+grid[i][k];
	        }
	        for(int k=i+1; k<grid.length; k++){
	            d[k][j]=Math.min(d[k-1][j], d[k][j-1])+grid[k][j];
	        }
	        f(d, grid, i+1, j+1);
	    }
	    
	    public int minPathSum(int[][] grid) {
	        if(grid.length==0) return 0;
	        int[][] d = new int[grid.length][grid[0].length];
	        d[0][0] = grid[0][0];
	        for(int i=1; i<grid[0].length; i++){
	            d[0][i]=d[0][i-1]+grid[0][i];
	        }
	        for(int i=1; i<grid.length; i++){
	            d[i][0]=d[i-1][0]+grid[i][0];
	        }
	        f(d, grid, 1, 1);
	        return d[grid.length-1][grid[0].length-1];
	    }
	}
}
